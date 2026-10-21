package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxSRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxSRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTxSRuleMapper extends TableMapper {
    int countByExample(HisVatTxSRuleExample example);

    int deleteByExample(HisVatTxSRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTxSRule record);

    int insertSelective(HisVatTxSRule record);

    List<HisVatTxSRule> selectByExample(HisVatTxSRuleExample example);

    HisVatTxSRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTxSRule record, @Param("example") HisVatTxSRuleExample example);

    int updateByExample(@Param("record") HisVatTxSRule record, @Param("example") HisVatTxSRuleExample example);

    int updateByPrimaryKeySelective(HisVatTxSRule record);

    int updateByPrimaryKey(HisVatTxSRule record);
}