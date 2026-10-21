package com.gingkoo.rpt.sys.server;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.api.orm.mybatis.batch.mate.Batchmate;
import com.gingkoo.gal.api.orm.mybatis.exception.UMybatisDataAccessException;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.data.page.Page;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.gui.core.client.utils.StringUtils;
import com.gingkoo.gui.service.server.exception.BizException;
import com.gingkoo.rpt.common.server.*;
import com.gingkoo.rpt.common.server.ContextService;

public class UserMan {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private MyBatisSessionTemplate myBatisSessionTemplate;

	public void setMyBatisSessionTemplate(MyBatisSessionTemplate myBatisSessionTemplate) {
		this.myBatisSessionTemplate = myBatisSessionTemplate;
	}

	/**
	 * 查询已审核用户信息
	 */
	public Page<Object> selectPage(final Map<String, String> header, final Map<String, String> map) {
		if (map != null) {
			// 所属机构代码
			String depart_id = (String) map.get("DEPART_ID");
			if (StringUtils.isBlank(depart_id)) {
				depart_id = null;
			} else {
				depart_id = depart_id.toString().trim();
			}
			// 用户名
			String user_name = (String) map.get("USER_NAME");
			if (StringUtils.isBlank(user_name)) {
				user_name = null;
			} else {
				user_name = "%" + user_name.toString().trim() + "%";
			}
			// 角色名称
			String role_name = (String) map.get("ROLE_NAME");
			if (StringUtils.isBlank(role_name)) {
				role_name = null;
			} else {
				role_name = role_name.toString().trim();
			}
			// 员工姓名
			String staff_name = (String) map.get("STAFF_NAME");
			if (StringUtils.isBlank(staff_name)) {
				staff_name = null;
			} else {
				staff_name = "%" + staff_name.toString().trim() + "%";
			}
			// 用户状态
			String status = (String) map.get("STATUS");
			if (StringUtils.isBlank(status)) {
				status = null;
			} else {
				status = status.toString().trim();
			}
			// 性别
			String gender = (String) map.get("GENDER");
			if (StringUtils.isBlank(gender)) {
				gender = null;
			} else {
				gender = gender.toString().trim();
			}
			String userName = (String) map.get("USER_NAME");
			if (StringUtils.isBlank(userName)) {
				userName = null;
			} else {
				userName = userName.toString().trim();
			}
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("DEPART_ID", depart_id);
			param.put("USER_NAME", user_name);
			param.put("ROLE_NAME", role_name);
			param.put("STAFF_NAME", staff_name);
			param.put("STATUS", status);
			param.put("GENDER", gender);
		}
		String bizSql = BizFuncService.getBizAuthSql("", ContextService.getUserId(header), FuncConstants.TB_USER);
		map.put("bizSql", bizSql);
		map.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		map.put("START_INQ_ORG_ID", header.get("HEAD.START_INQ_ORG_ID"));
		map.put("END_INQ_ORG_ID", header.get("HEAD.END_INQ_ORG_ID"));

		return myBatisSessionTemplate.selectPage("com.gingkoo.rpt.sys.server.SysMan.selectUser", map, BasFuncService.str2Int(header.get("__PAGEINDEX__"), 1), BasFuncService.str2Int(header.get("__COUNT__"), SysParamService.pageSize));
	}

	/**
	 * 新增已审核用户信息
	 */
	public int insertData(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		return myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertUser", map);
	}

	/**
	 * 更新已审核用户信息
	 */
	public int updateData(final Map<String, String> header, final Map<String, String> map) {
		// doEvnet 1 解锁 2 注销用户按钮 3注销登录按钮 4密码重置 5全部重置密码
		Integer doEvent = Integer.valueOf(map.get("doEvent"));
		map.put("MOD_USER", ContextService.getUserName(header));
		map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
		if (doEvent.intValue() == 1) {// 解锁
			map.put("STATUS", "0");
			map.put("FAILURE_LOGIN_COUNT", "0");
		} else if (doEvent.intValue() == 2) {// 注销用户按钮
			map.put("STATUS", "1");
		} else if (doEvent.intValue() == 3) {// 注销登录按钮
			map.put("ONLINE_STATUS", "0");
		} else if (doEvent.intValue() == 4) {// 密码重置或重置密码全部
			if ( (SysParamService.getSysParam("0001|0011") != null) && SysParamService.getSysParam("0001|0011").equals("SHA256"))
				map.put("PASSWORD", SHA256.encode("111111"));
			else
				map.put("PASSWORD", Md5.md5s("111111"));
			map.put("FAILURE_LOGIN_COUNT", "0");
			//map.put("IS_INITIAL_PASSWORD", "1");
			map.put("IS_INITIAL_PASSWORD", "0");
		} else if (doEvent.intValue() == 5) {
			if ( (SysParamService.getSysParam("0001|0011") != null) && SysParamService.getSysParam("0001|0011").equals("SHA256"))
				map.put("PASSWORD", SHA256.encode("111111"));
			else
				map.put("PASSWORD", Md5.md5s("111111"));
			map.put("FAILURE_LOGIN_COUNT", "0");
			//map.put("IS_INITIAL_PASSWORD", "1");
			map.put("IS_INITIAL_PASSWORD", "0");
			try {
				return myBatisSessionTemplate.update("com.gingkoo.rpt.sys.server.SysMan.updateAllUser", map);
			} catch (Exception e) {
				return 0;
			}
		}
		if ((map.get("VARSION_NO") == null) || "".equals(map.get("VARSION_NO"))) {
			map.put("VARSION_NO", String.valueOf(1));
		} else {
			map.put("VARSION_NO", String.valueOf(Integer.valueOf(String.valueOf(map.get("VARSION_NO"))) + 1));
		}
		try {
			return myBatisSessionTemplate.update("com.gingkoo.rpt.sys.server.SysMan.updateUser", map);
		} catch (UMybatisDataAccessException e) {
			logger.error(e.getMessage(), e);
			return 0;
		}

	}

