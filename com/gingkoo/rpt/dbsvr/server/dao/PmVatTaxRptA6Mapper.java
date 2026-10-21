package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA6;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA6Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA6Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA6Example example);

    int deleteByExample(PmVatTaxRptA6Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA6 record);

    int insertSelective(PmVatTaxRptA6 record);

    List<PmVatTaxRptA6> selectByExample(PmVatTaxRptA6Example example);

    PmVatTaxRptA6 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA6 record, @Param("example") PmVatTaxRptA6Example example);

    int updateByExample(@Param("record") PmVatTaxRptA6 record, @Param("example") PmVatTaxRptA6Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA6 record);

    int updateByPrimaryKey(PmVatTaxRptA6 record);
}