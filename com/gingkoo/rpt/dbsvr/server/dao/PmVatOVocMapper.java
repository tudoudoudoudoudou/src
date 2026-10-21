package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVoc;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatOVocMapper extends TableMapper {
    long countByExample(PmVatOVocExample example);

    int deleteByExample(PmVatOVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatOVoc record);

    int insertSelective(PmVatOVoc record);

    List<PmVatOVoc> selectByExample(PmVatOVocExample example);

    PmVatOVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatOVoc record, @Param("example") PmVatOVocExample example);

    int updateByExample(@Param("record") PmVatOVoc record, @Param("example") PmVatOVocExample example);

    int updateByPrimaryKeySelective(PmVatOVoc record);

    int updateByPrimaryKey(PmVatOVoc record);
}