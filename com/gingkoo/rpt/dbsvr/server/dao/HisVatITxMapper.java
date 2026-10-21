package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatITx;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatITxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatITxMapper extends TableMapper {
    int countByExample(HisVatITxExample example);

    int deleteByExample(HisVatITxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatITx record);

    int insertSelective(HisVatITx record);

    List<HisVatITx> selectByExample(HisVatITxExample example);

    HisVatITx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatITx record, @Param("example") HisVatITxExample example);

    int updateByExample(@Param("record") HisVatITx record, @Param("example") HisVatITxExample example);

    int updateByPrimaryKeySelective(HisVatITx record);

    int updateByPrimaryKey(HisVatITx record);
}