package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTaxKey;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatTaxKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatTaxKeyMapper extends TableMapper {
    int countByExample(WsVatTaxKeyExample example);

    int deleteByExample(WsVatTaxKeyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatTaxKey record);

    int insertSelective(WsVatTaxKey record);

    List<WsVatTaxKey> selectByExample(WsVatTaxKeyExample example);

    WsVatTaxKey selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatTaxKey record, @Param("example") WsVatTaxKeyExample example);

    int updateByExample(@Param("record") WsVatTaxKey record, @Param("example") WsVatTaxKeyExample example);

    int updateByPrimaryKeySelective(WsVatTaxKey record);

    int updateByPrimaryKey(WsVatTaxKey record);
}