package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbReportCfg;
import com.gingkoo.rpt.dbsvr.server.bean.TbReportCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbReportCfgMapper extends TableMapper {
    int countByExample(TbReportCfgExample example);

    int deleteByExample(TbReportCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbReportCfg record);

    int insertSelective(TbReportCfg record);

    List<TbReportCfg> selectByExample(TbReportCfgExample example);

    TbReportCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbReportCfg record, @Param("example") TbReportCfgExample example);

    int updateByExample(@Param("record") TbReportCfg record, @Param("example") TbReportCfgExample example);

    int updateByPrimaryKeySelective(TbReportCfg record);

    int updateByPrimaryKey(TbReportCfg record);
}