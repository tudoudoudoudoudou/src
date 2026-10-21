package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpress;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatExpressMapper extends TableMapper {
    int countByExample(HisVatExpressExample example);

    int deleteByExample(HisVatExpressExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatExpress record);

    int insertSelective(HisVatExpress record);

    List<HisVatExpress> selectByExample(HisVatExpressExample example);

    HisVatExpress selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatExpress record, @Param("example") HisVatExpressExample example);

    int updateByExample(@Param("record") HisVatExpress record, @Param("example") HisVatExpressExample example);

    int updateByPrimaryKeySelective(HisVatExpress record);

    int updateByPrimaryKey(HisVatExpress record);
}