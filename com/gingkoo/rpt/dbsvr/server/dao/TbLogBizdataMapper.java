package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogBizdata;
import com.gingkoo.rpt.dbsvr.server.bean.TbLogBizdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbLogBizdataMapper extends TableMapper {
    int countByExample(TbLogBizdataExample example);

    int deleteByExample(TbLogBizdataExample example);

    int insert(TbLogBizdata record);

    int insertSelective(TbLogBizdata record);

    List<TbLogBizdata> selectByExample(TbLogBizdataExample example);

    int updateByExampleSelective(@Param("record") TbLogBizdata record, @Param("example") TbLogBizdataExample example);

    int updateByExample(@Param("record") TbLogBizdata record, @Param("example") TbLogBizdataExample example);
}