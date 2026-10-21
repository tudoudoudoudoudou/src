package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtRpt;
import com.gingkoo.rpt.dbsvr.server.bean.PmVvtRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVvtRptMapper extends TableMapper {
    int countByExample(PmVvtRptExample example);

    int deleteByExample(PmVvtRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVvtRpt record);

    int insertSelective(PmVvtRpt record);

    List<PmVvtRpt> selectByExample(PmVvtRptExample example);

    PmVvtRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVvtRpt record, @Param("example") PmVvtRptExample example);

    int updateByExample(@Param("record") PmVvtRpt record, @Param("example") PmVvtRptExample example);

    int updateByPrimaryKeySelective(PmVvtRpt record);

    int updateByPrimaryKey(PmVvtRpt record);
}