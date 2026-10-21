package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptDtlMapper extends TableMapper {
    int countByExample(PmVatTaxRptDtlExample example);

    int deleteByExample(PmVatTaxRptDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptDtl record);

    int insertSelective(PmVatTaxRptDtl record);

    List<PmVatTaxRptDtl> selectByExample(PmVatTaxRptDtlExample example);

    PmVatTaxRptDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptDtl record, @Param("example") PmVatTaxRptDtlExample example);

    int updateByExample(@Param("record") PmVatTaxRptDtl record, @Param("example") PmVatTaxRptDtlExample example);

    int updateByPrimaryKeySelective(PmVatTaxRptDtl record);

    int updateByPrimaryKey(PmVatTaxRptDtl record);
}