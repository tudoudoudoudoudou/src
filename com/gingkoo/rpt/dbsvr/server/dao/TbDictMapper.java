package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbDict;
import com.gingkoo.rpt.dbsvr.server.bean.TbDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbDictMapper extends TableMapper {
    int countByExample(TbDictExample example);

    int deleteByExample(TbDictExample example);

    int insert(TbDict record);

    int insertSelective(TbDict record);

    List<TbDict> selectByExample(TbDictExample example);

    int updateByExampleSelective(@Param("record") TbDict record, @Param("example") TbDictExample example);

    int updateByExample(@Param("record") TbDict record, @Param("example") TbDictExample example);
}