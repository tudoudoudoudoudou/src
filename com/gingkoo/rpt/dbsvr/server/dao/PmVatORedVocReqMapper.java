package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatORedVocReq;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatORedVocReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatORedVocReqMapper extends TableMapper {
    int countByExample(PmVatORedVocReqExample example);

    int deleteByExample(PmVatORedVocReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatORedVocReq record);

    int insertSelective(PmVatORedVocReq record);

    List<PmVatORedVocReq> selectByExample(PmVatORedVocReqExample example);

    PmVatORedVocReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatORedVocReq record, @Param("example") PmVatORedVocReqExample example);

    int updateByExample(@Param("record") PmVatORedVocReq record, @Param("example") PmVatORedVocReqExample example);

    int updateByPrimaryKeySelective(PmVatORedVocReq record);

    int updateByPrimaryKey(PmVatORedVocReq record);
}