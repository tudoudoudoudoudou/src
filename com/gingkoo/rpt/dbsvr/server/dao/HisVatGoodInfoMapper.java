package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatGoodInfo;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatGoodInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatGoodInfoMapper extends TableMapper {
    int countByExample(HisVatGoodInfoExample example);

    int deleteByExample(HisVatGoodInfoExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatGoodInfo record);

    int insertSelective(HisVatGoodInfo record);

    List<HisVatGoodInfo> selectByExample(HisVatGoodInfoExample example);

    HisVatGoodInfo selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatGoodInfo record, @Param("example") HisVatGoodInfoExample example);

    int updateByExample(@Param("record") HisVatGoodInfo record, @Param("example") HisVatGoodInfoExample example);

    int updateByPrimaryKeySelective(HisVatGoodInfo record);

    int updateByPrimaryKey(HisVatGoodInfo record);
}