	/**
	 * 更新已审核用户信息 解锁
	 */
	public Map<String, String> updateData1CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("doEvent", "1");
		int count = (Integer) updateData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新已审核用户信息 注销
	 */
	public Map<String, String> updateData2CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("doEvent", "2");
		int count = (Integer) updateData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新已审核用户信息 注销登录
	 */
	public Map<String, String> updateData3CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("doEvent", "3");
		int count = (Integer) updateData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新已审核用户信息 密码重置
	 */
	public Map<String, String> updateData4CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("doEvent", "4");
		int count = (Integer) updateData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新已审核用户信息 密码全部重置
	 */
	public Map<String, String> updateData5CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("doEvent", "5");
		int count = (Integer) updateData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 删除已审核用户信息
	 */
	public int deleteData(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		return myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteUser", map);
	}

	/**
	 * 查询待审核用户信息
	 */
	public Page<Object> selectCheckPage(final Map<String, String> header, final Map<String, String> map) {
		// 查询用户信息录入
		if (map != null) {
			// 所属机构代码
			String depart_id = (String) map.get("DEPART_ID");
			if (StringUtils.isBlank(depart_id)) {
				depart_id = null;
			} else {
				depart_id = depart_id.toString().trim();
			}
			// 用户名
			String user_name = (String) map.get("USER_NAME");
			if (StringUtils.isBlank(user_name)) {
				user_name = null;
			} else {
				user_name = "%" + user_name.toString().trim() + "%";
			}
			// 角色名称
			String role_name = (String) map.get("ROLE_NAME");
			if (StringUtils.isBlank(role_name)) {
				role_name = null;
			} else {
				role_name = role_name.toString().trim();
			}
			// 员工姓名
			String staff_name = (String) map.get("STAFF_NAME");
			if (StringUtils.isBlank(staff_name)) {
				staff_name = null;
			} else {
				staff_name = "%" + staff_name.toString().trim() + "%";
			}
			// 用户状态
			String status = (String) map.get("STATUS");
			if (StringUtils.isBlank(status)) {
				status = null;
			} else {
				status = status.toString().trim();
			}
			// 性别
			String gender = (String) map.get("GENDER");
			if (StringUtils.isBlank(gender)) {
				gender = null;
			} else {
				gender = gender.toString().trim();
			}
			String userName = (String) map.get("USER_NAME");
			if (StringUtils.isBlank(userName)) {
				userName = null;
			} else {
				userName = userName.toString().trim();
			}
			// Map<String, Object> param = new HashMap<String, Object>();
			map.put("DEPART_ID", depart_id);
			map.put("USER_NAME", user_name);
			map.put("ROLE_NAME", role_name);
			map.put("STAFF_NAME", staff_name);
			map.put("STATUS", status);
			map.put("GENDER", gender);
		}
		String bizSql = BizFuncService.getBizAuthSql("", ContextService.getUserId(header), FuncConstants.TB_USER);
		map.put("bizSql", bizSql);
		map.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		map.put("START_INQ_ORG_ID", header.get("HEAD.START_INQ_ORG_ID"));
		map.put("END_INQ_ORG_ID", header.get("HEAD.END_INQ_ORG_ID"));
		return myBatisSessionTemplate.selectPage("com.gingkoo.rpt.sys.server.SysMan.selectCheckUser", map, BasFuncService.str2Int(header.get("__PAGEINDEX__"), 1), BasFuncService.str2Int(header.get("__COUNT__"), SysParamService.pageSize));
	}

