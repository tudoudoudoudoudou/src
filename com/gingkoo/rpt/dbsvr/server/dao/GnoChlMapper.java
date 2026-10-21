package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.GnoChl;
import com.gingkoo.rpt.dbsvr.server.bean.GnoChlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GnoChlMapper extends TableMapper {
    int countByExample(GnoChlExample example);

    int deleteByExample(GnoChlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(GnoChl record);

    int insertSelective(GnoChl record);

    List<GnoChl> selectByExample(GnoChlExample example);

    GnoChl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") GnoChl record, @Param("example") GnoChlExample example);

    int updateByExample(@Param("record") GnoChl record, @Param("example") GnoChlExample example);

    int updateByPrimaryKeySelective(GnoChl record);

    int updateByPrimaryKey(GnoChl record);
}