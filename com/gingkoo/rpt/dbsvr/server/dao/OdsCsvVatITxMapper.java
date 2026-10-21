package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatITx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatITxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatITxMapper extends TableMapper {
    int countByExample(OdsCsvVatITxExample example);

    int deleteByExample(OdsCsvVatITxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatITx record);

    int insertSelective(OdsCsvVatITx record);

    List<OdsCsvVatITx> selectByExample(OdsCsvVatITxExample example);

    OdsCsvVatITx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatITx record, @Param("example") OdsCsvVatITxExample example);

    int updateByExample(@Param("record") OdsCsvVatITx record, @Param("example") OdsCsvVatITxExample example);

    int updateByPrimaryKeySelective(OdsCsvVatITx record);

    int updateByPrimaryKey(OdsCsvVatITx record);
}