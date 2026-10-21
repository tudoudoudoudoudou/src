package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatExchangeRateMapper extends TableMapper {
    int countByExample(WsVatExchangeRateExample example);

    int deleteByExample(WsVatExchangeRateExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatExchangeRate record);

    int insertSelective(WsVatExchangeRate record);

    List<WsVatExchangeRate> selectByExample(WsVatExchangeRateExample example);

    WsVatExchangeRate selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatExchangeRate record, @Param("example") WsVatExchangeRateExample example);

    int updateByExample(@Param("record") WsVatExchangeRate record, @Param("example") WsVatExchangeRateExample example);

    int updateByPrimaryKeySelective(WsVatExchangeRate record);

    int updateByPrimaryKey(WsVatExchangeRate record);
}