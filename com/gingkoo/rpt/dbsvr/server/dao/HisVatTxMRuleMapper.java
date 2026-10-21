package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxMRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxMRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTxMRuleMapper extends TableMapper {
    int countByExample(HisVatTxMRuleExample example);

    int deleteByExample(HisVatTxMRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTxMRule record);

    int insertSelective(HisVatTxMRule record);

    List<HisVatTxMRule> selectByExample(HisVatTxMRuleExample example);

    HisVatTxMRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTxMRule record, @Param("example") HisVatTxMRuleExample example);

    int updateByExample(@Param("record") HisVatTxMRule record, @Param("example") HisVatTxMRuleExample example);

    int updateByPrimaryKeySelective(HisVatTxMRule record);

    int updateByPrimaryKey(HisVatTxMRule record);
}