package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtReq;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVvtReqMapper extends TableMapper {
    int countByExample(HisVvtReqExample example);

    int deleteByExample(HisVvtReqExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVvtReq record);

    int insertSelective(HisVvtReq record);

    List<HisVvtReq> selectByExample(HisVvtReqExample example);

    HisVvtReq selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVvtReq record, @Param("example") HisVvtReqExample example);

    int updateByExample(@Param("record") HisVvtReq record, @Param("example") HisVvtReqExample example);

    int updateByPrimaryKeySelective(HisVvtReq record);

    int updateByPrimaryKey(HisVvtReq record);
}