package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVoc;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatBVocMapper extends TableMapper {
    int countByExample(PmVatBVocExample example);

    int deleteByExample(PmVatBVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatBVoc record);

    int insertSelective(PmVatBVoc record);

    List<PmVatBVoc> selectByExample(PmVatBVocExample example);

    PmVatBVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatBVoc record, @Param("example") PmVatBVocExample example);

    int updateByExample(@Param("record") PmVatBVoc record, @Param("example") PmVatBVocExample example);

    int updateByPrimaryKeySelective(PmVatBVoc record);

    int updateByPrimaryKey(PmVatBVoc record);
}