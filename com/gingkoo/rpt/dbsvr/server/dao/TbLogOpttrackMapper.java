package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogOpttrack;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogOpttrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbLogOpttrackMapper extends TableMapper {
    int countByExample(TbLogOpttrackExample example);

    int deleteByExample(TbLogOpttrackExample example);

    int insert(TbLogOpttrack record);

    int insertSelective(TbLogOpttrack record);

    List<TbLogOpttrack> selectByExample(TbLogOpttrackExample example);

    int updateByExampleSelective(@Param("record") TbLogOpttrack record, @Param("example") TbLogOpttrackExample example);

    int updateByExample(@Param("record") TbLogOpttrack record, @Param("example") TbLogOpttrackExample example);
}