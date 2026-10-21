package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatCustomerMapper extends TableMapper {
    int countByExample(OdsCsvVatCustomerExample example);

    int deleteByExample(OdsCsvVatCustomerExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatCustomer record);

    int insertSelective(OdsCsvVatCustomer record);

    List<OdsCsvVatCustomer> selectByExample(OdsCsvVatCustomerExample example);

    OdsCsvVatCustomer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatCustomer record, @Param("example") OdsCsvVatCustomerExample example);

    int updateByExample(@Param("record") OdsCsvVatCustomer record, @Param("example") OdsCsvVatCustomerExample example);

    int updateByPrimaryKeySelective(OdsCsvVatCustomer record);

    int updateByPrimaryKey(OdsCsvVatCustomer record);
}