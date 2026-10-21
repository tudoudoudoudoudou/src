package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatOIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatOIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatOIdRuleMapper extends TableMapper {
    int countByExample(WsVatOIdRuleExample example);

    int deleteByExample(WsVatOIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatOIdRule record);

    int insertSelective(WsVatOIdRule record);

    List<WsVatOIdRule> selectByExample(WsVatOIdRuleExample example);

    WsVatOIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatOIdRule record, @Param("example") WsVatOIdRuleExample example);

    int updateByExample(@Param("record") WsVatOIdRule record, @Param("example") WsVatOIdRuleExample example);

    int updateByPrimaryKeySelective(WsVatOIdRule record);

    int updateByPrimaryKey(WsVatOIdRule record);
}