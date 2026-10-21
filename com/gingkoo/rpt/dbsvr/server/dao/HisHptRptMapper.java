package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisHptRptMapper extends TableMapper {
    int countByExample(HisHptRptExample example);

    int deleteByExample(HisHptRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisHptRpt record);

    int insertSelective(HisHptRpt record);

    List<HisHptRpt> selectByExample(HisHptRptExample example);

    HisHptRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisHptRpt record, @Param("example") HisHptRptExample example);

    int updateByExample(@Param("record") HisHptRpt record, @Param("example") HisHptRptExample example);

    int updateByPrimaryKeySelective(HisHptRpt record);

    int updateByPrimaryKey(HisHptRpt record);
}