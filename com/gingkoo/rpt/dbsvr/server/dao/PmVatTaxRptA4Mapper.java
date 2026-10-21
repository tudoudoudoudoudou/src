package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA4;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA4Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA4Example example);

    int deleteByExample(PmVatTaxRptA4Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA4 record);

    int insertSelective(PmVatTaxRptA4 record);

    List<PmVatTaxRptA4> selectByExample(PmVatTaxRptA4Example example);

    PmVatTaxRptA4 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA4 record, @Param("example") PmVatTaxRptA4Example example);

    int updateByExample(@Param("record") PmVatTaxRptA4 record, @Param("example") PmVatTaxRptA4Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA4 record);

    int updateByPrimaryKey(PmVatTaxRptA4 record);
}