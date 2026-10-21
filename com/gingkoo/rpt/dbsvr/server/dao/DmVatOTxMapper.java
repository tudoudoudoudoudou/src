package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.DmVatOTx;
import com.gingkoo.rpt.dbsvr.server.bean.DmVatOTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DmVatOTxMapper extends TableMapper {
    int countByExample(DmVatOTxExample example);

    int deleteByExample(DmVatOTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(DmVatOTx record);

    int insertSelective(DmVatOTx record);

    List<DmVatOTx> selectByExample(DmVatOTxExample example);

    DmVatOTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") DmVatOTx record, @Param("example") DmVatOTxExample example);

    int updateByExample(@Param("record") DmVatOTx record, @Param("example") DmVatOTxExample example);

    int updateByPrimaryKeySelective(DmVatOTx record);

    int updateByPrimaryKey(DmVatOTx record);
}