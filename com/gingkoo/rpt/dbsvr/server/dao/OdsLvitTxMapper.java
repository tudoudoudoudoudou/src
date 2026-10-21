package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsLvitTx;
import com.gingkoo.rpt.dbsvr.server.bean.OdsLvitTxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsLvitTxMapper extends TableMapper {
    int countByExample(OdsLvitTxExample example);

    int deleteByExample(OdsLvitTxExample example);

    int insert(OdsLvitTx record);

    int insertSelective(OdsLvitTx record);

    List<OdsLvitTx> selectByExample(OdsLvitTxExample example);

    int updateByExampleSelective(@Param("record") OdsLvitTx record, @Param("example") OdsLvitTxExample example);

    int updateByExample(@Param("record") OdsLvitTx record, @Param("example") OdsLvitTxExample example);
}