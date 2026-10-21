package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.GnoTpl;
import com.gingkoo.rpt.dbsvr.server.bean.GnoTplExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GnoTplMapper extends TableMapper {
    int countByExample(GnoTplExample example);

    int deleteByExample(GnoTplExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(GnoTpl record);

    int insertSelective(GnoTpl record);

    List<GnoTpl> selectByExample(GnoTplExample example);

    GnoTpl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") GnoTpl record, @Param("example") GnoTplExample example);

    int updateByExample(@Param("record") GnoTpl record, @Param("example") GnoTplExample example);

    int updateByPrimaryKeySelective(GnoTpl record);

    int updateByPrimaryKey(GnoTpl record);
}