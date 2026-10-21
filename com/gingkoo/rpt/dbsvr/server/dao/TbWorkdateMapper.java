package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbWorkdate;
import com.gingkoo.rpt.dbsvr.server.bean.TbWorkdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbWorkdateMapper extends TableMapper {
    int countByExample(TbWorkdateExample example);

    int deleteByExample(TbWorkdateExample example);

    int deleteByPrimaryKey(String guid);

    int insert(TbWorkdate record);

    int insertSelective(TbWorkdate record);

    List<TbWorkdate> selectByExample(TbWorkdateExample example);

    TbWorkdate selectByPrimaryKey(String guid);

    int updateByExampleSelective(@Param("record") TbWorkdate record, @Param("example") TbWorkdateExample example);

    int updateByExample(@Param("record") TbWorkdate record, @Param("example") TbWorkdateExample example);

    int updateByPrimaryKeySelective(TbWorkdate record);

    int updateByPrimaryKey(TbWorkdate record);
}