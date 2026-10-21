package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatGoodInfo;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatGoodInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatGoodInfoMapper extends TableMapper {
    int countByExample(PmVatGoodInfoExample example);

    int deleteByExample(PmVatGoodInfoExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatGoodInfo record);

    int insertSelective(PmVatGoodInfo record);

    List<PmVatGoodInfo> selectByExample(PmVatGoodInfoExample example);

    PmVatGoodInfo selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatGoodInfo record, @Param("example") PmVatGoodInfoExample example);

    int updateByExample(@Param("record") PmVatGoodInfo record, @Param("example") PmVatGoodInfoExample example);

    int updateByPrimaryKeySelective(PmVatGoodInfo record);

    int updateByPrimaryKey(PmVatGoodInfo record);
}