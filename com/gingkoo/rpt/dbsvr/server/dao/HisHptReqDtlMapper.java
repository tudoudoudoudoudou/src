package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisHptReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisHptReqDtlMapper extends TableMapper {
    int countByExample(HisHptReqDtlExample example);

    int deleteByExample(HisHptReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisHptReqDtl record);

    int insertSelective(HisHptReqDtl record);

    List<HisHptReqDtl> selectByExample(HisHptReqDtlExample example);

    HisHptReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisHptReqDtl record, @Param("example") HisHptReqDtlExample example);

    int updateByExample(@Param("record") HisHptReqDtl record, @Param("example") HisHptReqDtlExample example);

    int updateByPrimaryKeySelective(HisHptReqDtl record);

    int updateByPrimaryKey(HisHptReqDtl record);
}