package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatCustomerMapper extends TableMapper {
    int countByExample(WsVatCustomerExample example);

    int deleteByExample(WsVatCustomerExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatCustomer record);

    int insertSelective(WsVatCustomer record);

    List<WsVatCustomer> selectByExample(WsVatCustomerExample example);

    WsVatCustomer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatCustomer record, @Param("example") WsVatCustomerExample example);

    int updateByExample(@Param("record") WsVatCustomer record, @Param("example") WsVatCustomerExample example);

    int updateByPrimaryKeySelective(WsVatCustomer record);

    int updateByPrimaryKey(WsVatCustomer record);
}