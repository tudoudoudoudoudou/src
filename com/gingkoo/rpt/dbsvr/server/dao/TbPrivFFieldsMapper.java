package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFFields;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFFieldsExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFFieldsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPrivFFieldsMapper extends TableMapper {
    int countByExample(TbPrivFFieldsExample example);

    int deleteByExample(TbPrivFFieldsExample example);

    int deleteByPrimaryKey(TbPrivFFieldsKey key);

    int insert(TbPrivFFields record);

    int insertSelective(TbPrivFFields record);

    List<TbPrivFFields> selectByExample(TbPrivFFieldsExample example);

    TbPrivFFields selectByPrimaryKey(TbPrivFFieldsKey key);

    int updateByExampleSelective(@Param("record") TbPrivFFields record, @Param("example") TbPrivFFieldsExample example);

    int updateByExample(@Param("record") TbPrivFFields record, @Param("example") TbPrivFFieldsExample example);

    int updateByPrimaryKeySelective(TbPrivFFields record);

    int updateByPrimaryKey(TbPrivFFields record);
}