package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatCustomerMapper extends TableMapper {
    int countByExample(OdsXlsVatCustomerExample example);

    int deleteByExample(OdsXlsVatCustomerExample example);

    int insert(OdsXlsVatCustomer record);

    int insertSelective(OdsXlsVatCustomer record);

    List<OdsXlsVatCustomer> selectByExample(OdsXlsVatCustomerExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatCustomer record, @Param("example") OdsXlsVatCustomerExample example);

    int updateByExample(@Param("record") OdsXlsVatCustomer record, @Param("example") OdsXlsVatCustomerExample example);
}