package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutTxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLutTxRptMapper extends TableMapper {
    int countByExample(PmLutTxRptExample example);

    int deleteByExample(PmLutTxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmLutTxRpt record);

    int insertSelective(PmLutTxRpt record);

    List<PmLutTxRpt> selectByExample(PmLutTxRptExample example);

    PmLutTxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmLutTxRpt record, @Param("example") PmLutTxRptExample example);

    int updateByExample(@Param("record") PmLutTxRpt record, @Param("example") PmLutTxRptExample example);

    int updateByPrimaryKeySelective(PmLutTxRpt record);

    int updateByPrimaryKey(PmLutTxRpt record);
}