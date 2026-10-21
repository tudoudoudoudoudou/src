package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatActEntry;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatActEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatActEntryMapper extends TableMapper {
    int countByExample(OdsXlsVatActEntryExample example);

    int deleteByExample(OdsXlsVatActEntryExample example);

    int insert(OdsXlsVatActEntry record);

    int insertSelective(OdsXlsVatActEntry record);

    List<OdsXlsVatActEntry> selectByExample(OdsXlsVatActEntryExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatActEntry record, @Param("example") OdsXlsVatActEntryExample example);

    int updateByExample(@Param("record") OdsXlsVatActEntry record, @Param("example") OdsXlsVatActEntryExample example);
}