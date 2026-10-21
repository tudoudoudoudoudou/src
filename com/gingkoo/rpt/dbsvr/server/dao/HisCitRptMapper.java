package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitRpt;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitRptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisCitRptMapper extends TableMapper {
    int countByExample(HisCitRptExample example);

    int deleteByExample(HisCitRptExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisCitRpt record);

    int insertSelective(HisCitRpt record);

    List<HisCitRpt> selectByExample(HisCitRptExample example);

    HisCitRpt selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisCitRpt record, @Param("example") HisCitRptExample example);

    int updateByExample(@Param("record") HisCitRpt record, @Param("example") HisCitRptExample example);

    int updateByPrimaryKeySelective(HisCitRpt record);

    int updateByPrimaryKey(HisCitRpt record);
}