package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbGroup;
import com.gingkoo.rpt.dbsvr.server.bean.TbGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbGroupMapper extends TableMapper {
    int countByExample(TbGroupExample example);

    int deleteByExample(TbGroupExample example);

    int insert(TbGroup record);

    int insertSelective(TbGroup record);

    List<TbGroup> selectByExample(TbGroupExample example);

    int updateByExampleSelective(@Param("record") TbGroup record, @Param("example") TbGroupExample example);

    int updateByExample(@Param("record") TbGroup record, @Param("example") TbGroupExample example);
}