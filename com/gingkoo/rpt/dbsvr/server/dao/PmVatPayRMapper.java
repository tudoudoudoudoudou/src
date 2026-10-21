package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatPayR;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatPayRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatPayRMapper extends TableMapper {
    int countByExample(PmVatPayRExample example);

    int deleteByExample(PmVatPayRExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatPayR record);

    int insertSelective(PmVatPayR record);

    List<PmVatPayR> selectByExample(PmVatPayRExample example);

    PmVatPayR selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatPayR record, @Param("example") PmVatPayRExample example);

    int updateByExample(@Param("record") PmVatPayR record, @Param("example") PmVatPayRExample example);

    int updateByPrimaryKeySelective(PmVatPayR record);

    int updateByPrimaryKey(PmVatPayR record);
}