package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatExchangeRate;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatExchangeRateMapper extends TableMapper {
    int countByExample(OdsVatExchangeRateExample example);

    int deleteByExample(OdsVatExchangeRateExample example);

    int insert(OdsVatExchangeRate record);

    int insertSelective(OdsVatExchangeRate record);

    List<OdsVatExchangeRate> selectByExample(OdsVatExchangeRateExample example);

    int updateByExampleSelective(@Param("record") OdsVatExchangeRate record, @Param("example") OdsVatExchangeRateExample example);

    int updateByExample(@Param("record") OdsVatExchangeRate record, @Param("example") OdsVatExchangeRateExample example);
}