package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIIdRuleMapper extends TableMapper {
    int countByExample(HisVatIIdRuleExample example);

    int deleteByExample(HisVatIIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIIdRule record);

    int insertSelective(HisVatIIdRule record);

    List<HisVatIIdRule> selectByExample(HisVatIIdRuleExample example);

    HisVatIIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIIdRule record, @Param("example") HisVatIIdRuleExample example);

    int updateByExample(@Param("record") HisVatIIdRule record, @Param("example") HisVatIIdRuleExample example);

    int updateByPrimaryKeySelective(HisVatIIdRule record);

    int updateByPrimaryKey(HisVatIIdRule record);
}