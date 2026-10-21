package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA1;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA1Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA1Example example);

    int deleteByExample(PmVatTaxRptA1Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA1 record);

    int insertSelective(PmVatTaxRptA1 record);

    List<PmVatTaxRptA1> selectByExample(PmVatTaxRptA1Example example);

    PmVatTaxRptA1 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA1 record, @Param("example") PmVatTaxRptA1Example example);

    int updateByExample(@Param("record") PmVatTaxRptA1 record, @Param("example") PmVatTaxRptA1Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA1 record);

    int updateByPrimaryKey(PmVatTaxRptA1 record);
}