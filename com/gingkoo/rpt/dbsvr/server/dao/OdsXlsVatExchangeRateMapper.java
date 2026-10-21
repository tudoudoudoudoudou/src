package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatExchangeRateMapper extends TableMapper {
    int countByExample(OdsXlsVatExchangeRateExample example);

    int deleteByExample(OdsXlsVatExchangeRateExample example);

    int insert(OdsXlsVatExchangeRate record);

    int insertSelective(OdsXlsVatExchangeRate record);

    List<OdsXlsVatExchangeRate> selectByExample(OdsXlsVatExchangeRateExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatExchangeRate record, @Param("example") OdsXlsVatExchangeRateExample example);

    int updateByExample(@Param("record") OdsXlsVatExchangeRate record, @Param("example") OdsXlsVatExchangeRateExample example);
}