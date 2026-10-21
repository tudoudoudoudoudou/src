package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.BmsCtlCfg;
import com.gingkoo.rpt.dbsvr.server.bean.BmsCtlCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BmsCtlCfgMapper extends TableMapper {
    int countByExample(BmsCtlCfgExample example);

    int deleteByExample(BmsCtlCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(BmsCtlCfg record);

    int insertSelective(BmsCtlCfg record);

    List<BmsCtlCfg> selectByExample(BmsCtlCfgExample example);

    BmsCtlCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") BmsCtlCfg record, @Param("example") BmsCtlCfgExample example);

    int updateByExample(@Param("record") BmsCtlCfg record, @Param("example") BmsCtlCfgExample example);

    int updateByPrimaryKeySelective(BmsCtlCfg record);

    int updateByPrimaryKey(BmsCtlCfg record);
}