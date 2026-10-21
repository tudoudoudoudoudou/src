package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA5;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA5Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA5Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA5Example example);

    int deleteByExample(OdsXlsVatTaxRptA5Example example);

    int insert(OdsXlsVatTaxRptA5 record);

    int insertSelective(OdsXlsVatTaxRptA5 record);

    List<OdsXlsVatTaxRptA5> selectByExample(OdsXlsVatTaxRptA5Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA5 record, @Param("example") OdsXlsVatTaxRptA5Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA5 record, @Param("example") OdsXlsVatTaxRptA5Example example);
}