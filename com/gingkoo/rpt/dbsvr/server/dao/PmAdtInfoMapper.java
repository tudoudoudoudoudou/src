package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmAdtInfo;
import com.gingkoo.rpt.dbsvr.server.bean.PmAdtInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmAdtInfoMapper extends TableMapper {
    int countByExample(PmAdtInfoExample example);

    int deleteByExample(PmAdtInfoExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmAdtInfo record);

    int insertSelective(PmAdtInfo record);

    List<PmAdtInfo> selectByExample(PmAdtInfoExample example);

    PmAdtInfo selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmAdtInfo record, @Param("example") PmAdtInfoExample example);

    int updateByExample(@Param("record") PmAdtInfo record, @Param("example") PmAdtInfoExample example);

    int updateByPrimaryKeySelective(PmAdtInfo record);

    int updateByPrimaryKey(PmAdtInfo record);
}