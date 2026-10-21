package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatActRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatActRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatActRuleMapper extends TableMapper {
    int countByExample(PmVatActRuleExample example);

    int deleteByExample(PmVatActRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatActRule record);

    int insertSelective(PmVatActRule record);

    List<PmVatActRule> selectByExample(PmVatActRuleExample example);

    PmVatActRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatActRule record, @Param("example") PmVatActRuleExample example);

    int updateByExample(@Param("record") PmVatActRule record, @Param("example") PmVatActRuleExample example);

    int updateByPrimaryKeySelective(PmVatActRule record);

    int updateByPrimaryKey(PmVatActRule record);
}