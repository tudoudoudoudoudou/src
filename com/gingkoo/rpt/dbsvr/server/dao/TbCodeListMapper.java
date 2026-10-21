package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeList;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbCodeListMapper extends TableMapper {
    int countByExample(TbCodeListExample example);

    int deleteByExample(TbCodeListExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbCodeList record);

    int insertSelective(TbCodeList record);

    List<TbCodeList> selectByExample(TbCodeListExample example);

    TbCodeList selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbCodeList record, @Param("example") TbCodeListExample example);

    int updateByExample(@Param("record") TbCodeList record, @Param("example") TbCodeListExample example);

    int updateByPrimaryKeySelective(TbCodeList record);

    int updateByPrimaryKey(TbCodeList record);
}