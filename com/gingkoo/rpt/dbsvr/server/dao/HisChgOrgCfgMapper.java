package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisChgOrgCfg;
import com.gingkoo.rpt.dbsvr.server.bean.HisChgOrgCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisChgOrgCfgMapper extends TableMapper {
    int countByExample(HisChgOrgCfgExample example);

    int deleteByExample(HisChgOrgCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisChgOrgCfg record);

    int insertSelective(HisChgOrgCfg record);

    List<HisChgOrgCfg> selectByExample(HisChgOrgCfgExample example);

    HisChgOrgCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisChgOrgCfg record, @Param("example") HisChgOrgCfgExample example);

    int updateByExample(@Param("record") HisChgOrgCfg record, @Param("example") HisChgOrgCfgExample example);

    int updateByPrimaryKeySelective(HisChgOrgCfg record);

    int updateByPrimaryKey(HisChgOrgCfg record);
}