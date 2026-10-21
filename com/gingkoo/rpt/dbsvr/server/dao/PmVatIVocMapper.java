package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIVoc;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIVocMapper extends TableMapper {
    int countByExample(PmVatIVocExample example);

    int deleteByExample(PmVatIVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIVoc record);

    int insertSelective(PmVatIVoc record);

    List<PmVatIVoc> selectByExample(PmVatIVocExample example);

    PmVatIVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIVoc record, @Param("example") PmVatIVocExample example);

    int updateByExample(@Param("record") PmVatIVoc record, @Param("example") PmVatIVocExample example);

    int updateByPrimaryKeySelective(PmVatIVoc record);

    int updateByPrimaryKey(PmVatIVoc record);
}