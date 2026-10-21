package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptRateCfg;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptRateCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmHptRateCfgMapper extends TableMapper {
    int countByExample(PmHptRateCfgExample example);

    int deleteByExample(PmHptRateCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmHptRateCfg record);

    int insertSelective(PmHptRateCfg record);

    List<PmHptRateCfg> selectByExample(PmHptRateCfgExample example);

    PmHptRateCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmHptRateCfg record, @Param("example") PmHptRateCfgExample example);

    int updateByExample(@Param("record") PmHptRateCfg record, @Param("example") PmHptRateCfgExample example);

    int updateByPrimaryKeySelective(PmHptRateCfg record);

    int updateByPrimaryKey(PmHptRateCfg record);
}