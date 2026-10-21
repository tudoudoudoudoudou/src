package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeSchema;
import com.gingkoo.rpt.dbsvr.server.bean.TbCodeSchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbCodeSchemaMapper extends TableMapper {
    int countByExample(TbCodeSchemaExample example);

    int deleteByExample(TbCodeSchemaExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbCodeSchema record);

    int insertSelective(TbCodeSchema record);

    List<TbCodeSchema> selectByExample(TbCodeSchemaExample example);

    TbCodeSchema selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbCodeSchema record, @Param("example") TbCodeSchemaExample example);

    int updateByExample(@Param("record") TbCodeSchema record, @Param("example") TbCodeSchemaExample example);

    int updateByPrimaryKeySelective(TbCodeSchema record);

    int updateByPrimaryKey(TbCodeSchema record);
}