package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCostCenter;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCostCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatCostCenterMapper extends TableMapper {
    int countByExample(PmVatCostCenterExample example);

    int deleteByExample(PmVatCostCenterExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatCostCenter record);

    int insertSelective(PmVatCostCenter record);

    List<PmVatCostCenter> selectByExample(PmVatCostCenterExample example);

    PmVatCostCenter selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatCostCenter record, @Param("example") PmVatCostCenterExample example);

    int updateByExample(@Param("record") PmVatCostCenter record, @Param("example") PmVatCostCenterExample example);

    int updateByPrimaryKeySelective(PmVatCostCenter record);

    int updateByPrimaryKey(PmVatCostCenter record);
}