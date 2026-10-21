package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA6;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA6Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA6Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA6Example example);

    int deleteByExample(OdsXlsVatTaxRptA6Example example);

    int insert(OdsXlsVatTaxRptA6 record);

    int insertSelective(OdsXlsVatTaxRptA6 record);

    List<OdsXlsVatTaxRptA6> selectByExample(OdsXlsVatTaxRptA6Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA6 record, @Param("example") OdsXlsVatTaxRptA6Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA6 record, @Param("example") OdsXlsVatTaxRptA6Example example);
}