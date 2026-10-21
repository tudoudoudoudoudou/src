package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA10;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA10Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA10Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA10Example example);

    int deleteByExample(PmVatTaxRptA10Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA10 record);

    int insertSelective(PmVatTaxRptA10 record);

    List<PmVatTaxRptA10> selectByExample(PmVatTaxRptA10Example example);

    PmVatTaxRptA10 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA10 record, @Param("example") PmVatTaxRptA10Example example);

    int updateByExample(@Param("record") PmVatTaxRptA10 record, @Param("example") PmVatTaxRptA10Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA10 record);

    int updateByPrimaryKey(PmVatTaxRptA10 record);
}