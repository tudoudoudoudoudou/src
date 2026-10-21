package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisAdtCfg;
import com.gingkoo.rpt.dbsvr.server.bean.HisAdtCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisAdtCfgMapper extends TableMapper {
    int countByExample(HisAdtCfgExample example);

    int deleteByExample(HisAdtCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisAdtCfg record);

    int insertSelective(HisAdtCfg record);

    List<HisAdtCfg> selectByExample(HisAdtCfgExample example);

    HisAdtCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisAdtCfg record, @Param("example") HisAdtCfgExample example);

    int updateByExample(@Param("record") HisAdtCfg record, @Param("example") HisAdtCfgExample example);

    int updateByPrimaryKeySelective(HisAdtCfg record);

    int updateByPrimaryKey(HisAdtCfg record);
}