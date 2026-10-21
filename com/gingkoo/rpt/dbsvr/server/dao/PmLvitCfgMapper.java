package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLvitCfg;
import com.gingkoo.rpt.dbsvr.server.bean.PmLvitCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLvitCfgMapper extends TableMapper {
    int countByExample(PmLvitCfgExample example);

    int deleteByExample(PmLvitCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmLvitCfg record);

    int insertSelective(PmLvitCfg record);

    List<PmLvitCfg> selectByExample(PmLvitCfgExample example);

    PmLvitCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmLvitCfg record, @Param("example") PmLvitCfgExample example);

    int updateByExample(@Param("record") PmLvitCfg record, @Param("example") PmLvitCfgExample example);

    int updateByPrimaryKeySelective(PmLvitCfg record);

    int updateByPrimaryKey(PmLvitCfg record);
}