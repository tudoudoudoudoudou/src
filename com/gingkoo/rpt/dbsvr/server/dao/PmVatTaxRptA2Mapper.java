package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA2;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA2Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA2Example example);

    int deleteByExample(PmVatTaxRptA2Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA2 record);

    int insertSelective(PmVatTaxRptA2 record);

    List<PmVatTaxRptA2> selectByExample(PmVatTaxRptA2Example example);

    PmVatTaxRptA2 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA2 record, @Param("example") PmVatTaxRptA2Example example);

    int updateByExample(@Param("record") PmVatTaxRptA2 record, @Param("example") PmVatTaxRptA2Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA2 record);

    int updateByPrimaryKey(PmVatTaxRptA2 record);
}