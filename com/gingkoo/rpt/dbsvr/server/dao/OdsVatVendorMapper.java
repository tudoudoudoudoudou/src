package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatVendorMapper extends TableMapper {
    int countByExample(OdsVatVendorExample example);

    int deleteByExample(OdsVatVendorExample example);

    int insert(OdsVatVendor record);

    int insertSelective(OdsVatVendor record);

    List<OdsVatVendor> selectByExample(OdsVatVendorExample example);

    int updateByExampleSelective(@Param("record") OdsVatVendor record, @Param("example") OdsVatVendorExample example);

    int updateByExample(@Param("record") OdsVatVendor record, @Param("example") OdsVatVendorExample example);
}