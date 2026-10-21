package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatPay;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatPayMapper extends TableMapper {
    int countByExample(OdsVatPayExample example);

    int deleteByExample(OdsVatPayExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsVatPay record);

    int insertSelective(OdsVatPay record);

    List<OdsVatPay> selectByExample(OdsVatPayExample example);

    OdsVatPay selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsVatPay record, @Param("example") OdsVatPayExample example);

    int updateByExample(@Param("record") OdsVatPay record, @Param("example") OdsVatPayExample example);

    int updateByPrimaryKeySelective(OdsVatPay record);

    int updateByPrimaryKey(OdsVatPay record);
}