	/**
	 * 新增待审核用户信息
	 * 
	 * @return
	 */
	public int insertCheckData(final Map<String, String> header, final Map<String, String> map) {
		boolean initFlag = false;
		if (StringUtils.isBlank(map.get("USER_ID"))) {
			map.put("USER_ID", UUuidUtils.UUID());
			initFlag = true;
		} else {

		}
		if (StringUtils.isBlank(map.get("VARSION_NO"))) {
			map.put("VARSION_NO", String.valueOf(1));
		} else {
			map.put("VARSION_NO", String.valueOf(Integer.valueOf(String.valueOf(map.get("VARSION_NO"))) + 1));
		}
		
		String userName = ContextService.getUserName(header);
		String date = DateUtilsC.timeToNumber(new Date());
		Map<String, String> CORP_ID = new HashMap<String, String>();
		CORP_ID.put("USER_ID", ContextService.getUserId(header));
//		String corpId = (String)myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectCorpId", CORP_ID);
//		map.put("CORP_ID", corpId);
		map.put("CORP_ID", header.get("HEAD.corp_id"));
		map.put("CHECK_USER", "");
		map.put("CHECK_DATE", "");
		map.put("CREATER", userName);
		map.put("CREATED_DATE", date);
		map.put("MOD_USER", userName);
		map.put("MOD_DATE", date);
		// 将密码修改次数置为0，使用户第一次登录系统不用修改密码
		//项目组要求修改角色后不再强制修改密码
//		map.put("IS_INITIAL_PASSWORD", "1");
		// 审核状态01-未审核
		map.put("CHECK_STATUS", "01");
		// //操作类型;02-修改
		// map.put("OPT_TYPE", "02");
		// 拒绝原因
		String status = map.get("STATUS");
		if(status == null || "".equals(status)){
			map.put("STATUS", "0");
		}
		map.put("UNCHECK_INFO", "");
		map.put("BANK", Constants.BANK);
		map.put("APPLICATION", Constants.APPLICATION);
		if (StringUtils.isBlank(map.get("ONLINE_STATUS"))) {
			map.put("ONLINE_STATUS", "0");
		}
		if (StringUtils.isBlank(map.get("FAILURE_LOGIN_COUNT"))) {
			map.put("FAILURE_LOGIN_COUNT", "0");
		}
		if (StringUtils.isBlank(map.get("IS_INITIAL_PASSWORD"))) {
			if(initFlag){
				//map.put("IS_INITIAL_PASSWORD", "1");
				map.put("IS_INITIAL_PASSWORD", "0");
			}else{
				map.put("IS_INITIAL_PASSWORD", "0");
			}
		}

		if (StringUtils.isBlank(map.get("PASSWORD"))) {
			if ( (SysParamService.getSysParam("0001|0011") != null) && SysParamService.getSysParam("0001|0011").equals("SHA256"))
				map.put("PASSWORD", SHA256.encode("111111"));
			else
				map.put("PASSWORD", Md5.md5s("111111"));
		} else {
			// map.put("PASSWORD", Md5.md5s(map.get("PASSWORD")));
		}

		Integer count1 = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.checkUserName", map);
		Integer count2 = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.checkPendingUserName", map);
		if (count1 != 0 || count2 != 0) {
			return -1;
		}
		
		//用户赋值角色
		if(initFlag){
			String roldId = map.get("selectRoles");
			if(StringUtils.isNotBlank(roldId)){
				if (roldId != null && (!"".equals(roldId))) {
					String[] ids = roldId.split(",");
					for (int i = 0; i < ids.length; i++) {
						map.put("ROLE_ID", ids[i]);
						myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2RoleSingle", map);
					}
				}
			}
		}
		
		
		System.out.println("Map:" + map);
		// 新增用户角色关系到待审核用户角色关系表中
		int count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectFuncCount", map.get("USER_ID").toString());
		if (count == 0) {
			try {
				// 新增用户到待审核表中
				return myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser", map);
			} catch (UMybatisDataAccessException e) {
				logger.error(e.getMessage(), e);
				return 0;
			}
		} else {
			return 0;
		}

	}

