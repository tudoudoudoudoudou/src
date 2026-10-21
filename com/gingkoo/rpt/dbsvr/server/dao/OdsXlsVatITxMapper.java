package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatITx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatITxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatITxMapper extends TableMapper {
    int countByExample(OdsXlsVatITxExample example);

    int deleteByExample(OdsXlsVatITxExample example);

    int insert(OdsXlsVatITx record);

    int insertSelective(OdsXlsVatITx record);

    List<OdsXlsVatITx> selectByExample(OdsXlsVatITxExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatITx record, @Param("example") OdsXlsVatITxExample example);

    int updateByExample(@Param("record") OdsXlsVatITx record, @Param("example") OdsXlsVatITxExample example);
}