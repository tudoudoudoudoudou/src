package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatOTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatOTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatOTxMapper extends TableMapper {
    int countByExample(OdsVatOTxExample example);

    int deleteByExample(OdsVatOTxExample example);

    int insert(OdsVatOTx record);

    int insertSelective(OdsVatOTx record);

    List<OdsVatOTx> selectByExample(OdsVatOTxExample example);

    int updateByExampleSelective(@Param("record") OdsVatOTx record, @Param("example") OdsVatOTxExample example);

    int updateByExample(@Param("record") OdsVatOTx record, @Param("example") OdsVatOTxExample example);
}