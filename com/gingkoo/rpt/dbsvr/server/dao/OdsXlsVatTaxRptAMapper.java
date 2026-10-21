package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptA;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptAMapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptAExample example);

    int deleteByExample(OdsXlsVatTaxRptAExample example);

    int insert(OdsXlsVatTaxRptA record);

    int insertSelective(OdsXlsVatTaxRptA record);

    List<OdsXlsVatTaxRptA> selectByExample(OdsXlsVatTaxRptAExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptA record, @Param("example") OdsXlsVatTaxRptAExample example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptA record, @Param("example") OdsXlsVatTaxRptAExample example);
}