package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatActEntry;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatActEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatActEntryMapper extends TableMapper {
    int countByExample(PmVatActEntryExample example);

    int deleteByExample(PmVatActEntryExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatActEntry record);

    int insertSelective(PmVatActEntry record);

    List<PmVatActEntry> selectByExample(PmVatActEntryExample example);

    PmVatActEntry selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatActEntry record, @Param("example") PmVatActEntryExample example);

    int updateByExample(@Param("record") PmVatActEntry record, @Param("example") PmVatActEntryExample example);

    int updateByPrimaryKeySelective(PmVatActEntry record);

    int updateByPrimaryKey(PmVatActEntry record);
}