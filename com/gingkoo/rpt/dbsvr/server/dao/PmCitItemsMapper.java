package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitItems;
import com.gingkoo.rpt.dbsvr.server.bean.PmCitItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmCitItemsMapper extends TableMapper {
    int countByExample(PmCitItemsExample example);

    int deleteByExample(PmCitItemsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmCitItems record);

    int insertSelective(PmCitItems record);

    List<PmCitItems> selectByExample(PmCitItemsExample example);

    PmCitItems selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmCitItems record, @Param("example") PmCitItemsExample example);

    int updateByExample(@Param("record") PmCitItems record, @Param("example") PmCitItemsExample example);

    int updateByPrimaryKeySelective(PmCitItems record);

    int updateByPrimaryKey(PmCitItems record);
}