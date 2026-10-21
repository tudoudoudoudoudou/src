package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeSchemaItem;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeSchemaItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbCodeSchemaItemMapper extends TableMapper {
    int countByExample(TbCodeSchemaItemExample example);

    int deleteByExample(TbCodeSchemaItemExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbCodeSchemaItem record);

    int insertSelective(TbCodeSchemaItem record);

    List<TbCodeSchemaItem> selectByExample(TbCodeSchemaItemExample example);

    TbCodeSchemaItem selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbCodeSchemaItem record, @Param("example") TbCodeSchemaItemExample example);

    int updateByExample(@Param("record") TbCodeSchemaItem record, @Param("example") TbCodeSchemaItemExample example);

    int updateByPrimaryKeySelective(TbCodeSchemaItem record);

    int updateByPrimaryKey(TbCodeSchemaItem record);
}