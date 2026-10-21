package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIVocDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIVocDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIVocDtlMapper extends TableMapper {
    int countByExample(HisVatIVocDtlExample example);

    int deleteByExample(HisVatIVocDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIVocDtl record);

    int insertSelective(HisVatIVocDtl record);

    List<HisVatIVocDtl> selectByExample(HisVatIVocDtlExample example);

    HisVatIVocDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIVocDtl record, @Param("example") HisVatIVocDtlExample example);

    int updateByExample(@Param("record") HisVatIVocDtl record, @Param("example") HisVatIVocDtlExample example);

    int updateByPrimaryKeySelective(HisVatIVocDtl record);

    int updateByPrimaryKey(HisVatIVocDtl record);
}