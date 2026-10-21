package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatCustomerMapper extends TableMapper {
    int countByExample(PmVatCustomerExample example);

    int deleteByExample(PmVatCustomerExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatCustomer record);

    int insertSelective(PmVatCustomer record);

    List<PmVatCustomer> selectByExample(PmVatCustomerExample example);

    PmVatCustomer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatCustomer record, @Param("example") PmVatCustomerExample example);

    int updateByExample(@Param("record") PmVatCustomer record, @Param("example") PmVatCustomerExample example);

    int updateByPrimaryKeySelective(PmVatCustomer record);

    int updateByPrimaryKey(PmVatCustomer record);
}