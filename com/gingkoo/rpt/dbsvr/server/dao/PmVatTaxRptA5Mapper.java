package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA5;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA5Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA5Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA5Example example);

    int deleteByExample(PmVatTaxRptA5Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA5 record);

    int insertSelective(PmVatTaxRptA5 record);

    List<PmVatTaxRptA5> selectByExample(PmVatTaxRptA5Example example);

    PmVatTaxRptA5 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA5 record, @Param("example") PmVatTaxRptA5Example example);

    int updateByExample(@Param("record") PmVatTaxRptA5 record, @Param("example") PmVatTaxRptA5Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA5 record);

    int updateByPrimaryKey(PmVatTaxRptA5 record);
}