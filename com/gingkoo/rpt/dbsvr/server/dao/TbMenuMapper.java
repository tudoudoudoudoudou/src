package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbMenu;
import com.gingkoo.rpt.dbsvr.server.bean.TbMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbMenuMapper extends TableMapper {
    int countByExample(TbMenuExample example);

    int deleteByExample(TbMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(TbMenu record);

    int insertSelective(TbMenu record);

    List<TbMenu> selectByExample(TbMenuExample example);

    TbMenu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExample(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByPrimaryKeySelective(TbMenu record);

    int updateByPrimaryKey(TbMenu record);
}