package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisAdtInfo;
import com.gingkoo.rpt.dbsvr.server.bean.HisAdtInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisAdtInfoMapper extends TableMapper {
    int countByExample(HisAdtInfoExample example);

    int deleteByExample(HisAdtInfoExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisAdtInfo record);

    int insertSelective(HisAdtInfo record);

    List<HisAdtInfo> selectByExample(HisAdtInfoExample example);

    HisAdtInfo selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisAdtInfo record, @Param("example") HisAdtInfoExample example);

    int updateByExample(@Param("record") HisAdtInfo record, @Param("example") HisAdtInfoExample example);

    int updateByPrimaryKeySelective(HisAdtInfo record);

    int updateByPrimaryKey(HisAdtInfo record);
}