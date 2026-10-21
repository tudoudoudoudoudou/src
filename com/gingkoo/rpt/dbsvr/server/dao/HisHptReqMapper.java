package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptReq;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisHptReqMapper extends TableMapper {
    int countByExample(HisHptReqExample example);

    int deleteByExample(HisHptReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisHptReq record);

    int insertSelective(HisHptReq record);

    List<HisHptReq> selectByExample(HisHptReqExample example);

    HisHptReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisHptReq record, @Param("example") HisHptReqExample example);

    int updateByExample(@Param("record") HisHptReq record, @Param("example") HisHptReqExample example);

    int updateByPrimaryKeySelective(HisHptReq record);

    int updateByPrimaryKey(HisHptReq record);
}