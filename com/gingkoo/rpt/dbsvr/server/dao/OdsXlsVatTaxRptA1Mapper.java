package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA1;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA1Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA1Example example);

    int deleteByExample(OdsXlsVatTaxRptA1Example example);

    int insert(OdsXlsVatTaxRptA1 record);

    int insertSelective(OdsXlsVatTaxRptA1 record);

    List<OdsXlsVatTaxRptA1> selectByExample(OdsXlsVatTaxRptA1Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA1 record, @Param("example") OdsXlsVatTaxRptA1Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA1 record, @Param("example") OdsXlsVatTaxRptA1Example example);
}