package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIIdRuleList;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIIdRuleListExample;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIIdRuleListKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIIdRuleListMapper extends TableMapper {
    int countByExample(PmVatIIdRuleListExample example);

    int deleteByExample(PmVatIIdRuleListExample example);

    int deleteByPrimaryKey(PmVatIIdRuleListKey key);

    int insert(PmVatIIdRuleList record);

    int insertSelective(PmVatIIdRuleList record);

    List<PmVatIIdRuleList> selectByExample(PmVatIIdRuleListExample example);

    PmVatIIdRuleList selectByPrimaryKey(PmVatIIdRuleListKey key);

    int updateByExampleSelective(@Param("record") PmVatIIdRuleList record, @Param("example") PmVatIIdRuleListExample example);

    int updateByExample(@Param("record") PmVatIIdRuleList record, @Param("example") PmVatIIdRuleListExample example);

    int updateByPrimaryKeySelective(PmVatIIdRuleList record);

    int updateByPrimaryKey(PmVatIIdRuleList record);
}