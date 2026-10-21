package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIRedVocReq;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIRedVocReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIRedVocReqMapper extends TableMapper {
    int countByExample(PmVatIRedVocReqExample example);

    int deleteByExample(PmVatIRedVocReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIRedVocReq record);

    int insertSelective(PmVatIRedVocReq record);

    List<PmVatIRedVocReq> selectByExample(PmVatIRedVocReqExample example);

    PmVatIRedVocReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIRedVocReq record, @Param("example") PmVatIRedVocReqExample example);

    int updateByExample(@Param("record") PmVatIRedVocReq record, @Param("example") PmVatIRedVocReqExample example);

    int updateByPrimaryKeySelective(PmVatIRedVocReq record);

    int updateByPrimaryKey(PmVatIRedVocReq record);
}