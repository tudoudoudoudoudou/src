package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTxRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutTxRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLutTxRptMapper extends TableMapper {
    int countByExample(HisLutTxRptExample example);

    int deleteByExample(HisLutTxRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLutTxRpt record);

    int insertSelective(HisLutTxRpt record);

    List<HisLutTxRpt> selectByExample(HisLutTxRptExample example);

    HisLutTxRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLutTxRpt record, @Param("example") HisLutTxRptExample example);

    int updateByExample(@Param("record") HisLutTxRpt record, @Param("example") HisLutTxRptExample example);

    int updateByPrimaryKeySelective(HisLutTxRpt record);

    int updateByPrimaryKey(HisLutTxRpt record);
}