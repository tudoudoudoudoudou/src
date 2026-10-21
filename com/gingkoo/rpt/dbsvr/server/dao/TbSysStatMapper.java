package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbSysStat;
import com.gingkoo.rpt.dbsvr.server.bean.TbSysStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbSysStatMapper extends TableMapper {
    int countByExample(TbSysStatExample example);

    int deleteByExample(TbSysStatExample example);

    int deleteByPrimaryKey(String corpId);

    int insert(TbSysStat record);

    int insertSelective(TbSysStat record);

    List<TbSysStat> selectByExample(TbSysStatExample example);

    TbSysStat selectByPrimaryKey(String corpId);

    int updateByExampleSelective(@Param("record") TbSysStat record, @Param("example") TbSysStatExample example);

    int updateByExample(@Param("record") TbSysStat record, @Param("example") TbSysStatExample example);

    int updateByPrimaryKeySelective(TbSysStat record);

    int updateByPrimaryKey(TbSysStat record);
}