package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxEntity;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxEntityMapper extends TableMapper {
    int countByExample(HisVatTaxEntityExample example);

    int deleteByExample(HisVatTaxEntityExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxEntity record);

    int insertSelective(HisVatTaxEntity record);

    List<HisVatTaxEntity> selectByExample(HisVatTaxEntityExample example);

    HisVatTaxEntity selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxEntity record, @Param("example") HisVatTaxEntityExample example);

    int updateByExample(@Param("record") HisVatTaxEntity record, @Param("example") HisVatTaxEntityExample example);

    int updateByPrimaryKeySelective(HisVatTaxEntity record);

    int updateByPrimaryKey(HisVatTaxEntity record);
}