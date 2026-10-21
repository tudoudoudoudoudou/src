package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitEntrySum;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitEntrySumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmCitEntrySumMapper extends TableMapper {
    int countByExample(PmCitEntrySumExample example);

    int deleteByExample(PmCitEntrySumExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmCitEntrySum record);

    int insertSelective(PmCitEntrySum record);

    List<PmCitEntrySum> selectByExample(PmCitEntrySumExample example);

    PmCitEntrySum selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmCitEntrySum record, @Param("example") PmCitEntrySumExample example);

    int updateByExample(@Param("record") PmCitEntrySum record, @Param("example") PmCitEntrySumExample example);

    int updateByPrimaryKeySelective(PmCitEntrySum record);

    int updateByPrimaryKey(PmCitEntrySum record);
}