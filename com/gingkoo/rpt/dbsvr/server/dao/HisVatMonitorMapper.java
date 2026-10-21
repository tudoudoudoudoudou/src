package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatMonitor;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatMonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatMonitorMapper extends TableMapper {
    int countByExample(HisVatMonitorExample example);

    int deleteByExample(HisVatMonitorExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatMonitor record);

    int insertSelective(HisVatMonitor record);

    List<HisVatMonitor> selectByExample(HisVatMonitorExample example);

    HisVatMonitor selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatMonitor record, @Param("example") HisVatMonitorExample example);

    int updateByExample(@Param("record") HisVatMonitor record, @Param("example") HisVatMonitorExample example);

    int updateByPrimaryKeySelective(HisVatMonitor record);

    int updateByPrimaryKey(HisVatMonitor record);
}