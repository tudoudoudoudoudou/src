package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatExchangeRateMapper extends TableMapper {
    int countByExample(OdsCsvVatExchangeRateExample example);

    int deleteByExample(OdsCsvVatExchangeRateExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatExchangeRate record);

    int insertSelective(OdsCsvVatExchangeRate record);

    List<OdsCsvVatExchangeRate> selectByExample(OdsCsvVatExchangeRateExample example);

    OdsCsvVatExchangeRate selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatExchangeRate record, @Param("example") OdsCsvVatExchangeRateExample example);

    int updateByExample(@Param("record") OdsCsvVatExchangeRate record, @Param("example") OdsCsvVatExchangeRateExample example);

    int updateByPrimaryKeySelective(OdsCsvVatExchangeRate record);

    int updateByPrimaryKey(OdsCsvVatExchangeRate record);
}