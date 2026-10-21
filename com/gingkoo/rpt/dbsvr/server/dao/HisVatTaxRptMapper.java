package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptMapper extends TableMapper {
    int countByExample(HisVatTaxRptExample example);

    int deleteByExample(HisVatTaxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRpt record);

    int insertSelective(HisVatTaxRpt record);

    List<HisVatTaxRpt> selectByExample(HisVatTaxRptExample example);

    HisVatTaxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRpt record, @Param("example") HisVatTaxRptExample example);

    int updateByExample(@Param("record") HisVatTaxRpt record, @Param("example") HisVatTaxRptExample example);

    int updateByPrimaryKeySelective(HisVatTaxRpt record);

    int updateByPrimaryKey(HisVatTaxRpt record);
}