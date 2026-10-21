package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatOTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatOTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatOTxMapper extends TableMapper {
    int countByExample(OdsCsvVatOTxExample example);

    int deleteByExample(OdsCsvVatOTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatOTx record);

    int insertSelective(OdsCsvVatOTx record);

    List<OdsCsvVatOTx> selectByExample(OdsCsvVatOTxExample example);

    OdsCsvVatOTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatOTx record, @Param("example") OdsCsvVatOTxExample example);

    int updateByExample(@Param("record") OdsCsvVatOTx record, @Param("example") OdsCsvVatOTxExample example);

    int updateByPrimaryKeySelective(OdsCsvVatOTx record);

    int updateByPrimaryKey(OdsCsvVatOTx record);
}