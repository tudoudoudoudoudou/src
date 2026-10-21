package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsStTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsStTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsStTxMapper extends TableMapper {
    int countByExample(OdsStTxExample example);

    int deleteByExample(OdsStTxExample example);

    int insert(OdsStTx record);

    int insertSelective(OdsStTx record);

    List<OdsStTx> selectByExample(OdsStTxExample example);

    int updateByExampleSelective(@Param("record") OdsStTx record, @Param("example") OdsStTxExample example);

    int updateByExample(@Param("record") OdsStTx record, @Param("example") OdsStTxExample example);
}