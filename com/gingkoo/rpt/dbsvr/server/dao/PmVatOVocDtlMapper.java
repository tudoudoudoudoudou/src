package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatOVocDtlMapper extends TableMapper {
    long countByExample(PmVatOVocDtlExample example);

    int deleteByExample(PmVatOVocDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatOVocDtl record);

    int insertSelective(PmVatOVocDtl record);

    List<PmVatOVocDtl> selectByExample(PmVatOVocDtlExample example);

    PmVatOVocDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatOVocDtl record, @Param("example") PmVatOVocDtlExample example);

    int updateByExample(@Param("record") PmVatOVocDtl record, @Param("example") PmVatOVocDtlExample example);

    int updateByPrimaryKeySelective(PmVatOVocDtl record);

    int updateByPrimaryKey(PmVatOVocDtl record);
}