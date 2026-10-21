package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.GnoTopic;
import com.gingkoo.rpt.dbsvr.server.bean.GnoTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GnoTopicMapper extends TableMapper {
    int countByExample(GnoTopicExample example);

    int deleteByExample(GnoTopicExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(GnoTopic record);

    int insertSelective(GnoTopic record);

    List<GnoTopic> selectByExample(GnoTopicExample example);

    GnoTopic selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") GnoTopic record, @Param("example") GnoTopicExample example);

    int updateByExample(@Param("record") GnoTopic record, @Param("example") GnoTopicExample example);

    int updateByPrimaryKeySelective(GnoTopic record);

    int updateByPrimaryKey(GnoTopic record);
}