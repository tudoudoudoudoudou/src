package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVocDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVocDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatOVocDtlMapper extends TableMapper {
    int countByExample(HisVatOVocDtlExample example);

    int deleteByExample(HisVatOVocDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatOVocDtl record);

    int insertSelective(HisVatOVocDtl record);

    List<HisVatOVocDtl> selectByExample(HisVatOVocDtlExample example);

    HisVatOVocDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatOVocDtl record, @Param("example") HisVatOVocDtlExample example);

    int updateByExample(@Param("record") HisVatOVocDtl record, @Param("example") HisVatOVocDtlExample example);

    int updateByPrimaryKeySelective(HisVatOVocDtl record);

    int updateByPrimaryKey(HisVatOVocDtl record);
}