package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxSRule;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxSRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTxSRuleMapper extends TableMapper {
    int countByExample(PmVatTxSRuleExample example);

    int deleteByExample(PmVatTxSRuleExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTxSRule record);

    int insertSelective(PmVatTxSRule record);

    List<PmVatTxSRule> selectByExample(PmVatTxSRuleExample example);

    PmVatTxSRule selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTxSRule record, @Param("example") PmVatTxSRuleExample example);

    int updateByExample(@Param("record") PmVatTxSRule record, @Param("example") PmVatTxSRuleExample example);

    int updateByPrimaryKeySelective(PmVatTxSRule record);

    int updateByPrimaryKey(PmVatTxSRule record);
}