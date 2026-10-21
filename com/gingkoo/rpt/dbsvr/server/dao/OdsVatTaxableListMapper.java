package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTaxableList;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTaxableListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatTaxableListMapper extends TableMapper {
    int countByExample(OdsVatTaxableListExample example);

    int deleteByExample(OdsVatTaxableListExample example);

    int deleteByPrimaryKey(String taxableCode);

    int insert(OdsVatTaxableList record);

    int insertSelective(OdsVatTaxableList record);

    List<OdsVatTaxableList> selectByExample(OdsVatTaxableListExample example);

    OdsVatTaxableList selectByPrimaryKey(String taxableCode);

    int updateByExampleSelective(@Param("record") OdsVatTaxableList record, @Param("example") OdsVatTaxableListExample example);

    int updateByExample(@Param("record") OdsVatTaxableList record, @Param("example") OdsVatTaxableListExample example);

    int updateByPrimaryKeySelective(OdsVatTaxableList record);

    int updateByPrimaryKey(OdsVatTaxableList record);
}