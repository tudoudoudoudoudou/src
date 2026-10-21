package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptOplog;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptOplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptOplogMapper extends TableMapper {
    int countByExample(HisVatTaxRptOplogExample example);

    int deleteByExample(HisVatTaxRptOplogExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptOplog record);

    int insertSelective(HisVatTaxRptOplog record);

    List<HisVatTaxRptOplog> selectByExample(HisVatTaxRptOplogExample example);

    HisVatTaxRptOplog selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptOplog record, @Param("example") HisVatTaxRptOplogExample example);

    int updateByExample(@Param("record") HisVatTaxRptOplog record, @Param("example") HisVatTaxRptOplogExample example);

    int updateByPrimaryKeySelective(HisVatTaxRptOplog record);

    int updateByPrimaryKey(HisVatTaxRptOplog record);
}