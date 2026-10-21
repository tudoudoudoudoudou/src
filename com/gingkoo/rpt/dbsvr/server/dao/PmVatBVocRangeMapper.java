package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVocRange;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatBVocRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatBVocRangeMapper extends TableMapper {
    int countByExample(PmVatBVocRangeExample example);

    int deleteByExample(PmVatBVocRangeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatBVocRange record);

    int insertSelective(PmVatBVocRange record);

    List<PmVatBVocRange> selectByExample(PmVatBVocRangeExample example);

    PmVatBVocRange selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatBVocRange record, @Param("example") PmVatBVocRangeExample example);

    int updateByExample(@Param("record") PmVatBVocRange record, @Param("example") PmVatBVocRangeExample example);

    int updateByPrimaryKeySelective(PmVatBVocRange record);

    int updateByPrimaryKey(PmVatBVocRange record);
}