package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLvitTx;
import com.gingkoo.rpt.dbsvr.server.bean.PmLvitTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLvitTxMapper extends TableMapper {
    int countByExample(PmLvitTxExample example);

    int deleteByExample(PmLvitTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmLvitTx record);

    int insertSelective(PmLvitTx record);

    List<PmLvitTx> selectByExample(PmLvitTxExample example);

    PmLvitTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmLvitTx record, @Param("example") PmLvitTxExample example);

    int updateByExample(@Param("record") PmLvitTx record, @Param("example") PmLvitTxExample example);

    int updateByPrimaryKeySelective(PmLvitTx record);

    int updateByPrimaryKey(PmLvitTx record);
}