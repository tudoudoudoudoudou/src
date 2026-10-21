package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatActEntry;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatActEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatActEntryMapper extends TableMapper {
    int countByExample(HisVatActEntryExample example);

    int deleteByExample(HisVatActEntryExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatActEntry record);

    int insertSelective(HisVatActEntry record);

    List<HisVatActEntry> selectByExample(HisVatActEntryExample example);

    HisVatActEntry selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatActEntry record, @Param("example") HisVatActEntryExample example);

    int updateByExample(@Param("record") HisVatActEntry record, @Param("example") HisVatActEntryExample example);

    int updateByPrimaryKeySelective(HisVatActEntry record);

    int updateByPrimaryKey(HisVatActEntry record);
}