package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLvitTx;
import com.gingkoo.rpt.dbsvr.server.bean.HisLvitTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLvitTxMapper extends TableMapper {
    int countByExample(HisLvitTxExample example);

    int deleteByExample(HisLvitTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLvitTx record);

    int insertSelective(HisLvitTx record);

    List<HisLvitTx> selectByExample(HisLvitTxExample example);

    HisLvitTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLvitTx record, @Param("example") HisLvitTxExample example);

    int updateByExample(@Param("record") HisLvitTx record, @Param("example") HisLvitTxExample example);

    int updateByPrimaryKeySelective(HisLvitTx record);

    int updateByPrimaryKey(HisLvitTx record);
}