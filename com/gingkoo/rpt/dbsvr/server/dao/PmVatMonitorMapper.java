package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatMonitor;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatMonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatMonitorMapper extends TableMapper {
    int countByExample(PmVatMonitorExample example);

    int deleteByExample(PmVatMonitorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatMonitor record);

    int insertSelective(PmVatMonitor record);

    List<PmVatMonitor> selectByExample(PmVatMonitorExample example);

    PmVatMonitor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatMonitor record, @Param("example") PmVatMonitorExample example);

    int updateByExample(@Param("record") PmVatMonitor record, @Param("example") PmVatMonitorExample example);

    int updateByPrimaryKeySelective(PmVatMonitor record);

    int updateByPrimaryKey(PmVatMonitor record);
}