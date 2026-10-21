package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatRuleCusts;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatRuleCustsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatRuleCustsMapper extends TableMapper {
    int countByExample(HisVatRuleCustsExample example);

    int deleteByExample(HisVatRuleCustsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatRuleCusts record);

    int insertSelective(HisVatRuleCusts record);

    List<HisVatRuleCusts> selectByExample(HisVatRuleCustsExample example);

    HisVatRuleCusts selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatRuleCusts record, @Param("example") HisVatRuleCustsExample example);

    int updateByExample(@Param("record") HisVatRuleCusts record, @Param("example") HisVatRuleCustsExample example);

    int updateByPrimaryKeySelective(HisVatRuleCusts record);

    int updateByPrimaryKey(HisVatRuleCusts record);
}