package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatVendorMapper extends TableMapper {
    int countByExample(OdsXlsVatVendorExample example);

    int deleteByExample(OdsXlsVatVendorExample example);

    int insert(OdsXlsVatVendor record);

    int insertSelective(OdsXlsVatVendor record);

    List<OdsXlsVatVendor> selectByExample(OdsXlsVatVendorExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatVendor record, @Param("example") OdsXlsVatVendorExample example);

    int updateByExample(@Param("record") OdsXlsVatVendor record, @Param("example") OdsXlsVatVendorExample example);
}