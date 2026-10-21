package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtReqDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtReqDtlExample;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtReqDtlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVvtReqDtlMapper extends TableMapper {
    int countByExample(PmVvtReqDtlExample example);

    int deleteByExample(PmVvtReqDtlExample example);

    int deleteByPrimaryKey(PmVvtReqDtlKey key);

    int insert(PmVvtReqDtl record);

    int insertSelective(PmVvtReqDtl record);

    List<PmVvtReqDtl> selectByExample(PmVvtReqDtlExample example);

    PmVvtReqDtl selectByPrimaryKey(PmVvtReqDtlKey key);

    int updateByExampleSelective(@Param("record") PmVvtReqDtl record, @Param("example") PmVvtReqDtlExample example);

    int updateByExample(@Param("record") PmVvtReqDtl record, @Param("example") PmVvtReqDtlExample example);

    int updateByPrimaryKeySelective(PmVvtReqDtl record);

    int updateByPrimaryKey(PmVvtReqDtl record);
}