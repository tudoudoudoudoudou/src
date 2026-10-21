package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbUserRole;
import com.gingkoo.rpt.dbsvr.server.bean.TbUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUserRoleMapper extends TableMapper {
    int countByExample(TbUserRoleExample example);

    int deleteByExample(TbUserRoleExample example);

    int insert(TbUserRole record);

    int insertSelective(TbUserRole record);

    List<TbUserRole> selectByExample(TbUserRoleExample example);

    int updateByExampleSelective(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByExample(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);
}