	/**
	 * 新增待审核用户信息
	 * 
	 * @return
	 */
	public Map<String, String> insertCheckDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("OPT_TYPE", "01");
		int count = (Integer) insertCheckData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}
	
	/**
	 * 新增用户名不能重复判断
	 * 
	 * @return
	 */
	public Map<String, String> insertCheckDataCallBack2(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		int count = 0;
		Integer count1 = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.checkUserName", map);
		Integer count2 = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.checkPendingUserName", map);
		if (count1 != 0 || count2 != 0) {		
			count = -1;		
		}
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
		
	}


	public int insertDelData(final Map<String, String> header, final Map<String, String> map) {
		int count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectFuncCount", map.get("USER_ID").toString());
		if (count == 0) {
			map.put("VARSION_NO", String.valueOf(Integer.valueOf(String.valueOf(map.get("VARSION_NO"))) + 1));
			map.put("CHECK_USER", "");
			map.put("CHECK_DATE", "");
			map.put("MOD_USER", ContextService.getUserName(header));
			map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
			// 审核状态01-未审核
			map.put("CHECK_STATUS", "01");
			// 操作类型;02-修改
			map.put("OPT_TYPE", "03");
			// 拒绝原因
			map.put("UNCHECK_INFO", "");

			myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertDelUser", map);
			try {
				// 新增用户到待审核表中
				return myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser", map);
			} catch (UMybatisDataAccessException e) {
				logger.error(e.getMessage(), e);
				return 0;
			}
		} else if (count > 0) {
			// throw new BusiException("当前用户已存在待审核记录，请到待审核Tab页中修改");
			return 0;
		}
		return 0;
	}

	public Map<String, String> insertDelDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("OPT_TYPE", "03");
		int count = (Integer) insertCheckData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新待审核用户信息
	 * 
	 * @return
	 */
	public int updateCheckData(final Map<String, String> header, final Map<String, String> map) {
		Integer canSave = Integer.valueOf(map.get("saveable"));
		if (canSave.intValue() == 1) {
			Integer varsionNO = getVarsionNo((String) map.get("USER_ID"));
			Integer MapVarsionNo = Integer.valueOf(String.valueOf(map.get("VARSION_NO")));
			if (MapVarsionNo.intValue() != varsionNO.intValue()) {
				return 0;
				// throw new BusiException("当前用户已被修改，保存失败");
			}
			if (StringUtils.isBlank(map.get("PASSWORD"))) {

			} else {
				// map.put("PASSWORD", Md5.md5s(map.get("PASSWORD")));
			}
			map.put("CORP_ID", header.get("HEAD.corp_Id"));
			map.put("VARSION_NO", String.valueOf(Integer.valueOf(String.valueOf(map.get("VARSION_NO"))) + 1));
			map.put("CHECK_USER", "");
			map.put("CHECK_DATE", "");
			map.put("MOD_USER", ContextService.getUserName(header));
			map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
			String status = map.get("STATUS");
			if(status == null || "".equals(status)){
				map.put("STATUS", "0");
			}
			// 将密码修改次数置为0，使用户第一次登录系统不用修改密码
			map.put("IS_INITIAL_PASSWORD", "0");
			// 审核状态01-未审核
			map.put("CHECK_STATUS", "01");
			// 操作类型;02-修改
			map.put("OPT_TYPE", "03");
			// 拒绝原因
			map.put("UNCHECK_INFO", "");
			// 角色信息
			/*
			 * String role_id = (String) map.get("ROLE_ID"); if (role_id != null
			 * && (!"".equals(role_id)) && role_id.split(",").length == 1) {
			 * role_id = role_id.split(",")[0].replace(",", ""); }
			 * map.put("ROLE_ID", role_id);
			 */

			// 添加事务
			// 新增用户角色关系到待审核用户角色关系表中
			int count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectFuncCount", map);
			if (count == 0) {
				System.out.println("MAP" + map);
			try {
//				myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2Role", map);
				/*
				 * if (role_id != null && (!"".equals(role_id)) &&
				 * role_id.split(",").length == 1) { String[] ids =
				 * role_id.split(","); for (int i = 0; i < ids.length; i++) {
				 * map.put("ROLE_ID", role_id); myBatisSessionTemplate .insert(
				 * "com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2RoleSingle",
				 * map); } }
				 */
				//修改的时候删除掉tb_user表中的信息 update by ljy
				//myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteUser", map);
				
				map.put("flag", "updateRole");
				insertRole(header, map);
				myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.saveSetNoTree2", map);
				// 新增用户到待审核表中
				
				return myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser", map);
				} catch (UMybatisDataAccessException e) {
					logger.error(e.getMessage(), e);
					return 0;
				}
			}
			return 1;

		} else if (canSave.intValue() == 2) {
			map.put("MOD_USER", ContextService.getUserName(header));
			map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
			// 审核状态
			String CHECK_STATUS;
			if (map.get("CHECK_STATUS") == null || "".equalsIgnoreCase((String) map.get("CHECK_STATUS")) || "01".equalsIgnoreCase((String) map.get("CHECK_STATUS"))) {
				CHECK_STATUS = "01";// 未审核
			} else {
				CHECK_STATUS = "03";// 已修改
			}
			;
			map.put("CHECK_STATUS", CHECK_STATUS);
			String role_id = (String) map.get("ROLE_ID");
			/*
			 * if (role_id != null && (!"".equals(role_id)) &&
			 * role_id.split(",").length == 1) { role_id =
			 * role_id.split(",")[0].replace(",", ""); } map.put("ROLE_ID",
			 * role_id);
			 */
			// 将当前记录新增到待审核用户角色关系表中
			System.out.println("MAP" + map);
		try {
//			    myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2Role", map);
			insertRole(header, map);
			// 更新用户待审核表中的信息
				return myBatisSessionTemplate.update("sysrManSql.updateCheckUser", map);
			} catch (UMybatisDataAccessException e) {
				logger.error(e.getMessage(), e);
				return 0;
			}
		} else {
			return 0;
		}

	}

	/**
	 * 更新待审核用户信息
	 * 
	 * @return
	 */
	public Map<String, String> updateCheckDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("saveable", "1");
		map.put("OPT_TYPE", "03");
		int count = (Integer) updateCheckData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 更新待审核用户信息
	 * 
	 * @return
	 */
	public Map<String, String> updateCheckData1CallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("saveable", "2");
		int count = (Integer) updateCheckData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 确认修改待审核用户信息
	 * 
	 * @return
	 */
	public int updateCheckDataConfirm(final Map<String, String> header, final Map<String, String> map) {
		String modUser = (String) map.get("MOD_USER");
		String flag =  (String) map.get("flag");
	if (modUser == null || modUser.equals(ContextService.getUserName(header))){
		if("1".equals(flag)){
			map.put("CHECK_STATUS", "04");
		}else{		
				map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
				map.put("OPT_TYPE", "03");
			if ("02".equals(map.get("CHECK_STATUS"))) {
				map.put("CHECK_STATUS", "01");
			}
		}
		String status = map.get("STATUS");
		if(status == null || "".equals(status)){
			map.put("STATUS", "0");
		}
		try {
			return myBatisSessionTemplate.update("com.gingkoo.rpt.sys.server.SysMan.updateCheckUser", map);
		} catch (UMybatisDataAccessException e) {
			logger.error(e.getMessage(), e);
			return 0;
		}
	}else{
		return -2;
	}
}

	/**
	 * 确认修改待审核用户信息
	 * 
	 * @return
	 */
	public Map<String, String> updateCheckDataConfirmCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		int count = (Integer) updateCheckDataConfirm(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	public boolean check(String userId) {
		int count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.check", userId);
		if (count == 0) {
			return false;
		}
		return true;
	}

	public boolean checkPending(String userId) {
		int count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.checkPending", userId);
		if (count == 0) {
			return false;
		}
		return true;
	}

	/**
	 * 删除用户信息
	 * 
	 * @return
	 */
	public 	Map<String, String> delDataCallBack(final Map<String, String> header, final Map<String, String> map) {
		Map<String, String> ret = new HashMap<String, String>();
		try{
			
			
				//增加到待审核表用户表中
				map.put("MOD_USER", ContextService.getUserName(header));
				myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.insertDelDataCallBack", map);
				map.put("flag", "updateRole");
				insertRole(header, map);		
				// 删除用户信息表中的对应记录
				//myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.delDataCallBack", map);
				
				// 删除用户权限表中的对应记录
				myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.saveSetNoTree2", map);
			} catch (UMybatisDataAccessException e) { 
				logger.error(e.getMessage(), e);
				ret.put("ret", "0");
				return ret;
			}
		ret.put("ret", "-1");
		return ret;
	}
	
	
	
	/**
	 * 删除待审核用户信息
	 * 
	 * @return
	 */
	public int deleteCheckData(final Map<String, String> header, final Map<String, String> map) {
		String modUser = (String) map.get("MOD_USER");
		if (modUser == null || modUser.equals(ContextService.getUserName(header))) {
			// 删除对应的用户角色关系待审核表
		try {
			myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser2Role", map);

			// 删除待审用户信息表中的对应记录
			myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree", map);

			// 删除待审用户信息表中的对应记录
			
			return myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser", map);
			} catch (UMybatisDataAccessException e) {
				logger.error(e.getMessage(), e);
				return 0;
			}

		} else {// 该记录已被他人修改不能删除
			return -2;
			// throw new BusiException("该记录已被他人修改不能删除");
		}
	}

	/**
	 * 删除待审核用户信息
	 * 
	 * @return
	 */
	public Map<String, String> deleteCheckDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		int count = (Integer) deleteCheckData(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	public int selectCountUser(String userName) {
		int i = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectUserCount", userName);
		int j = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectUserPendingCount", userName);
		return i + j;
	}

	public List<Map<String, String>> listSetNoTree(final Map<String, String> header, final Map<String, String> map) {
		return myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.listSetNoTree", map);
	}

	public List<Map<String, String>> listSetNoTreePending(final Map<String, String> header, final Map<String, String> map) {
		return myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.listSetNoTreePending", map);
	}

	public int saveTree(Map<String, String> header, String userId, List<Map<String, String>> list) {

	    try{
		Iterator<Map<String, String>> iterator = list.iterator();
		Batchmate[] batchmates = new Batchmate[list.size() + 3];
		Map<String, String> param = new HashMap<String, String>();
		param.put("USER_ID", userId);
		Batchmate batchmate0 = new Batchmate();
		batchmate0.setStatement("com.gingkoo.rpt.sys.server.SysMan.insertFunc");
		batchmate0.setParameter(param);
		batchmate0.setOptType(Batchmate.TYPE.INSERT);
		batchmates[0] = batchmate0;
		Batchmate batchmate1 = new Batchmate();
		batchmate1.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree");
		batchmate1.setParameter(param);
		batchmate1.setOptType(Batchmate.TYPE.DELETE);
		batchmates[1] = batchmate1;

		Batchmate batchmate2 = new Batchmate();
		batchmate2.setStatement("com.gingkoo.rpt.sys.server.SysMan.insertDelUser");
		batchmate2.setParameter(param);
		batchmate2.setOptType(Batchmate.TYPE.INSERT);
		batchmates[2] = batchmate2;

		for (int i = 0; i < list.size(); i++) {
			Map<String, String> map = list.get(i);
			Batchmate tmpBatchmate = new Batchmate();
			tmpBatchmate.setStatement("com.gingkoo.rpt.sys.server.SysMan.saveSetNoTree");
			tmpBatchmate.setParameter(map);
			tmpBatchmate.setOptType(Batchmate.TYPE.INSERT);
			batchmates[i + 3] = tmpBatchmate;
		}
		myBatisSessionTemplate.batch(batchmates);
		
	    }catch(UMybatisDataAccessException e)
	    {
	    	logger.error(e.getMessage(), e);
	        return 0;
	    }
		return 1;
	}

	public Callback saveTreeCallBack(Map<String, String> header, List<Map<String, String>> list) {
		Callback rb = new CallbackImpl();
		// System.out.print(list);
		int count = (Integer) saveTree(header, ((Map<String, String>) list.get(0)).get("USER_ID"), list);
		if (count == 0) {
			rb.setErrorCode("-1");
			rb.setErrorMessage("保存数据权限信息失败!");
			return rb;
		}

		rb.setSuccessMessage("保存数据权限信息成功!");
		return rb;
	}

	public int saveTreePending(Map<String, String> header, String userId, String modUserId, String modDate, List<Map<String, String>> list) {
		Iterator<Map<String, String>> iterator = list.iterator();
		Batchmate[] batchmates = new Batchmate[list.size() + 2];
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("USER_ID", userId);
		param.put("MOD_USER", ContextService.getUserName(header));
		param.put("MOD_DATE", modDate);
		Batchmate batchmate0 = new Batchmate();
		batchmate0.setStatement("com.gingkoo.rpt.sys.server.SysMan.updateFunc");
		batchmate0.setParameter(param);
		batchmate0.setOptType(Batchmate.TYPE.UPDATE);
		batchmates[0] = batchmate0;
		Batchmate batchmate1 = new Batchmate();
		batchmate1.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree");
		Map<String, Object> tmpMap = new HashMap<String, Object>();
		tmpMap.put("USER_ID", userId);
		batchmate1.setParameter(tmpMap);
		batchmate1.setOptType(Batchmate.TYPE.DELETE);
		batchmates[1] = batchmate1;
		for (int i = 0; i < list.size(); i++) {
			Map<String, String> map = list.get(i);
			Batchmate tmpBatchmate = new Batchmate();
			tmpBatchmate.setStatement("com.gingkoo.rpt.sys.server.SysMan.saveSetNoTree");
			tmpBatchmate.setParameter(map);
			tmpBatchmate.setOptType(Batchmate.TYPE.INSERT);
			batchmates[i + 2] = tmpBatchmate;
		}
		try {
			myBatisSessionTemplate.batch(batchmates);
		} catch (UMybatisDataAccessException e) {
			logger.error(e.getMessage(), e);
			return 0;
		}
		return 1;
	}

	public Callback saveTreePendingCallBack(Map<String, String> header, List<Map<String, String>> list) {
		Callback rb = new CallbackImpl();
		int count = (Integer) saveTreePending(header, ((Map<String, String>) list.get(0)).get("USER_ID"), ContextService.getUserId(header), DateUtilsC.timeToNumber(new Date()), list);

		if (count == 0) {
			rb.setErrorCode("-1");
			rb.setErrorMessage("保存数据权限信息失败!");
			return rb;
		}

		rb.setSuccessMessage("保存数据权限信息成功!");
		return rb;
	}

	public int selectCount(String userId) {
		Integer count = (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.selectFuncCount", userId);
		return count.intValue();
	}

	public Map<String, String> selectCountCallBack(final Map<String, String> header, final Map<String, String> map) {
		int count = (Integer) selectCount(map.get("USER_ID"));
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	public Integer getVarsionNo(String userId) {
		return (Integer) myBatisSessionTemplate.selectOne("com.gingkoo.rpt.sys.server.SysMan.getVarsionNo", userId);
	}

	public int updateCheckRole(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("CORP_ID", header.get("HEAD.corp_id"));
		map.put("MOD_USER", ContextService.getUserName(header));
		map.put("MOD_DATE", DateUtilsC.timeToNumber(new Date()));
		String userPendingFlag = map.get("userPendingFlag");
		String role_id = (String) map.get("ROLE_ID");
		String ckStatus = (String) map.get("CHECK_STATUS");
		if (role_id != null && (!"".equals(role_id)) && role_id.split(",").length == 1) {
			role_id = role_id.split(",")[0].replace(",", "");
		}
		map.put("ROLE_ID", role_id);

		// if (Integer.valueOf(map.get("doOkEvent")) == 1) {
		map.put("OPT_TYPE", "03");
		String status = map.get("STATUS");
		if(status == null || "".equals(status)){
			map.put("STATUS", "0");
		}
		// 审核状态01-未审核
		map.put("CHECK_STATUS", "01");
		map.put("flag", "");
		// 删除对应的待审核信息
		try {
			//修改的时候删除掉tb_user表中的信息 update by ljy
//			myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteUser", map);
			if(StringUtils.isBlank(userPendingFlag)){
				myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser", map);
			}else{
				
					map.put("CHECK_STATUS", "01");
					map.put("OPT_TYPE", "03");
					myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.updateCheckUser", map);
			// 将当前记录新增到待审核用户角色关系表中
//			myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2Role", map);
			}
			myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser2Role", map);
			insertRole(header, map);
		} catch (UMybatisDataAccessException e) {
			logger.error(e.getMessage(), e);
			return 0;
		}
		return 1;
	}

	public Map<String, String> updateCheckRoleCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		int count = (Integer) updateCheckRole(header, map);
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	public int insertRole(final Map<String, String> header, final Map<String, String> map) {
		String flag = map.get("flag");
		if("".equals(flag) || null == flag){
			String roldId = map.get("ROLE_ID");
//			myBatisSessionTemplate.delete("com.gingkoo.rpt.sys.server.SysMan.deleteUser2Role", map);
			if (roldId != null && (!"".equals(roldId))) {
				String[] ids = roldId.split(",");
				for (int i = 0; i < ids.length; i++) {
					map.put("ROLE_ID", ids[i]);
					myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2RoleSingle", map);
				}
			}
		}else{
			List<String> roles = myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.getUserRoles",map);
			if (roles != null && (!"".equals(roles))) {
				for (int i = 0; i < roles.size(); i++) {
					map.put("ROLE_ID", roles.get(i));
					myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2RoleSingle", map);
				}
			}
		}
		// myBatisSessionTemplate.insert("com.gingkoo.rpt.sys.server.SysMan.insertCheckUser2Role",
		// map);
		return 1;
	}

	public List<Map<String, String>> listUserInfo() {
		return myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.listUserNameIdInfo");
	}

	public Page<Object> selectCheckPage2(final Map<String, String> header, final Map<String, String> map) {

		// 查询用户信息录入
		if (map != null) {
			// 所属机构代码
			String depart_id = (String) map.get("DEPART_ID");
			do {
				if (StringUtils.isBlank(depart_id)) {
					depart_id = null;
				} else {
					depart_id = depart_id.trim();
				}
			} while ("".equals(depart_id));
			// 用户名
			String user_name = (String) map.get("USER_NAME");
			do {
				if (StringUtils.isBlank(user_name)) {
					user_name = null;
				} else {
					user_name = user_name.trim();
				}
			} while ("".equals(user_name));
			// 角色名称
			String role_name = (String) map.get("ROLE_NAME");
			do {
				if (StringUtils.isBlank(role_name)) {
					role_name = null;
				} else {
					role_name = role_name.trim();
				}
			} while ("".equals(role_name));
			// 员工姓名
			String staff_name = (String) map.get("STAFF_NAME");
			do {
				if (StringUtils.isBlank(staff_name)) {
					staff_name = null;
				} else {
					staff_name = staff_name.trim();
				}
			} while ("".equals(staff_name));
			// 用户状态
			String status = (String) map.get("STATUS");
			do {
				if (StringUtils.isBlank(status)) {
					status = null;
				} else {
					status = status.trim();
				}
			} while ("".equals(status));
			// 性别
			String gender = (String) map.get("GENDER");
			do {
				if (StringUtils.isBlank(gender)) {
					gender = null;
				} else {
					gender = gender.trim();
				}
			} while ("".equals(gender));
			map.put("DEPART_ID", depart_id);
			map.put("USER_NAME", user_name);
			map.put("ROLE_NAME", role_name);
			map.put("STAFF_NAME", staff_name);
			map.put("STATUS", status);
			map.put("GENDER", gender);
		}
		String bizSql = BizFuncService.getBizAuthSql("A", ContextService.getUserId(header), FuncConstants.TB_USER_PENDING);
		map.put("bizSql", bizSql);
		map.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		map.put("START_INQ_ORG_ID", header.get("HEAD.START_INQ_ORG_ID"));
		map.put("END_INQ_ORG_ID", header.get("HEAD.END_INQ_ORG_ID"));
		return myBatisSessionTemplate.selectPage("com.gingkoo.rpt.sys.server.SysMan.selectCheckUser2", map, BasFuncService.str2Int(header.get("__PAGEINDEX__"), 1), BasFuncService.str2Int(header.get("__COUNT__"), SysParamService.pageSize));

	}

	/**
	 * 审核用户
	 * 
	 * @return
	 */
	public int checkData(final Map<String, String> header, final Map<String, String> map) {
		map.put("CHECK_USER", ContextService.getUserName(header));
		map.put("CHECK_DATE", DateUtilsC.timeToNumber(new Date()));
		map.put("BANK", Constants.BANK);
		map.put("APPLICATION", Constants.APPLICATION);
		// 加事务
		// 删除已审核表中对应的用户信息
		try {
			int cSount = 0;
			deleteData(header, map);
			String optType = (String) map.get("OPT_TYPE");
			if (optType != null && !"04".equals(optType)) {
				List<Batchmate> batch = new ArrayList();

				Batchmate batchmate1 = new Batchmate();
				batchmate1.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteUser2Role");
				batchmate1.setParameter(map);
				batchmate1.setOptType(Batchmate.TYPE.DELETE);
				batch.add(batchmate1);

				Batchmate batchmate9 = new Batchmate();
				batchmate9.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteUser");
				batchmate9.setParameter(map);
				batchmate9.setOptType(Batchmate.TYPE.DELETE);
				batch.add(batchmate9);

				// 将当前待审核信息插入到已审核表中
				Batchmate batchmate2 = new Batchmate();
				batchmate2.setStatement("com.gingkoo.rpt.sys.server.SysMan.insertUser");
				batchmate2.setParameter(map);
				batchmate2.setOptType(Batchmate.TYPE.INSERT);
				batch.add(batchmate2);
				Batchmate batchmate3 = new Batchmate();
				batchmate3.setStatement("com.gingkoo.rpt.sys.server.SysMan.insertUser2RoleBatch");
				batchmate3.setParameter(map);
				batchmate3.setOptType(Batchmate.TYPE.INSERT);
				batch.add(batchmate3);

				// 删除待审核表中的信息
				Batchmate batchmate4 = new Batchmate();
				batchmate4.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser");
				batchmate4.setParameter(map);
				batchmate4.setOptType(Batchmate.TYPE.DELETE);
				batch.add(batchmate4);
				// 删除用户角色关系待审核表对应数据
				Batchmate batchmate5 = new Batchmate();
				batchmate5.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser2Role");
				batchmate5.setParameter(map);
				batchmate5.setOptType(Batchmate.TYPE.DELETE);
				batch.add(batchmate5);

				Batchmate batchmate6 = new Batchmate();
				batchmate6.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree1");
				batchmate6.setParameter(map);
				batchmate6.setOptType(Batchmate.TYPE.DELETE);

				Batchmate batchmate7 = new Batchmate();
				batchmate7.setStatement("com.gingkoo.rpt.sys.server.SysMan.saveSetNoTree1");
				batchmate7.setParameter(map);
				batchmate7.setOptType(Batchmate.TYPE.INSERT);

				Batchmate batchmate8 = new Batchmate();
				batchmate8.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree");
				batchmate8.setParameter(map);
				batchmate8.setOptType(Batchmate.TYPE.DELETE);

				Batchmate[] batchmates = { batchmate1, batchmate9, batchmate2, batchmate3, batchmate4, batchmate5, batchmate6, batchmate7, batchmate8 };

				myBatisSessionTemplate.batch(batchmates);
				return 1;
			} else {

				Batchmate batchmate1 = new Batchmate();
				batchmate1.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteUser2Role");
				batchmate1.setParameter(map);
				batchmate1.setOptType(Batchmate.TYPE.DELETE);
				// 删除待审核表中的信息
				Batchmate batchmate2 = new Batchmate();
				batchmate2.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser");
				batchmate2.setParameter(map);
				batchmate2.setOptType(Batchmate.TYPE.DELETE);
				// 删除用户角色关系待审核表对应数据
				Batchmate batchmate3 = new Batchmate();
				batchmate3.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteCheckUser2Role");
				batchmate3.setParameter(map);
				batchmate3.setOptType(Batchmate.TYPE.DELETE);
				Batchmate batchmate4 = new Batchmate();
				batchmate4.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree1");
				batchmate4.setParameter(map);
				batchmate4.setOptType(Batchmate.TYPE.DELETE);

				Batchmate batchmate5 = new Batchmate();
				batchmate5.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteSetNoTree");
				batchmate5.setParameter(map);
				batchmate5.setOptType(Batchmate.TYPE.DELETE);

				List<Batchmate> batch = new ArrayList();
				batch.add(batchmate1);
				batch.add(batchmate2);
				batch.add(batchmate3);
				batch.add(batchmate4);
				batch.add(batchmate5);
				List list = myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.selectUpOrDel", map);
				Iterator it = list.iterator();
				int i = 5;
				while (it.hasNext()) {
					Map lmap = (Map) it.next();
					String EMAIL_GROUPCODE = (String) lmap.get("EMAIL_GROUPCODE");
					int instr = Integer.valueOf(lmap.get("INSTR").toString());
					int num = Integer.valueOf(lmap.get("NUM").toString());
					if (instr == 1 && num == 1) {
						map.put("EMAIL_GROUPCODE", EMAIL_GROUPCODE);
						Batchmate batchmatei = new Batchmate();
						batchmatei.setStatement("com.gingkoo.rpt.sys.server.SysMan.updateByUserid");
						batchmatei.setParameter(map);
						batchmatei.setOptType(Batchmate.TYPE.UPDATE);
						batch.add(batchmatei);
					} else if (num > 1 && instr == 1) {
						map.put("EMAIL_GROUPCODE", EMAIL_GROUPCODE);
						Batchmate batchmatei = new Batchmate();
						batchmatei.setStatement("com.gingkoo.rpt.sys.server.SysMan.deleteByUserid");
						batchmatei.setParameter(map);
						batchmatei.setOptType(Batchmate.TYPE.DELETE);
						batch.add(batchmatei);
					}
				}

				Batchmate[] batchmates = batch.toArray(new Batchmate[batch.size()]);

				myBatisSessionTemplate.batch(batchmates);
				return 1;
			}
		} catch (BusiException e) {
			logger.error(e.getMessage(), e);
			return 0;
			// throw new BusiException(e);
		}
	}

	/**
	 * 审核用户
	 * 
	 * @return
	 * @throws BizException 
	 */
	public Map<String, String> checkDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException, BizException {
		Map<String, String> ret = new HashMap<String, String>();
		String result = checkIfSamePerson(header, map);
		if("2".equals(result)){
			ret.put("ret", "2");
			return ret;
		}
		int count = (Integer) checkData(header, map);
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 拒绝待审核用户
	 */
	public int unCheckData(final Map<String, String> header, final Map<String, String> map) throws BusiException {
		map.put("CHECK_USER", ContextService.getUserName(header));
		map.put("CHECK_DATE", DateUtilsC.timeToNumber(new Date()));
		// 状态为02-拒绝
		map.put("CHECK_STATUS", "02");
		try {
			return myBatisSessionTemplate.update("com.gingkoo.rpt.sys.server.SysMan.unCheckUser", map);
		} catch (UMybatisDataAccessException e) {
			logger.error(e.getMessage(), e);
			return 0;
		}
	}

	/**
	 * 拒绝待审核用户
	 * @throws BizException 
	 */
	public Map<String, String> unCheckDataCallBack(final Map<String, String> header, final Map<String, String> map) throws BusiException, BizException {
		Map<String, String> ret = new HashMap<String, String>();
		String result = checkIfSamePerson(header, map);
		if("2".equals(result)){
			ret.put("ret", "2");
			return ret;
		}
		int count = (Integer) unCheckData(header, map);
		ret.put("ret", String.valueOf(count));
		return ret;
	}

	/**
	 * 查询用户角色
	 */
	public List<Map<String, String>> selectUserRole(final Map<String, String> header, final Map<String, String> map) {
		map.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		return myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.selectUserRole", map);
	}

	/**
	 * 查询用户角色待审核
	 */
	public List<Map<String, String>> selectUserRolePending(final Map<String, String> header, final Map<String, String> map) {
		map.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		return myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.selectUserRolePending", map);
	}
	
	/**
	 * 查询部门
	 */
	public Callback selectGroupId(final Map<String, String> header, final Map<String, String> dataMap) {
		dataMap.put("CORP_ID", ContextService.getContext(header,"HEAD.CORP_ID",null));
		List groupList = (List) myBatisSessionTemplate.selectList("com.gingkoo.rpt.sys.server.SysMan.selectGroupId", dataMap);

		Callback cb = new CallbackImpl();
		cb.setCallbackData(groupList);
		return cb;
	}

	public String checkIfSamePerson(Map<String, String> header, Map<String, String> map) throws BizException{
		String isVerified=SysParamService.sysParamMap.get("0999|0001").get("PARAM_VAL");
		String ret = "";
		//当isVerified为N时，无需进行校验，是测试用；为Y时，需进行校验
		if("Y".equals(isVerified)){
			//判断补录人和审核人是否是同一个人-------AddedByCiel151130
			String currentLoginUserName = header.get("HEAD.username");
			String changeUsername=map.get("MOD_USER");
			if(currentLoginUserName.equals(changeUsername)){
				logger.error("非法审核");
				ret = "2";
				return ret;
			}
		}
		return "";
	}
}
