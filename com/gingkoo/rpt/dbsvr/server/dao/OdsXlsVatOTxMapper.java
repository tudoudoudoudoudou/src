package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatOTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatOTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatOTxMapper extends TableMapper {
    int countByExample(OdsXlsVatOTxExample example);

    int deleteByExample(OdsXlsVatOTxExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsXlsVatOTx record);

    int insertSelective(OdsXlsVatOTx record);

    List<OdsXlsVatOTx> selectByExample(OdsXlsVatOTxExample example);

    OdsXlsVatOTx selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsXlsVatOTx record, @Param("example") OdsXlsVatOTxExample example);

    int updateByExample(@Param("record") OdsXlsVatOTx record, @Param("example") OdsXlsVatOTxExample example);

    int updateByPrimaryKeySelective(OdsXlsVatOTx record);

    int updateByPrimaryKey(OdsXlsVatOTx record);
}