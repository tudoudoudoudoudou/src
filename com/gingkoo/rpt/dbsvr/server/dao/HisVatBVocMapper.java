package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatBVoc;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatBVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatBVocMapper extends TableMapper {
    int countByExample(HisVatBVocExample example);

    int deleteByExample(HisVatBVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatBVoc record);

    int insertSelective(HisVatBVoc record);

    List<HisVatBVoc> selectByExample(HisVatBVocExample example);

    HisVatBVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatBVoc record, @Param("example") HisVatBVocExample example);

    int updateByExample(@Param("record") HisVatBVoc record, @Param("example") HisVatBVocExample example);

    int updateByPrimaryKeySelective(HisVatBVoc record);

    int updateByPrimaryKey(HisVatBVoc record);
}