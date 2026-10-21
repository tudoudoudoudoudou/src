package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatORedVocReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatORedVocReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatORedVocReqDtlMapper extends TableMapper {
    int countByExample(HisVatORedVocReqDtlExample example);

    int deleteByExample(HisVatORedVocReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatORedVocReqDtl record);

    int insertSelective(HisVatORedVocReqDtl record);

    List<HisVatORedVocReqDtl> selectByExample(HisVatORedVocReqDtlExample example);

    HisVatORedVocReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatORedVocReqDtl record, @Param("example") HisVatORedVocReqDtlExample example);

    int updateByExample(@Param("record") HisVatORedVocReqDtl record, @Param("example") HisVatORedVocReqDtlExample example);

    int updateByPrimaryKeySelective(HisVatORedVocReqDtl record);

    int updateByPrimaryKey(HisVatORedVocReqDtl record);
}