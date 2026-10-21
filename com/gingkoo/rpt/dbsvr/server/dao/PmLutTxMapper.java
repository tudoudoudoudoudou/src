package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTx;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLutTxMapper extends TableMapper {
    int countByExample(PmLutTxExample example);

    int deleteByExample(PmLutTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmLutTx record);

    int insertSelective(PmLutTx record);

    List<PmLutTx> selectByExample(PmLutTxExample example);

    PmLutTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmLutTx record, @Param("example") PmLutTxExample example);

    int updateByExample(@Param("record") PmLutTx record, @Param("example") PmLutTxExample example);

    int updateByPrimaryKeySelective(PmLutTx record);

    int updateByPrimaryKey(PmLutTx record);
}