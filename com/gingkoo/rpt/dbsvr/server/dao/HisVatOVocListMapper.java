package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVocList;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOVocListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatOVocListMapper extends TableMapper {
    int countByExample(HisVatOVocListExample example);

    int deleteByExample(HisVatOVocListExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatOVocList record);

    int insertSelective(HisVatOVocList record);

    List<HisVatOVocList> selectByExample(HisVatOVocListExample example);

    HisVatOVocList selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatOVocList record, @Param("example") HisVatOVocListExample example);

    int updateByExample(@Param("record") HisVatOVocList record, @Param("example") HisVatOVocListExample example);

    int updateByPrimaryKeySelective(HisVatOVocList record);

    int updateByPrimaryKey(HisVatOVocList record);
}