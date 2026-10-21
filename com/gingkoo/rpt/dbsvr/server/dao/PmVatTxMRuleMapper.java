package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxMRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxMRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTxMRuleMapper extends TableMapper {
    int countByExample(PmVatTxMRuleExample example);

    int deleteByExample(PmVatTxMRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTxMRule record);

    int insertSelective(PmVatTxMRule record);

    List<PmVatTxMRule> selectByExample(PmVatTxMRuleExample example);

    PmVatTxMRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTxMRule record, @Param("example") PmVatTxMRuleExample example);

    int updateByExample(@Param("record") PmVatTxMRule record, @Param("example") PmVatTxMRuleExample example);

    int updateByPrimaryKeySelective(PmVatTxMRule record);

    int updateByPrimaryKey(PmVatTxMRule record);
}