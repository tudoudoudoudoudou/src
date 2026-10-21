package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatITx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatITxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatITxMapper extends TableMapper {
    int countByExample(OdsVatITxExample example);

    int deleteByExample(OdsVatITxExample example);

    int insert(OdsVatITx record);

    int insertSelective(OdsVatITx record);

    List<OdsVatITx> selectByExample(OdsVatITxExample example);

    int updateByExampleSelective(@Param("record") OdsVatITx record, @Param("example") OdsVatITxExample example);

    int updateByExample(@Param("record") OdsVatITx record, @Param("example") OdsVatITxExample example);
}