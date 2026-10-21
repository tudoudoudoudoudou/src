package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbChgOrgCfg;
import com.gingkoo.rpt.dbsvr.server.bean.TbChgOrgCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbChgOrgCfgMapper extends TableMapper {
    int countByExample(TbChgOrgCfgExample example);

    int deleteByExample(TbChgOrgCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbChgOrgCfg record);

    int insertSelective(TbChgOrgCfg record);

    List<TbChgOrgCfg> selectByExample(TbChgOrgCfgExample example);

    TbChgOrgCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbChgOrgCfg record, @Param("example") TbChgOrgCfgExample example);

    int updateByExample(@Param("record") TbChgOrgCfg record, @Param("example") TbChgOrgCfgExample example);

    int updateByPrimaryKeySelective(TbChgOrgCfg record);

    int updateByPrimaryKey(TbChgOrgCfg record);
}