package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTx;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLutTxMapper extends TableMapper {
    int countByExample(HisLutTxExample example);

    int deleteByExample(HisLutTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLutTx record);

    int insertSelective(HisLutTx record);

    List<HisLutTx> selectByExample(HisLutTxExample example);

    HisLutTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLutTx record, @Param("example") HisLutTxExample example);

    int updateByExample(@Param("record") HisLutTx record, @Param("example") HisLutTxExample example);

    int updateByPrimaryKeySelective(HisLutTx record);

    int updateByPrimaryKey(HisLutTx record);
}