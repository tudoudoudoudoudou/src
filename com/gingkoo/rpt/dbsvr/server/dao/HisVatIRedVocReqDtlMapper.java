package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIRedVocReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIRedVocReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIRedVocReqDtlMapper extends TableMapper {
    int countByExample(HisVatIRedVocReqDtlExample example);

    int deleteByExample(HisVatIRedVocReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIRedVocReqDtl record);

    int insertSelective(HisVatIRedVocReqDtl record);

    List<HisVatIRedVocReqDtl> selectByExample(HisVatIRedVocReqDtlExample example);

    HisVatIRedVocReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIRedVocReqDtl record, @Param("example") HisVatIRedVocReqDtlExample example);

    int updateByExample(@Param("record") HisVatIRedVocReqDtl record, @Param("example") HisVatIRedVocReqDtlExample example);

    int updateByPrimaryKeySelective(HisVatIRedVocReqDtl record);

    int updateByPrimaryKey(HisVatIRedVocReqDtl record);
}