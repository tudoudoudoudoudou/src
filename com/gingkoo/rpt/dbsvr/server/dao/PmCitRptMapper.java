package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmCitRptMapper extends TableMapper {
    int countByExample(PmCitRptExample example);

    int deleteByExample(PmCitRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmCitRpt record);

    int insertSelective(PmCitRpt record);

    List<PmCitRpt> selectByExample(PmCitRptExample example);

    PmCitRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmCitRpt record, @Param("example") PmCitRptExample example);

    int updateByExample(@Param("record") PmCitRpt record, @Param("example") PmCitRptExample example);

    int updateByPrimaryKeySelective(PmCitRpt record);

    int updateByPrimaryKey(PmCitRpt record);
}