package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatIIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatIIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatIIdRuleMapper extends TableMapper {
    int countByExample(WsVatIIdRuleExample example);

    int deleteByExample(WsVatIIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatIIdRule record);

    int insertSelective(WsVatIIdRule record);

    List<WsVatIIdRule> selectByExample(WsVatIIdRuleExample example);

    WsVatIIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatIIdRule record, @Param("example") WsVatIIdRuleExample example);

    int updateByExample(@Param("record") WsVatIIdRule record, @Param("example") WsVatIIdRuleExample example);

    int updateByPrimaryKeySelective(WsVatIIdRule record);

    int updateByPrimaryKey(WsVatIIdRule record);
}