package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmStTxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmStTxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmStTxRptMapper extends TableMapper {
    int countByExample(PmStTxRptExample example);

    int deleteByExample(PmStTxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmStTxRpt record);

    int insertSelective(PmStTxRpt record);

    List<PmStTxRpt> selectByExample(PmStTxRptExample example);

    PmStTxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmStTxRpt record, @Param("example") PmStTxRptExample example);

    int updateByExample(@Param("record") PmStTxRpt record, @Param("example") PmStTxRptExample example);

    int updateByPrimaryKeySelective(PmStTxRpt record);

    int updateByPrimaryKey(PmStTxRpt record);
}