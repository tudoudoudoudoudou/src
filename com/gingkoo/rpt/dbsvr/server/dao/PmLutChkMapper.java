package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutChk;
import com.gingkoo.rpt.dbsvr.server.bean.PmLutChkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmLutChkMapper extends TableMapper {
    int countByExample(PmLutChkExample example);

    int deleteByExample(PmLutChkExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmLutChk record);

    int insertSelective(PmLutChk record);

    List<PmLutChk> selectByExample(PmLutChkExample example);

    PmLutChk selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmLutChk record, @Param("example") PmLutChkExample example);

    int updateByExample(@Param("record") PmLutChk record, @Param("example") PmLutChkExample example);

    int updateByPrimaryKeySelective(PmLutChk record);

    int updateByPrimaryKey(PmLutChk record);
}