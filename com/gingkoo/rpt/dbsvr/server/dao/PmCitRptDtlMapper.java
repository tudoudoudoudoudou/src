package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitRptDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitRptDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmCitRptDtlMapper extends TableMapper {
    int countByExample(PmCitRptDtlExample example);

    int deleteByExample(PmCitRptDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmCitRptDtl record);

    int insertSelective(PmCitRptDtl record);

    List<PmCitRptDtl> selectByExample(PmCitRptDtlExample example);

    PmCitRptDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmCitRptDtl record, @Param("example") PmCitRptDtlExample example);

    int updateByExample(@Param("record") PmCitRptDtl record, @Param("example") PmCitRptDtlExample example);

    int updateByPrimaryKeySelective(PmCitRptDtl record);

    int updateByPrimaryKey(PmCitRptDtl record);
}