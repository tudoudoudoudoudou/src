package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitRptDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitRptDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisCitRptDtlMapper extends TableMapper {
    int countByExample(HisCitRptDtlExample example);

    int deleteByExample(HisCitRptDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisCitRptDtl record);

    int insertSelective(HisCitRptDtl record);

    List<HisCitRptDtl> selectByExample(HisCitRptDtlExample example);

    HisCitRptDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisCitRptDtl record, @Param("example") HisCitRptDtlExample example);

    int updateByExample(@Param("record") HisCitRptDtl record, @Param("example") HisCitRptDtlExample example);

    int updateByPrimaryKeySelective(HisCitRptDtl record);

    int updateByPrimaryKey(HisCitRptDtl record);
}