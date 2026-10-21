package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlowDefine;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlowDefineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbFlowDefineMapper extends TableMapper {
    int countByExample(TbFlowDefineExample example);

    int deleteByExample(TbFlowDefineExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbFlowDefine record);

    int insertSelective(TbFlowDefine record);

    List<TbFlowDefine> selectByExample(TbFlowDefineExample example);

    TbFlowDefine selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbFlowDefine record, @Param("example") TbFlowDefineExample example);

    int updateByExample(@Param("record") TbFlowDefine record, @Param("example") TbFlowDefineExample example);

    int updateByPrimaryKeySelective(TbFlowDefine record);

    int updateByPrimaryKey(TbFlowDefine record);
}