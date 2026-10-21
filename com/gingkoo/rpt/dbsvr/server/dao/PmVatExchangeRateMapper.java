package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatExchangeRateMapper extends TableMapper {
    int countByExample(PmVatExchangeRateExample example);

    int deleteByExample(PmVatExchangeRateExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatExchangeRate record);

    int insertSelective(PmVatExchangeRate record);

    List<PmVatExchangeRate> selectByExample(PmVatExchangeRateExample example);

    PmVatExchangeRate selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatExchangeRate record, @Param("example") PmVatExchangeRateExample example);

    int updateByExample(@Param("record") PmVatExchangeRate record, @Param("example") PmVatExchangeRateExample example);

    int updateByPrimaryKeySelective(PmVatExchangeRate record);

    int updateByPrimaryKey(PmVatExchangeRate record);
}