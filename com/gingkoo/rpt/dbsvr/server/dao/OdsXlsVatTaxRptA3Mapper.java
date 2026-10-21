package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA3;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptA3Mapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptA3Example example);

    int deleteByExample(OdsXlsVatTaxRptA3Example example);

    int insert(OdsXlsVatTaxRptA3 record);

    int insertSelective(OdsXlsVatTaxRptA3 record);

    List<OdsXlsVatTaxRptA3> selectByExample(OdsXlsVatTaxRptA3Example example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA3 record, @Param("example") OdsXlsVatTaxRptA3Example example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA3 record, @Param("example") OdsXlsVatTaxRptA3Example example);
}