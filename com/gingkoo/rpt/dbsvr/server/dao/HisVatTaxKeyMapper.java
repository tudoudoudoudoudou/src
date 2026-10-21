package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxKey;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxKeyMapper extends TableMapper {
    int countByExample(HisVatTaxKeyExample example);

    int deleteByExample(HisVatTaxKeyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxKey record);

    int insertSelective(HisVatTaxKey record);

    List<HisVatTaxKey> selectByExample(HisVatTaxKeyExample example);

    HisVatTaxKey selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxKey record, @Param("example") HisVatTaxKeyExample example);

    int updateByExample(@Param("record") HisVatTaxKey record, @Param("example") HisVatTaxKeyExample example);

    int updateByPrimaryKeySelective(HisVatTaxKey record);

    int updateByPrimaryKey(HisVatTaxKey record);
}