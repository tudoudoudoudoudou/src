package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxKey;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxKeyMapper extends TableMapper {
    int countByExample(PmVatTaxKeyExample example);

    int deleteByExample(PmVatTaxKeyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxKey record);

    int insertSelective(PmVatTaxKey record);

    List<PmVatTaxKey> selectByExample(PmVatTaxKeyExample example);

    PmVatTaxKey selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxKey record, @Param("example") PmVatTaxKeyExample example);

    int updateByExample(@Param("record") PmVatTaxKey record, @Param("example") PmVatTaxKeyExample example);

    int updateByPrimaryKeySelective(PmVatTaxKey record);

    int updateByPrimaryKey(PmVatTaxKey record);
}