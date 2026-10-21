package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA10;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA10Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA10Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA10Example example);

    int deleteByExample(OdsXlsVatTaxRptA10Example example);

    int insert(OdsXlsVatTaxRptA10 record);

    int insertSelective(OdsXlsVatTaxRptA10 record);

    List<OdsXlsVatTaxRptA10> selectByExample(OdsXlsVatTaxRptA10Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA10 record, @Param("example") OdsXlsVatTaxRptA10Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA10 record, @Param("example") OdsXlsVatTaxRptA10Example example);
}