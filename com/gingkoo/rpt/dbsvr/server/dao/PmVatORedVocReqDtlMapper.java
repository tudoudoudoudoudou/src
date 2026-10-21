package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatORedVocReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatORedVocReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatORedVocReqDtlMapper extends TableMapper {
    int countByExample(PmVatORedVocReqDtlExample example);

    int deleteByExample(PmVatORedVocReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatORedVocReqDtl record);

    int insertSelective(PmVatORedVocReqDtl record);

    List<PmVatORedVocReqDtl> selectByExample(PmVatORedVocReqDtlExample example);

    PmVatORedVocReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatORedVocReqDtl record, @Param("example") PmVatORedVocReqDtlExample example);

    int updateByExample(@Param("record") PmVatORedVocReqDtl record, @Param("example") PmVatORedVocReqDtlExample example);

    int updateByPrimaryKeySelective(PmVatORedVocReqDtl record);

    int updateByPrimaryKey(PmVatORedVocReqDtl record);
}