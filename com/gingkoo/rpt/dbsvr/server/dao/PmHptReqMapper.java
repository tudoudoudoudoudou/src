package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptReq;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmHptReqMapper extends TableMapper {
    int countByExample(PmHptReqExample example);

    int deleteByExample(PmHptReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmHptReq record);

    int insertSelective(PmHptReq record);

    List<PmHptReq> selectByExample(PmHptReqExample example);

    PmHptReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmHptReq record, @Param("example") PmHptReqExample example);

    int updateByExample(@Param("record") PmHptReq record, @Param("example") PmHptReqExample example);

    int updateByPrimaryKeySelective(PmHptReq record);

    int updateByPrimaryKey(PmHptReq record);
}