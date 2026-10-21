package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtReqDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVvtReqDtlMapper extends TableMapper {
    int countByExample(HisVvtReqDtlExample example);

    int deleteByExample(HisVvtReqDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVvtReqDtl record);

    int insertSelective(HisVvtReqDtl record);

    List<HisVvtReqDtl> selectByExample(HisVvtReqDtlExample example);

    HisVvtReqDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVvtReqDtl record, @Param("example") HisVvtReqDtlExample example);

    int updateByExample(@Param("record") HisVvtReqDtl record, @Param("example") HisVvtReqDtlExample example);

    int updateByPrimaryKeySelective(HisVvtReqDtl record);

    int updateByPrimaryKey(HisVvtReqDtl record);
}