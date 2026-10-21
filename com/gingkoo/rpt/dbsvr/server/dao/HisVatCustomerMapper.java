package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatCustomerMapper extends TableMapper {
    int countByExample(HisVatCustomerExample example);

    int deleteByExample(HisVatCustomerExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatCustomer record);

    int insertSelective(HisVatCustomer record);

    List<HisVatCustomer> selectByExample(HisVatCustomerExample example);

    HisVatCustomer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatCustomer record, @Param("example") HisVatCustomerExample example);

    int updateByExample(@Param("record") HisVatCustomer record, @Param("example") HisVatCustomerExample example);

    int updateByPrimaryKeySelective(HisVatCustomer record);

    int updateByPrimaryKey(HisVatCustomer record);
}