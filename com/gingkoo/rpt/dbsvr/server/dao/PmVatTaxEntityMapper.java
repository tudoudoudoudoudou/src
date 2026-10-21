package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxEntity;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxEntityMapper extends TableMapper {
    long countByExample(PmVatTaxEntityExample example);

    int deleteByExample(PmVatTaxEntityExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxEntity record);

    int insertSelective(PmVatTaxEntity record);

    List<PmVatTaxEntity> selectByExample(PmVatTaxEntityExample example);

    PmVatTaxEntity selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxEntity record, @Param("example") PmVatTaxEntityExample example);

    int updateByExample(@Param("record") PmVatTaxEntity record, @Param("example") PmVatTaxEntityExample example);

    int updateByPrimaryKeySelective(PmVatTaxEntity record);

    int updateByPrimaryKey(PmVatTaxEntity record);
}