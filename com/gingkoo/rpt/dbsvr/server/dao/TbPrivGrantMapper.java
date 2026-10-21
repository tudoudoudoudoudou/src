package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivGrant;
import com.gingkoo.rpt.dbsvr.server.bean.TbPrivGrantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPrivGrantMapper extends TableMapper {
    int countByExample(TbPrivGrantExample example);

    int deleteByExample(TbPrivGrantExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbPrivGrant record);

    int insertSelective(TbPrivGrant record);

    List<TbPrivGrant> selectByExample(TbPrivGrantExample example);

    TbPrivGrant selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbPrivGrant record, @Param("example") TbPrivGrantExample example);

    int updateByExample(@Param("record") TbPrivGrant record, @Param("example") TbPrivGrantExample example);

    int updateByPrimaryKeySelective(TbPrivGrant record);

    int updateByPrimaryKey(TbPrivGrant record);
}