package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatPay;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatPayMapper extends TableMapper {
    int countByExample(OdsCsvVatPayExample example);

    int deleteByExample(OdsCsvVatPayExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatPay record);

    int insertSelective(OdsCsvVatPay record);

    List<OdsCsvVatPay> selectByExample(OdsCsvVatPayExample example);

    OdsCsvVatPay selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatPay record, @Param("example") OdsCsvVatPayExample example);

    int updateByExample(@Param("record") OdsCsvVatPay record, @Param("example") OdsCsvVatPayExample example);

    int updateByPrimaryKeySelective(OdsCsvVatPay record);

    int updateByPrimaryKey(OdsCsvVatPay record);
}