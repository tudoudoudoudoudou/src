package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.BmsRunPlan;
import com.gingkoo.rpt.dbsvr.server.bean.BmsRunPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BmsRunPlanMapper extends TableMapper {
    int countByExample(BmsRunPlanExample example);

    int deleteByExample(BmsRunPlanExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(BmsRunPlan record);

    int insertSelective(BmsRunPlan record);

    List<BmsRunPlan> selectByExample(BmsRunPlanExample example);

    BmsRunPlan selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") BmsRunPlan record, @Param("example") BmsRunPlanExample example);

    int updateByExample(@Param("record") BmsRunPlan record, @Param("example") BmsRunPlanExample example);

    int updateByPrimaryKeySelective(BmsRunPlan record);

    int updateByPrimaryKey(BmsRunPlan record);
}