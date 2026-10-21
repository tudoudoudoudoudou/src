package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatExchangeRateMapper extends TableMapper {
    int countByExample(HisVatExchangeRateExample example);

    int deleteByExample(HisVatExchangeRateExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatExchangeRate record);

    int insertSelective(HisVatExchangeRate record);

    List<HisVatExchangeRate> selectByExample(HisVatExchangeRateExample example);

    HisVatExchangeRate selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatExchangeRate record, @Param("example") HisVatExchangeRateExample example);

    int updateByExample(@Param("record") HisVatExchangeRate record, @Param("example") HisVatExchangeRateExample example);

    int updateByPrimaryKeySelective(HisVatExchangeRate record);

    int updateByPrimaryKey(HisVatExchangeRate record);
}