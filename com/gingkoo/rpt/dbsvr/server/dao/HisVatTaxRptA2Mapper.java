package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA2;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptA2Mapper extends TableMapper {
    int countByExample(HisVatTaxRptA2Example example);

    int deleteByExample(HisVatTaxRptA2Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptA2 record);

    int insertSelective(HisVatTaxRptA2 record);

    List<HisVatTaxRptA2> selectByExample(HisVatTaxRptA2Example example);

    HisVatTaxRptA2 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptA2 record, @Param("example") HisVatTaxRptA2Example example);

    int updateByExample(@Param("record") HisVatTaxRptA2 record, @Param("example") HisVatTaxRptA2Example example);

    int updateByPrimaryKeySelective(HisVatTaxRptA2 record);

    int updateByPrimaryKey(HisVatTaxRptA2 record);
}