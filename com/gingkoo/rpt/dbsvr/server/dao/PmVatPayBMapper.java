package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatPayB;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatPayBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatPayBMapper extends TableMapper {
    int countByExample(PmVatPayBExample example);

    int deleteByExample(PmVatPayBExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatPayB record);

    int insertSelective(PmVatPayB record);

    List<PmVatPayB> selectByExample(PmVatPayBExample example);

    PmVatPayB selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatPayB record, @Param("example") PmVatPayBExample example);

    int updateByExample(@Param("record") PmVatPayB record, @Param("example") PmVatPayBExample example);

    int updateByPrimaryKeySelective(PmVatPayB record);

    int updateByPrimaryKey(PmVatPayB record);
}