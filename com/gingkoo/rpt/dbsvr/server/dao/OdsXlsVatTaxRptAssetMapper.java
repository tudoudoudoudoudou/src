package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptAsset;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxRptAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxRptAssetMapper extends TableMapper {
    int countByExample(OdsXlsVatTaxRptAssetExample example);

    int deleteByExample(OdsXlsVatTaxRptAssetExample example);

    int insert(OdsXlsVatTaxRptAsset record);

    int insertSelective(OdsXlsVatTaxRptAsset record);

    List<OdsXlsVatTaxRptAsset> selectByExample(OdsXlsVatTaxRptAssetExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxRptAsset record, @Param("example") OdsXlsVatTaxRptAssetExample example);

    int updateByExample(@Param("record") OdsXlsVatTaxRptAsset record, @Param("example") OdsXlsVatTaxRptAssetExample example);
}