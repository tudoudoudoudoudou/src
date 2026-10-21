package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTxcode;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTxcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatTxcodeMapper extends TableMapper {
    int countByExample(WsVatTxcodeExample example);

    int deleteByExample(WsVatTxcodeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatTxcode record);

    int insertSelective(WsVatTxcode record);

    List<WsVatTxcode> selectByExample(WsVatTxcodeExample example);

    WsVatTxcode selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatTxcode record, @Param("example") WsVatTxcodeExample example);

    int updateByExample(@Param("record") WsVatTxcode record, @Param("example") WsVatTxcodeExample example);

    int updateByPrimaryKeySelective(WsVatTxcode record);

    int updateByPrimaryKey(WsVatTxcode record);
}