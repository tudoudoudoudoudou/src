package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatPayR;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatPayRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatPayRMapper extends TableMapper {
    int countByExample(HisVatPayRExample example);

    int deleteByExample(HisVatPayRExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatPayR record);

    int insertSelective(HisVatPayR record);

    List<HisVatPayR> selectByExample(HisVatPayRExample example);

    HisVatPayR selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatPayR record, @Param("example") HisVatPayRExample example);

    int updateByExample(@Param("record") HisVatPayR record, @Param("example") HisVatPayRExample example);

    int updateByPrimaryKeySelective(HisVatPayR record);

    int updateByPrimaryKey(HisVatPayR record);
}