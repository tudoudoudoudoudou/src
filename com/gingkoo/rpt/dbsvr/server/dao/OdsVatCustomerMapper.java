package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatCustomerMapper extends TableMapper {
    int countByExample(OdsVatCustomerExample example);

    int deleteByExample(OdsVatCustomerExample example);

    int insert(OdsVatCustomer record);

    int insertSelective(OdsVatCustomer record);

    List<OdsVatCustomer> selectByExample(OdsVatCustomerExample example);

    int updateByExampleSelective(@Param("record") OdsVatCustomer record, @Param("example") OdsVatCustomerExample example);

    int updateByExample(@Param("record") OdsVatCustomer record, @Param("example") OdsVatCustomerExample example);
}