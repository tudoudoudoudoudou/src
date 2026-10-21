package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA7;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA7Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA7Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA7Example example);

    int deleteByExample(OdsXlsVatTaxRptA7Example example);

    int insert(OdsXlsVatTaxRptA7 record);

    int insertSelective(OdsXlsVatTaxRptA7 record);

    List<OdsXlsVatTaxRptA7> selectByExample(OdsXlsVatTaxRptA7Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA7 record, @Param("example") OdsXlsVatTaxRptA7Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA7 record, @Param("example") OdsXlsVatTaxRptA7Example example);
}