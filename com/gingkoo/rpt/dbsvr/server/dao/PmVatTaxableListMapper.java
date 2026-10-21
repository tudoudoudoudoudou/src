package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxableList;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxableListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxableListMapper extends TableMapper {
    int countByExample(PmVatTaxableListExample example);

    int deleteByExample(PmVatTaxableListExample example);

    int deleteByPrimaryKey(String taxableCode);

    int insert(PmVatTaxableList record);

    int insertSelective(PmVatTaxableList record);

    List<PmVatTaxableList> selectByExample(PmVatTaxableListExample example);

    PmVatTaxableList selectByPrimaryKey(String taxableCode);

    int updateByExampleSelective(@Param("record") PmVatTaxableList record, @Param("example") PmVatTaxableListExample example);

    int updateByExample(@Param("record") PmVatTaxableList record, @Param("example") PmVatTaxableListExample example);

    int updateByPrimaryKeySelective(PmVatTaxableList record);

    int updateByPrimaryKey(PmVatTaxableList record);
}