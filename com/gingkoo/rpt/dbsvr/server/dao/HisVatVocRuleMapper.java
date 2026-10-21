package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatVocRuleMapper extends TableMapper {
    int countByExample(HisVatVocRuleExample example);

    int deleteByExample(HisVatVocRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatVocRule record);

    int insertSelective(HisVatVocRule record);

    List<HisVatVocRule> selectByExample(HisVatVocRuleExample example);

    HisVatVocRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatVocRule record, @Param("example") HisVatVocRuleExample example);

    int updateByExample(@Param("record") HisVatVocRule record, @Param("example") HisVatVocRuleExample example);

    int updateByPrimaryKeySelective(HisVatVocRule record);

    int updateByPrimaryKey(HisVatVocRule record);
}