package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogSysdata;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogSysdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbLogSysdataMapper extends TableMapper {
    int countByExample(TbLogSysdataExample example);

    int deleteByExample(TbLogSysdataExample example);

    int insert(TbLogSysdata record);

    int insertSelective(TbLogSysdata record);

    List<TbLogSysdata> selectByExample(TbLogSysdataExample example);

    int updateByExampleSelective(@Param("record") TbLogSysdata record, @Param("example") TbLogSysdataExample example);

    int updateByExample(@Param("record") TbLogSysdata record, @Param("example") TbLogSysdataExample example);
}