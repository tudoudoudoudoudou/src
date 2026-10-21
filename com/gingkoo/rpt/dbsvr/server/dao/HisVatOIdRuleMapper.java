package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatOIdRuleMapper extends TableMapper {
    int countByExample(HisVatOIdRuleExample example);

    int deleteByExample(HisVatOIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatOIdRule record);

    int insertSelective(HisVatOIdRule record);

    List<HisVatOIdRule> selectByExample(HisVatOIdRuleExample example);

    HisVatOIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatOIdRule record, @Param("example") HisVatOIdRuleExample example);

    int updateByExample(@Param("record") HisVatOIdRule record, @Param("example") HisVatOIdRuleExample example);

    int updateByPrimaryKeySelective(HisVatOIdRule record);

    int updateByPrimaryKey(HisVatOIdRule record);
}