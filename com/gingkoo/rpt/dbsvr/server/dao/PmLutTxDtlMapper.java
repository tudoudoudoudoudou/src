package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxDtlExample;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxDtlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLutTxDtlMapper extends TableMapper {
    int countByExample(PmLutTxDtlExample example);

    int deleteByExample(PmLutTxDtlExample example);

    int deleteByPrimaryKey(PmLutTxDtlKey key);

    int insert(PmLutTxDtl record);

    int insertSelective(PmLutTxDtl record);

    List<PmLutTxDtl> selectByExample(PmLutTxDtlExample example);

    PmLutTxDtl selectByPrimaryKey(PmLutTxDtlKey key);

    int updateByExampleSelective(@Param("record") PmLutTxDtl record, @Param("example") PmLutTxDtlExample example);

    int updateByExample(@Param("record") PmLutTxDtl record, @Param("example") PmLutTxDtlExample example);

    int updateByPrimaryKeySelective(PmLutTxDtl record);

    int updateByPrimaryKey(PmLutTxDtl record);
}