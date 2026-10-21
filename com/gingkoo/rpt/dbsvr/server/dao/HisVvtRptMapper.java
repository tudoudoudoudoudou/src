package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisVvtRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVvtRptMapper extends TableMapper {
    int countByExample(HisVvtRptExample example);

    int deleteByExample(HisVvtRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVvtRpt record);

    int insertSelective(HisVvtRpt record);

    List<HisVvtRpt> selectByExample(HisVvtRptExample example);

    HisVvtRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVvtRpt record, @Param("example") HisVvtRptExample example);

    int updateByExample(@Param("record") HisVvtRpt record, @Param("example") HisVvtRptExample example);

    int updateByPrimaryKeySelective(HisVvtRpt record);

    int updateByPrimaryKey(HisVvtRpt record);
}