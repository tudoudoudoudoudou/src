package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbResAuth;
import com.gingkoo.rpt.dbsvr.server.bean.TbResAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbResAuthMapper extends TableMapper {
    int countByExample(TbResAuthExample example);

    int deleteByExample(TbResAuthExample example);

    int insert(TbResAuth record);

    int insertSelective(TbResAuth record);

    List<TbResAuth> selectByExample(TbResAuthExample example);

    int updateByExampleSelective(@Param("record") TbResAuth record, @Param("example") TbResAuthExample example);

    int updateByExample(@Param("record") TbResAuth record, @Param("example") TbResAuthExample example);
}