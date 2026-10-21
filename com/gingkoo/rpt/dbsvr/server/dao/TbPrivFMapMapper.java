package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFMap;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFMapExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFMapKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPrivFMapMapper extends TableMapper {
    int countByExample(TbPrivFMapExample example);

    int deleteByExample(TbPrivFMapExample example);

    int deleteByPrimaryKey(TbPrivFMapKey key);

    int insert(TbPrivFMap record);

    int insertSelective(TbPrivFMap record);

    List<TbPrivFMap> selectByExample(TbPrivFMapExample example);

    TbPrivFMap selectByPrimaryKey(TbPrivFMapKey key);

    int updateByExampleSelective(@Param("record") TbPrivFMap record, @Param("example") TbPrivFMapExample example);

    int updateByExample(@Param("record") TbPrivFMap record, @Param("example") TbPrivFMapExample example);

    int updateByPrimaryKeySelective(TbPrivFMap record);

    int updateByPrimaryKey(TbPrivFMap record);
}