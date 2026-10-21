package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptMapper extends TableMapper {
    int countByExample(PmVatTaxRptExample example);

    int deleteByExample(PmVatTaxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRpt record);

    int insertSelective(PmVatTaxRpt record);

    List<PmVatTaxRpt> selectByExample(PmVatTaxRptExample example);

    PmVatTaxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRpt record, @Param("example") PmVatTaxRptExample example);

    int updateByExample(@Param("record") PmVatTaxRpt record, @Param("example") PmVatTaxRptExample example);

    int updateByPrimaryKeySelective(PmVatTaxRpt record);

    int updateByPrimaryKey(PmVatTaxRpt record);
}