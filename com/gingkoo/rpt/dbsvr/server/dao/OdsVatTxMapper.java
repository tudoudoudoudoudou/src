package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatTxMapper extends TableMapper {
    int countByExample(OdsVatTxExample example);

    int deleteByExample(OdsVatTxExample example);

    int insert(OdsVatTx record);

    int insertSelective(OdsVatTx record);

    List<OdsVatTx> selectByExample(OdsVatTxExample example);

    int updateByExampleSelective(@Param("record") OdsVatTx record, @Param("example") OdsVatTxExample example);

    int updateByExample(@Param("record") OdsVatTx record, @Param("example") OdsVatTxExample example);
}