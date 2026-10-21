package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCostCenter;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCostCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatCostCenterMapper extends TableMapper {
    int countByExample(HisVatCostCenterExample example);

    int deleteByExample(HisVatCostCenterExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatCostCenter record);

    int insertSelective(HisVatCostCenter record);

    List<HisVatCostCenter> selectByExample(HisVatCostCenterExample example);

    HisVatCostCenter selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatCostCenter record, @Param("example") HisVatCostCenterExample example);

    int updateByExample(@Param("record") HisVatCostCenter record, @Param("example") HisVatCostCenterExample example);

    int updateByPrimaryKeySelective(HisVatCostCenter record);

    int updateByPrimaryKey(HisVatCostCenter record);
}