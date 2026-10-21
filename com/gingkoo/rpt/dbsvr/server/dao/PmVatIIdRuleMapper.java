package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIIdRuleMapper extends TableMapper {
    int countByExample(PmVatIIdRuleExample example);

    int deleteByExample(PmVatIIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIIdRule record);

    int insertSelective(PmVatIIdRule record);

    List<PmVatIIdRule> selectByExample(PmVatIIdRuleExample example);

    PmVatIIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIIdRule record, @Param("example") PmVatIIdRuleExample example);

    int updateByExample(@Param("record") PmVatIIdRule record, @Param("example") PmVatIIdRuleExample example);

    int updateByPrimaryKeySelective(PmVatIIdRule record);

    int updateByPrimaryKey(PmVatIIdRule record);
}