package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVocBuy;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVocBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatBVocBuyMapper extends TableMapper {
    int countByExample(PmVatBVocBuyExample example);

    int deleteByExample(PmVatBVocBuyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatBVocBuy record);

    int insertSelective(PmVatBVocBuy record);

    List<PmVatBVocBuy> selectByExample(PmVatBVocBuyExample example);

    PmVatBVocBuy selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatBVocBuy record, @Param("example") PmVatBVocBuyExample example);

    int updateByExample(@Param("record") PmVatBVocBuy record, @Param("example") PmVatBVocBuyExample example);

    int updateByPrimaryKeySelective(PmVatBVocBuy record);

    int updateByPrimaryKey(PmVatBVocBuy record);
}