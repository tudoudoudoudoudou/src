package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbRole;
import com.gingkoo.rpt.dbsvr.server.bean.TbRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRoleMapper extends TableMapper {
    int countByExample(TbRoleExample example);

    int deleteByExample(TbRoleExample example);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    List<TbRole> selectByExample(TbRoleExample example);

    int updateByExampleSelective(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByExample(@Param("record") TbRole record, @Param("example") TbRoleExample example);
}