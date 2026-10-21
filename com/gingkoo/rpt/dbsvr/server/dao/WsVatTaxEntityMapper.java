package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTaxEntity;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTaxEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatTaxEntityMapper extends TableMapper {
    long countByExample(WsVatTaxEntityExample example);

    int deleteByExample(WsVatTaxEntityExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatTaxEntity record);

    int insertSelective(WsVatTaxEntity record);

    List<WsVatTaxEntity> selectByExample(WsVatTaxEntityExample example);

    WsVatTaxEntity selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatTaxEntity record, @Param("example") WsVatTaxEntityExample example);

    int updateByExample(@Param("record") WsVatTaxEntity record, @Param("example") WsVatTaxEntityExample example);

    int updateByPrimaryKeySelective(WsVatTaxEntity record);

    int updateByPrimaryKey(WsVatTaxEntity record);
}