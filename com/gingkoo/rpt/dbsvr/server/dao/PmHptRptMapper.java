package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmHptRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmHptRptMapper extends TableMapper {
    int countByExample(PmHptRptExample example);

    int deleteByExample(PmHptRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmHptRpt record);

    int insertSelective(PmHptRpt record);

    List<PmHptRpt> selectByExample(PmHptRptExample example);

    PmHptRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmHptRpt record, @Param("example") PmHptRptExample example);

    int updateByExample(@Param("record") PmHptRpt record, @Param("example") PmHptRptExample example);

    int updateByPrimaryKeySelective(PmHptRpt record);

    int updateByPrimaryKey(PmHptRpt record);
}