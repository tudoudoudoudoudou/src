package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtReq;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVvtReqMapper extends TableMapper {
    int countByExample(PmVvtReqExample example);

    int deleteByExample(PmVvtReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVvtReq record);

    int insertSelective(PmVvtReq record);

    List<PmVvtReq> selectByExample(PmVvtReqExample example);

    PmVvtReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVvtReq record, @Param("example") PmVvtReqExample example);

    int updateByExample(@Param("record") PmVvtReq record, @Param("example") PmVvtReqExample example);

    int updateByPrimaryKeySelective(PmVvtReq record);

    int updateByPrimaryKey(PmVvtReq record);
}