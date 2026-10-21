package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptRateCfg;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptRateCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisHptRateCfgMapper extends TableMapper {
    int countByExample(HisHptRateCfgExample example);

    int deleteByExample(HisHptRateCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisHptRateCfg record);

    int insertSelective(HisHptRateCfg record);

    List<HisHptRateCfg> selectByExample(HisHptRateCfgExample example);

    HisHptRateCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisHptRateCfg record, @Param("example") HisHptRateCfgExample example);

    int updateByExample(@Param("record") HisHptRateCfg record, @Param("example") HisHptRateCfgExample example);

    int updateByPrimaryKeySelective(HisHptRateCfg record);

    int updateByPrimaryKey(HisHptRateCfg record);
}