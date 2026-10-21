package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatPayB;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatPayBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatPayBMapper extends TableMapper {
    int countByExample(HisVatPayBExample example);

    int deleteByExample(HisVatPayBExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatPayB record);

    int insertSelective(HisVatPayB record);

    List<HisVatPayB> selectByExample(HisVatPayBExample example);

    HisVatPayB selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatPayB record, @Param("example") HisVatPayBExample example);

    int updateByExample(@Param("record") HisVatPayB record, @Param("example") HisVatPayBExample example);

    int updateByPrimaryKeySelective(HisVatPayB record);

    int updateByPrimaryKey(HisVatPayB record);
}