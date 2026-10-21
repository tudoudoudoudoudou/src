package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.BmsCtlSession;
import com.gingkoo.rpt.dbsvr.server.bean.BmsCtlSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BmsCtlSessionMapper extends TableMapper {
    int countByExample(BmsCtlSessionExample example);

    int deleteByExample(BmsCtlSessionExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(BmsCtlSession record);

    int insertSelective(BmsCtlSession record);

    List<BmsCtlSession> selectByExample(BmsCtlSessionExample example);

    BmsCtlSession selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") BmsCtlSession record, @Param("example") BmsCtlSessionExample example);

    int updateByExample(@Param("record") BmsCtlSession record, @Param("example") BmsCtlSessionExample example);

    int updateByPrimaryKeySelective(BmsCtlSession record);

    int updateByPrimaryKey(BmsCtlSession record);
}