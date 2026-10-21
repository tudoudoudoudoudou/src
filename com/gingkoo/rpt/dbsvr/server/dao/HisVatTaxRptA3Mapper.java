package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA3;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptA3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptA3Mapper extends TableMapper {
    int countByExample(HisVatTaxRptA3Example example);

    int deleteByExample(HisVatTaxRptA3Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptA3 record);

    int insertSelective(HisVatTaxRptA3 record);

    List<HisVatTaxRptA3> selectByExample(HisVatTaxRptA3Example example);

    HisVatTaxRptA3 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptA3 record, @Param("example") HisVatTaxRptA3Example example);

    int updateByExample(@Param("record") HisVatTaxRptA3 record, @Param("example") HisVatTaxRptA3Example example);

    int updateByPrimaryKeySelective(HisVatTaxRptA3 record);

    int updateByPrimaryKey(HisVatTaxRptA3 record);
}