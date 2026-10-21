package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisStTxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisStTxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisStTxRptMapper extends TableMapper {
    int countByExample(HisStTxRptExample example);

    int deleteByExample(HisStTxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisStTxRpt record);

    int insertSelective(HisStTxRpt record);

    List<HisStTxRpt> selectByExample(HisStTxRptExample example);

    HisStTxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisStTxRpt record, @Param("example") HisStTxRptExample example);

    int updateByExample(@Param("record") HisStTxRpt record, @Param("example") HisStTxRptExample example);

    int updateByPrimaryKeySelective(HisStTxRpt record);

    int updateByPrimaryKey(HisStTxRpt record);
}