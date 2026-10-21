package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIVoc;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIVocMapper extends TableMapper {
    int countByExample(HisVatIVocExample example);

    int deleteByExample(HisVatIVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIVoc record);

    int insertSelective(HisVatIVoc record);

    List<HisVatIVoc> selectByExample(HisVatIVocExample example);

    HisVatIVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIVoc record, @Param("example") HisVatIVocExample example);

    int updateByExample(@Param("record") HisVatIVoc record, @Param("example") HisVatIVocExample example);

    int updateByPrimaryKeySelective(HisVatIVoc record);

    int updateByPrimaryKey(HisVatIVoc record);
}