package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVoc;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatOVocMapper extends TableMapper {
    int countByExample(HisVatOVocExample example);

    int deleteByExample(HisVatOVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatOVoc record);

    int insertSelective(HisVatOVoc record);

    List<HisVatOVoc> selectByExample(HisVatOVocExample example);

    HisVatOVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatOVoc record, @Param("example") HisVatOVocExample example);

    int updateByExample(@Param("record") HisVatOVoc record, @Param("example") HisVatOVocExample example);

    int updateByPrimaryKeySelective(HisVatOVoc record);

    int updateByPrimaryKey(HisVatOVoc record);
}