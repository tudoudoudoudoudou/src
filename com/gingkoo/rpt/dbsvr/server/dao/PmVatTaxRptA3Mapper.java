package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA3;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptA3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptA3Mapper extends TableMapper {
    int countByExample(PmVatTaxRptA3Example example);

    int deleteByExample(PmVatTaxRptA3Example example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptA3 record);

    int insertSelective(PmVatTaxRptA3 record);

    List<PmVatTaxRptA3> selectByExample(PmVatTaxRptA3Example example);

    PmVatTaxRptA3 selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptA3 record, @Param("example") PmVatTaxRptA3Example example);

    int updateByExample(@Param("record") PmVatTaxRptA3 record, @Param("example") PmVatTaxRptA3Example example);

    int updateByPrimaryKeySelective(PmVatTaxRptA3 record);

    int updateByPrimaryKey(PmVatTaxRptA3 record);
}