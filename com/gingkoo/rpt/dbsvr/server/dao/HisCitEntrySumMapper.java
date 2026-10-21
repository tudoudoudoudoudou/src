package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitEntrySum;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitEntrySumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisCitEntrySumMapper extends TableMapper {
    int countByExample(HisCitEntrySumExample example);

    int deleteByExample(HisCitEntrySumExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisCitEntrySum record);

    int insertSelective(HisCitEntrySum record);

    List<HisCitEntrySum> selectByExample(HisCitEntrySumExample example);

    HisCitEntrySum selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisCitEntrySum record, @Param("example") HisCitEntrySumExample example);

    int updateByExample(@Param("record") HisCitEntrySum record, @Param("example") HisCitEntrySumExample example);

    int updateByPrimaryKeySelective(HisCitEntrySum record);

    int updateByPrimaryKey(HisCitEntrySum record);
}