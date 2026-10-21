package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIVocDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIVocDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIVocDtlMapper extends TableMapper {
    int countByExample(PmVatIVocDtlExample example);

    int deleteByExample(PmVatIVocDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIVocDtl record);

    int insertSelective(PmVatIVocDtl record);

    List<PmVatIVocDtl> selectByExample(PmVatIVocDtlExample example);

    PmVatIVocDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIVocDtl record, @Param("example") PmVatIVocDtlExample example);

    int updateByExample(@Param("record") PmVatIVocDtl record, @Param("example") PmVatIVocDtlExample example);

    int updateByPrimaryKeySelective(PmVatIVocDtl record);

    int updateByPrimaryKey(PmVatIVocDtl record);
}