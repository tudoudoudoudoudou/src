package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatVendorMapper extends TableMapper {
    int countByExample(PmVatVendorExample example);

    int deleteByExample(PmVatVendorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatVendor record);

    int insertSelective(PmVatVendor record);

    List<PmVatVendor> selectByExample(PmVatVendorExample example);

    PmVatVendor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatVendor record, @Param("example") PmVatVendorExample example);

    int updateByExample(@Param("record") PmVatVendor record, @Param("example") PmVatVendorExample example);

    int updateByPrimaryKeySelective(PmVatVendor record);

    int updateByPrimaryKey(PmVatVendor record);
}