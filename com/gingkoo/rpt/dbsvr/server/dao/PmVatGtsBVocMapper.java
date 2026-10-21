package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatGtsBVoc;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatGtsBVocExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatGtsBVocMapper extends TableMapper {
    int countByExample(PmVatGtsBVocExample example);

    int deleteByExample(PmVatGtsBVocExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PmVatGtsBVoc record);

    int insertSelective(PmVatGtsBVoc record);

    List<PmVatGtsBVoc> selectByExample(PmVatGtsBVocExample example);

    PmVatGtsBVoc selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PmVatGtsBVoc record, @Param("example") PmVatGtsBVocExample example);

    int updateByExample(@Param("record") PmVatGtsBVoc record, @Param("example") PmVatGtsBVocExample example);

    int updateByPrimaryKeySelective(PmVatGtsBVoc record);

    int updateByPrimaryKey(PmVatGtsBVoc record);
}