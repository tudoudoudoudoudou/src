package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA1;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptA1Mapper extends TableMapper {
    int countByExample(HisVatTaxRptA1Example example);

    int deleteByExample(HisVatTaxRptA1Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptA1 record);

    int insertSelective(HisVatTaxRptA1 record);

    List<HisVatTaxRptA1> selectByExample(HisVatTaxRptA1Example example);

    HisVatTaxRptA1 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptA1 record, @Param("example") HisVatTaxRptA1Example example);

    int updateByExample(@Param("record") HisVatTaxRptA1 record, @Param("example") HisVatTaxRptA1Example example);

    int updateByPrimaryKeySelective(HisVatTaxRptA1 record);

    int updateByPrimaryKey(HisVatTaxRptA1 record);
}