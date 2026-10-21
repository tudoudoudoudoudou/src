package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatRuleCusts;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatRuleCustsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatRuleCustsMapper extends TableMapper {
    int countByExample(PmVatRuleCustsExample example);

    int deleteByExample(PmVatRuleCustsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatRuleCusts record);

    int insertSelective(PmVatRuleCusts record);

    List<PmVatRuleCusts> selectByExample(PmVatRuleCustsExample example);

    PmVatRuleCusts selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatRuleCusts record, @Param("example") PmVatRuleCustsExample example);

    int updateByExample(@Param("record") PmVatRuleCusts record, @Param("example") PmVatRuleCustsExample example);

    int updateByPrimaryKeySelective(PmVatRuleCusts record);

    int updateByPrimaryKey(PmVatRuleCusts record);
}