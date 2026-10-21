package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmHptReqDtlMapper extends TableMapper {
    int countByExample(PmHptReqDtlExample example);

    int deleteByExample(PmHptReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmHptReqDtl record);

    int insertSelective(PmHptReqDtl record);

    List<PmHptReqDtl> selectByExample(PmHptReqDtlExample example);

    PmHptReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmHptReqDtl record, @Param("example") PmHptReqDtlExample example);

    int updateByExample(@Param("record") PmHptReqDtl record, @Param("example") PmHptReqDtlExample example);

    int updateByPrimaryKeySelective(PmHptReqDtl record);

    int updateByPrimaryKey(PmHptReqDtl record);
}