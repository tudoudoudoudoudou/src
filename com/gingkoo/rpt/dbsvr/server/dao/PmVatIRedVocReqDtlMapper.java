package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIRedVocReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIRedVocReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIRedVocReqDtlMapper extends TableMapper {
    int countByExample(PmVatIRedVocReqDtlExample example);

    int deleteByExample(PmVatIRedVocReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIRedVocReqDtl record);

    int insertSelective(PmVatIRedVocReqDtl record);

    List<PmVatIRedVocReqDtl> selectByExample(PmVatIRedVocReqDtlExample example);

    PmVatIRedVocReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIRedVocReqDtl record, @Param("example") PmVatIRedVocReqDtlExample example);

    int updateByExample(@Param("record") PmVatIRedVocReqDtl record, @Param("example") PmVatIRedVocReqDtlExample example);

    int updateByPrimaryKeySelective(PmVatIRedVocReqDtl record);

    int updateByPrimaryKey(PmVatIRedVocReqDtl record);
}