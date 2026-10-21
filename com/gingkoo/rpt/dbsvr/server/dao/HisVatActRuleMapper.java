package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatActRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatActRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatActRuleMapper extends TableMapper {
    int countByExample(HisVatActRuleExample example);

    int deleteByExample(HisVatActRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatActRule record);

    int insertSelective(HisVatActRule record);

    List<HisVatActRule> selectByExample(HisVatActRuleExample example);

    HisVatActRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatActRule record, @Param("example") HisVatActRuleExample example);

    int updateByExample(@Param("record") HisVatActRule record, @Param("example") HisVatActRuleExample example);

    int updateByPrimaryKeySelective(HisVatActRule record);

    int updateByPrimaryKey(HisVatActRule record);
}