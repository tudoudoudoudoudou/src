package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTxDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTxDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLutTxDtlMapper extends TableMapper {
    int countByExample(HisLutTxDtlExample example);

    int deleteByExample(HisLutTxDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLutTxDtl record);

    int insertSelective(HisLutTxDtl record);

    List<HisLutTxDtl> selectByExample(HisLutTxDtlExample example);

    HisLutTxDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLutTxDtl record, @Param("example") HisLutTxDtlExample example);

    int updateByExample(@Param("record") HisLutTxDtl record, @Param("example") HisLutTxDtlExample example);

    int updateByPrimaryKeySelective(HisLutTxDtl record);

    int updateByPrimaryKey(HisLutTxDtl record);
}