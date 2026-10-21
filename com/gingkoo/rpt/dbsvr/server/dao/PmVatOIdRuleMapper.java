package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOIdRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOIdRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatOIdRuleMapper extends TableMapper {
    int countByExample(PmVatOIdRuleExample example);

    int deleteByExample(PmVatOIdRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatOIdRule record);

    int insertSelective(PmVatOIdRule record);

    List<PmVatOIdRule> selectByExample(PmVatOIdRuleExample example);

    PmVatOIdRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatOIdRule record, @Param("example") PmVatOIdRuleExample example);

    int updateByExample(@Param("record") PmVatOIdRule record, @Param("example") PmVatOIdRuleExample example);

    int updateByPrimaryKeySelective(PmVatOIdRule record);

    int updateByPrimaryKey(PmVatOIdRule record);
}