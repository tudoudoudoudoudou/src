package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatVendorMapper extends TableMapper {
    int countByExample(HisVatVendorExample example);

    int deleteByExample(HisVatVendorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatVendor record);

    int insertSelective(HisVatVendor record);

    List<HisVatVendor> selectByExample(HisVatVendorExample example);

    HisVatVendor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatVendor record, @Param("example") HisVatVendorExample example);

    int updateByExample(@Param("record") HisVatVendor record, @Param("example") HisVatVendorExample example);

    int updateByPrimaryKeySelective(HisVatVendor record);

    int updateByPrimaryKey(HisVatVendor record);
}