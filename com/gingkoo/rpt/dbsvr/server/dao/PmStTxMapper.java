package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmStTx;
import com.gingkoo.rpt.dbsvr.server.bean.PmStTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmStTxMapper extends TableMapper {
    int countByExample(PmStTxExample example);

    int deleteByExample(PmStTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmStTx record);

    int insertSelective(PmStTx record);

    List<PmStTx> selectByExample(PmStTxExample example);

    PmStTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmStTx record, @Param("example") PmStTxExample example);

    int updateByExample(@Param("record") PmStTx record, @Param("example") PmStTxExample example);

    int updateByPrimaryKeySelective(PmStTx record);

    int updateByPrimaryKey(PmStTx record);
}