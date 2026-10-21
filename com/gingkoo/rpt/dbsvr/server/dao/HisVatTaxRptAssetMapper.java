package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptAsset;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptAssetMapper extends TableMapper {
    int countByExample(HisVatTaxRptAssetExample example);

    int deleteByExample(HisVatTaxRptAssetExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptAsset record);

    int insertSelective(HisVatTaxRptAsset record);

    List<HisVatTaxRptAsset> selectByExample(HisVatTaxRptAssetExample example);

    HisVatTaxRptAsset selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptAsset record, @Param("example") HisVatTaxRptAssetExample example);

    int updateByExample(@Param("record") HisVatTaxRptAsset record, @Param("example") HisVatTaxRptAssetExample example);

    int updateByPrimaryKeySelective(HisVatTaxRptAsset record);

    int updateByPrimaryKey(HisVatTaxRptAsset record);
}