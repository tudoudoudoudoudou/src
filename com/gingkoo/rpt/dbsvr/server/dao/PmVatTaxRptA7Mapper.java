package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA7;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA7Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA7Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA7Example example);

    int deleteByExample(PmVatTaxRptA7Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA7 record);

    int insertSelective(PmVatTaxRptA7 record);

    List<PmVatTaxRptA7> selectByExample(PmVatTaxRptA7Example example);

    PmVatTaxRptA7 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA7 record, @Param("example") PmVatTaxRptA7Example example);

    int updateByExample(@Param("record") PmVatTaxRptA7 record, @Param("example") PmVatTaxRptA7Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA7 record);

    int updateByPrimaryKey(PmVatTaxRptA7 record);
}