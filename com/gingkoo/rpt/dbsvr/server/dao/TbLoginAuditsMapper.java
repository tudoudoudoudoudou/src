package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbLoginAudits;
import com.gingkoo.rpt.dbsvr.server.bean.TbLoginAuditsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbLoginAuditsMapper extends TableMapper {
    int countByExample(TbLoginAuditsExample example);

    int deleteByExample(TbLoginAuditsExample example);

    int insert(TbLoginAudits record);

    int insertSelective(TbLoginAudits record);

    List<TbLoginAudits> selectByExample(TbLoginAuditsExample example);

    int updateByExampleSelective(@Param("record") TbLoginAudits record, @Param("example") TbLoginAuditsExample example);

    int updateByExample(@Param("record") TbLoginAudits record, @Param("example") TbLoginAuditsExample example);
}