package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTransOutSum;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTransOutSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTransOutSumMapper extends TableMapper {
    int countByExample(PmVatTransOutSumExample example);

    int deleteByExample(PmVatTransOutSumExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTransOutSum record);

    int insertSelective(PmVatTransOutSum record);

    List<PmVatTransOutSum> selectByExample(PmVatTransOutSumExample example);

    PmVatTransOutSum selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTransOutSum record, @Param("example") PmVatTransOutSumExample example);

    int updateByExample(@Param("record") PmVatTransOutSum record, @Param("example") PmVatTransOutSumExample example);

    int updateByPrimaryKeySelective(PmVatTransOutSum record);

    int updateByPrimaryKey(PmVatTransOutSum record);
}