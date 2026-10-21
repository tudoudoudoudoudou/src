package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsLutTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsLutTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsLutTxMapper extends TableMapper {
    int countByExample(OdsLutTxExample example);

    int deleteByExample(OdsLutTxExample example);

    int insert(OdsLutTx record);

    int insertSelective(OdsLutTx record);

    List<OdsLutTx> selectByExample(OdsLutTxExample example);

    int updateByExampleSelective(@Param("record") OdsLutTx record, @Param("example") OdsLutTxExample example);

    int updateByExample(@Param("record") OdsLutTx record, @Param("example") OdsLutTxExample example);
}