package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVendor;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatVendorMapper extends TableMapper {
    int countByExample(WsVatVendorExample example);

    int deleteByExample(WsVatVendorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatVendor record);

    int insertSelective(WsVatVendor record);

    List<WsVatVendor> selectByExample(WsVatVendorExample example);

    WsVatVendor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatVendor record, @Param("example") WsVatVendorExample example);

    int updateByExample(@Param("record") WsVatVendor record, @Param("example") WsVatVendorExample example);

    int updateByPrimaryKeySelective(WsVatVendor record);

    int updateByPrimaryKey(WsVatVendor record);
}