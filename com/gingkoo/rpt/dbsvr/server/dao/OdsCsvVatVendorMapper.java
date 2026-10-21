package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatVendorMapper extends TableMapper {
    int countByExample(OdsCsvVatVendorExample example);

    int deleteByExample(OdsCsvVatVendorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatVendor record);

    int insertSelective(OdsCsvVatVendor record);

    List<OdsCsvVatVendor> selectByExample(OdsCsvVatVendorExample example);

    OdsCsvVatVendor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatVendor record, @Param("example") OdsCsvVatVendorExample example);

    int updateByExample(@Param("record") OdsCsvVatVendor record, @Param("example") OdsCsvVatVendorExample example);

    int updateByPrimaryKeySelective(OdsCsvVatVendor record);

    int updateByPrimaryKey(OdsCsvVatVendor record);
}