package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisStTx;
import com.gingkoo.rpt.dbsvr.server.bean.HisStTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisStTxMapper extends TableMapper {
    int countByExample(HisStTxExample example);

    int deleteByExample(HisStTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisStTx record);

    int insertSelective(HisStTx record);

    List<HisStTx> selectByExample(HisStTxExample example);

    HisStTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisStTx record, @Param("example") HisStTxExample example);

    int updateByExample(@Param("record") HisStTx record, @Param("example") HisStTxExample example);

    int updateByPrimaryKeySelective(HisStTx record);

    int updateByPrimaryKey(HisStTx record);
}