package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbChgOrgCfgPending;
import com.gingkoo.rpt.dbsvr.server.bean.TbChgOrgCfgPendingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbChgOrgCfgPendingMapper extends TableMapper {
    int countByExample(TbChgOrgCfgPendingExample example);

    int deleteByExample(TbChgOrgCfgPendingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbChgOrgCfgPending record);

    int insertSelective(TbChgOrgCfgPending record);

    List<TbChgOrgCfgPending> selectByExample(TbChgOrgCfgPendingExample example);

    TbChgOrgCfgPending selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbChgOrgCfgPending record, @Param("example") TbChgOrgCfgPendingExample example);

    int updateByExample(@Param("record") TbChgOrgCfgPending record, @Param("example") TbChgOrgCfgPendingExample example);

    int updateByPrimaryKeySelective(TbChgOrgCfgPending record);

    int updateByPrimaryKey(TbChgOrgCfgPending record);
}