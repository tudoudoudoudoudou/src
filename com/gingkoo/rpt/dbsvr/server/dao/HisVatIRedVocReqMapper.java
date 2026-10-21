package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIRedVocReq;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIRedVocReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIRedVocReqMapper extends TableMapper {
    int countByExample(HisVatIRedVocReqExample example);

    int deleteByExample(HisVatIRedVocReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIRedVocReq record);

    int insertSelective(HisVatIRedVocReq record);

    List<HisVatIRedVocReq> selectByExample(HisVatIRedVocReqExample example);

    HisVatIRedVocReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIRedVocReq record, @Param("example") HisVatIRedVocReqExample example);

    int updateByExample(@Param("record") HisVatIRedVocReq record, @Param("example") HisVatIRedVocReqExample example);

    int updateByPrimaryKeySelective(HisVatIRedVocReq record);

    int updateByPrimaryKey(HisVatIRedVocReq record);
}