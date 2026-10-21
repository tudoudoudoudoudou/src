package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatVocRuleMapper extends TableMapper {
    int countByExample(PmVatVocRuleExample example);

    int deleteByExample(PmVatVocRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatVocRule record);

    int insertSelective(PmVatVocRule record);

    List<PmVatVocRule> selectByExample(PmVatVocRuleExample example);

    PmVatVocRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatVocRule record, @Param("example") PmVatVocRuleExample example);

    int updateByExample(@Param("record") PmVatVocRule record, @Param("example") PmVatVocRuleExample example);

    int updateByPrimaryKeySelective(PmVatVocRule record);

    int updateByPrimaryKey(PmVatVocRule record);
}