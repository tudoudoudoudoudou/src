package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocList;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatOVocListMapper extends TableMapper {
    int countByExample(PmVatOVocListExample example);

    int deleteByExample(PmVatOVocListExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatOVocList record);

    int insertSelective(PmVatOVocList record);

    List<PmVatOVocList> selectByExample(PmVatOVocListExample example);

    PmVatOVocList selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatOVocList record, @Param("example") PmVatOVocListExample example);

    int updateByExample(@Param("record") PmVatOVocList record, @Param("example") PmVatOVocListExample example);

    int updateByPrimaryKeySelective(PmVatOVocList record);

    int updateByPrimaryKey(PmVatOVocList record);
}