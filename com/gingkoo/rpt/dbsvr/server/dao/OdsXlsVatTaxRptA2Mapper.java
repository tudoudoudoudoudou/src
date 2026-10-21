package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA2;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA2Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA2Example example);

    int deleteByExample(OdsXlsVatTaxRptA2Example example);

    int insert(OdsXlsVatTaxRptA2 record);

    int insertSelective(OdsXlsVatTaxRptA2 record);

    List<OdsXlsVatTaxRptA2> selectByExample(OdsXlsVatTaxRptA2Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA2 record, @Param("example") OdsXlsVatTaxRptA2Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA2 record, @Param("example") OdsXlsVatTaxRptA2Example example);
}