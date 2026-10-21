package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.GnoSub;
import com.gingkoo.rpt.dbsvr.server.bean.GnoSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GnoSubMapper extends TableMapper {
    int countByExample(GnoSubExample example);

    int deleteByExample(GnoSubExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(GnoSub record);

    int insertSelective(GnoSub record);

    List<GnoSub> selectByExample(GnoSubExample example);

    GnoSub selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") GnoSub record, @Param("example") GnoSubExample example);

    int updateByExample(@Param("record") GnoSub record, @Param("example") GnoSubExample example);

    int updateByPrimaryKeySelective(GnoSub record);

    int updateByPrimaryKey(GnoSub record);
}