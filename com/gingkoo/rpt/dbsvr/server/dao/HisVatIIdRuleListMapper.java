package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIIdRuleList;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIIdRuleListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIIdRuleListMapper extends TableMapper {
    int countByExample(HisVatIIdRuleListExample example);

    int deleteByExample(HisVatIIdRuleListExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIIdRuleList record);

    int insertSelective(HisVatIIdRuleList record);

    List<HisVatIIdRuleList> selectByExample(HisVatIIdRuleListExample example);

    HisVatIIdRuleList selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIIdRuleList record, @Param("example") HisVatIIdRuleListExample example);

    int updateByExample(@Param("record") HisVatIIdRuleList record, @Param("example") HisVatIIdRuleListExample example);

    int updateByPrimaryKeySelective(HisVatIIdRuleList record);

    int updateByPrimaryKey(HisVatIIdRuleList record);
}