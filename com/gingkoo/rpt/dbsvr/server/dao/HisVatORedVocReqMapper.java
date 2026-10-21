package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatORedVocReq;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatORedVocReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatORedVocReqMapper extends TableMapper {
    int countByExample(HisVatORedVocReqExample example);

    int deleteByExample(HisVatORedVocReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatORedVocReq record);

    int insertSelective(HisVatORedVocReq record);

    List<HisVatORedVocReq> selectByExample(HisVatORedVocReqExample example);

    HisVatORedVocReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatORedVocReq record, @Param("example") HisVatORedVocReqExample example);

    int updateByExample(@Param("record") HisVatORedVocReq record, @Param("example") HisVatORedVocReqExample example);

    int updateByPrimaryKeySelective(HisVatORedVocReq record);

    int updateByPrimaryKey(HisVatORedVocReq record);
}