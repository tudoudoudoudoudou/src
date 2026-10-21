package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.BmsBatch;
import com.gingkoo.rpt.dbsvr.server.bean.BmsBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BmsBatchMapper extends TableMapper {
    int countByExample(BmsBatchExample example);

    int deleteByExample(BmsBatchExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(BmsBatch record);

    int insertSelective(BmsBatch record);

    List<BmsBatch> selectByExample(BmsBatchExample example);

    BmsBatch selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") BmsBatch record, @Param("example") BmsBatchExample example);

    int updateByExample(@Param("record") BmsBatch record, @Param("example") BmsBatchExample example);

    int updateByPrimaryKeySelective(BmsBatch record);

    int updateByPrimaryKey(BmsBatch record);
}