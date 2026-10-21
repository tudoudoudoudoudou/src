package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatBVocBuy;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatBVocBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatBVocBuyMapper extends TableMapper {
    int countByExample(HisVatBVocBuyExample example);

    int deleteByExample(HisVatBVocBuyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatBVocBuy record);

    int insertSelective(HisVatBVocBuy record);

    List<HisVatBVocBuy> selectByExample(HisVatBVocBuyExample example);

    HisVatBVocBuy selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatBVocBuy record, @Param("example") HisVatBVocBuyExample example);

    int updateByExample(@Param("record") HisVatBVocBuy record, @Param("example") HisVatBVocBuyExample example);

    int updateByPrimaryKeySelective(HisVatBVocBuy record);

    int updateByPrimaryKey(HisVatBVocBuy record);
}