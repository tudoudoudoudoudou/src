package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatActRule;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatActRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatActRuleMapper extends TableMapper {
    int countByExample(OdsXlsVatActRuleExample example);

    int deleteByExample(OdsXlsVatActRuleExample example);

    int insert(OdsXlsVatActRule record);

    int insertSelective(OdsXlsVatActRule record);

    List<OdsXlsVatActRule> selectByExample(OdsXlsVatActRuleExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatActRule record, @Param("example") OdsXlsVatActRuleExample example);

    int updateByExample(@Param("record") OdsXlsVatActRule record, @Param("example") OdsXlsVatActRuleExample example);
}