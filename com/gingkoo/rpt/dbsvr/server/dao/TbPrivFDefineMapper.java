package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFDefine;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivFDefineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPrivFDefineMapper extends TableMapper {
    int countByExample(TbPrivFDefineExample example);

    int deleteByExample(TbPrivFDefineExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbPrivFDefine record);

    int insertSelective(TbPrivFDefine record);

    List<TbPrivFDefine> selectByExample(TbPrivFDefineExample example);

    TbPrivFDefine selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbPrivFDefine record, @Param("example") TbPrivFDefineExample example);

    int updateByExample(@Param("record") TbPrivFDefine record, @Param("example") TbPrivFDefineExample example);

    int updateByPrimaryKeySelective(TbPrivFDefine record);

    int updateByPrimaryKey(TbPrivFDefine record);
}