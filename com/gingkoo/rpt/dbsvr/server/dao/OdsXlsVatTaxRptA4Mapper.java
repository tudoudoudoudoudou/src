package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA4;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA4Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA4Example example);

    int deleteByExample(OdsXlsVatTaxRptA4Example example);

    int insert(OdsXlsVatTaxRptA4 record);

    int insertSelective(OdsXlsVatTaxRptA4 record);

    List<OdsXlsVatTaxRptA4> selectByExample(OdsXlsVatTaxRptA4Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA4 record, @Param("example") OdsXlsVatTaxRptA4Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA4 record, @Param("example") OdsXlsVatTaxRptA4Example example);
}