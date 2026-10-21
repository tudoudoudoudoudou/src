package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmAdtCfg;
import com.gingkoo.rpt.dbsvr.server.bean.PmAdtCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmAdtCfgMapper extends TableMapper {
    int countByExample(PmAdtCfgExample example);

    int deleteByExample(PmAdtCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmAdtCfg record);

    int insertSelective(PmAdtCfg record);

    List<PmAdtCfg> selectByExample(PmAdtCfgExample example);

    PmAdtCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmAdtCfg record, @Param("example") PmAdtCfgExample example);

    int updateByExample(@Param("record") PmAdtCfg record, @Param("example") PmAdtCfgExample example);

    int updateByPrimaryKeySelective(PmAdtCfg record);

    int updateByPrimaryKey(PmAdtCfg record);
}