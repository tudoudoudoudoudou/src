package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlowApply;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlowApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbFlowApplyMapper extends TableMapper {
    int countByExample(TbFlowApplyExample example);

    int deleteByExample(TbFlowApplyExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbFlowApply record);

    int insertSelective(TbFlowApply record);

    List<TbFlowApply> selectByExample(TbFlowApplyExample example);

    TbFlowApply selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbFlowApply record, @Param("example") TbFlowApplyExample example);

    int updateByExample(@Param("record") TbFlowApply record, @Param("example") TbFlowApplyExample example);

    int updateByPrimaryKeySelective(TbFlowApply record);

    int updateByPrimaryKey(TbFlowApply record);
}