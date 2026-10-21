package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTx;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTxMapper extends TableMapper {
    int countByExample(HisVatTxExample example);

    int deleteByExample(HisVatTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTx record);

    int insertSelective(HisVatTx record);

    List<HisVatTx> selectByExample(HisVatTxExample example);

    HisVatTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTx record, @Param("example") HisVatTxExample example);

    int updateByExample(@Param("record") HisVatTx record, @Param("example") HisVatTxExample example);

    int updateByPrimaryKeySelective(HisVatTx record);

    int updateByPrimaryKey(HisVatTx record);
}