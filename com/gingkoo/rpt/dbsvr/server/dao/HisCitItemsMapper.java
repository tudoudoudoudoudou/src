package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitItems;
import com.gingkoo.rpt.dbsvr.server.bean.HisCitItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisCitItemsMapper extends TableMapper {
    int countByExample(HisCitItemsExample example);

    int deleteByExample(HisCitItemsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisCitItems record);

    int insertSelective(HisCitItems record);

    List<HisCitItems> selectByExample(HisCitItemsExample example);

    HisCitItems selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisCitItems record, @Param("example") HisCitItemsExample example);

    int updateByExample(@Param("record") HisCitItems record, @Param("example") HisCitItemsExample example);

    int updateByPrimaryKeySelective(HisCitItems record);

    int updateByPrimaryKey(HisCitItems record);
}