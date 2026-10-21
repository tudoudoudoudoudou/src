package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTx;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTxMapper extends TableMapper {
    int countByExample(PmVatTxExample example);

    int deleteByExample(PmVatTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTx record);

    int insertSelective(PmVatTx record);

    List<PmVatTx> selectByExample(PmVatTxExample example);

    PmVatTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTx record, @Param("example") PmVatTxExample example);

    int updateByExample(@Param("record") PmVatTx record, @Param("example") PmVatTxExample example);

    int updateByPrimaryKeySelective(PmVatTx record);

    int updateByPrimaryKey(PmVatTx record);
}