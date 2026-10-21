package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptAsset;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptAssetMapper extends TableMapper {
    int countByExample(PmVatTaxRptAssetExample example);

    int deleteByExample(PmVatTaxRptAssetExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptAsset record);

    int insertSelective(PmVatTaxRptAsset record);

    List<PmVatTaxRptAsset> selectByExample(PmVatTaxRptAssetExample example);

    PmVatTaxRptAsset selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptAsset record, @Param("example") PmVatTaxRptAssetExample example);

    int updateByExample(@Param("record") PmVatTaxRptAsset record, @Param("example") PmVatTaxRptAssetExample example);

    int updateByPrimaryKeySelective(PmVatTaxRptAsset record);

    int updateByPrimaryKey(PmVatTaxRptAsset record);
}