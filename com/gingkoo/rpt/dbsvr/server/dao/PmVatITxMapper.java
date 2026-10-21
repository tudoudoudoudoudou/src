package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatITx;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatITxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatITxMapper extends TableMapper {
    int countByExample(PmVatITxExample example);

    int deleteByExample(PmVatITxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatITx record);

    int insertSelective(PmVatITx record);

    List<PmVatITx> selectByExample(PmVatITxExample example);

    PmVatITx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatITx record, @Param("example") PmVatITxExample example);

    int updateByExample(@Param("record") PmVatITx record, @Param("example") PmVatITxExample example);

    int updateByPrimaryKeySelective(PmVatITx record);

    int updateByPrimaryKey(PmVatITx record);
}