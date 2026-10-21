package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutChk;
import com.gingkoo.rpt.dbsvr.server.bean.HisLutChkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisLutChkMapper extends TableMapper {
    int countByExample(HisLutChkExample example);

    int deleteByExample(HisLutChkExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisLutChk record);

    int insertSelective(HisLutChk record);

    List<HisLutChk> selectByExample(HisLutChkExample example);

    HisLutChk selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisLutChk record, @Param("example") HisLutChkExample example);

    int updateByExample(@Param("record") HisLutChk record, @Param("example") HisLutChkExample example);

    int updateByPrimaryKeySelective(HisLutChk record);

    int updateByPrimaryKey(HisLutChk record);
}