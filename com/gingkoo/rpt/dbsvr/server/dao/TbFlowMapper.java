package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlow;
import com.gingkoo.rpt.dbsvr.server.bean.TbFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbFlowMapper extends TableMapper {
    int countByExample(TbFlowExample example);

    int deleteByExample(TbFlowExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbFlow record);

    int insertSelective(TbFlow record);

    List<TbFlow> selectByExample(TbFlowExample example);

    TbFlow selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbFlow record, @Param("example") TbFlowExample example);

    int updateByExample(@Param("record") TbFlow record, @Param("example") TbFlowExample example);

    int updateByPrimaryKeySelective(TbFlow record);

    int updateByPrimaryKey(TbFlow record);
}