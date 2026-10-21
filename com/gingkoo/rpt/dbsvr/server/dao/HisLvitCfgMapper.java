package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLvitCfg;
import com.gingkoo.rpt.dbsvr.server.bean.HisLvitCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLvitCfgMapper extends TableMapper {
    int countByExample(HisLvitCfgExample example);

    int deleteByExample(HisLvitCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLvitCfg record);

    int insertSelective(HisLvitCfg record);

    List<HisLvitCfg> selectByExample(HisLvitCfgExample example);

    HisLvitCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLvitCfg record, @Param("example") HisLvitCfgExample example);

    int updateByExample(@Param("record") HisLvitCfg record, @Param("example") HisLvitCfgExample example);

    int updateByPrimaryKeySelective(HisLvitCfg record);

    int updateByPrimaryKey(HisLvitCfg record);
}