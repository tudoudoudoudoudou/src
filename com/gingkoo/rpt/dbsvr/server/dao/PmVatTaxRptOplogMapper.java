package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptOplog;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptOplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptOplogMapper extends TableMapper {
    int countByExample(PmVatTaxRptOplogExample example);

    int deleteByExample(PmVatTaxRptOplogExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptOplog record);

    int insertSelective(PmVatTaxRptOplog record);

    List<PmVatTaxRptOplog> selectByExample(PmVatTaxRptOplogExample example);

    PmVatTaxRptOplog selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptOplog record, @Param("example") PmVatTaxRptOplogExample example);

    int updateByExample(@Param("record") PmVatTaxRptOplog record, @Param("example") PmVatTaxRptOplogExample example);

    int updateByPrimaryKeySelective(PmVatTaxRptOplog record);

    int updateByPrimaryKey(PmVatTaxRptOplog record);
}