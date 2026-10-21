package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIEstateLog;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIEstateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIEstateLogMapper extends TableMapper {
    int countByExample(PmVatIEstateLogExample example);

    int deleteByExample(PmVatIEstateLogExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIEstateLog record);

    int insertSelective(PmVatIEstateLog record);

    List<PmVatIEstateLog> selectByExample(PmVatIEstateLogExample example);

    PmVatIEstateLog selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIEstateLog record, @Param("example") PmVatIEstateLogExample example);

    int updateByExample(@Param("record") PmVatIEstateLog record, @Param("example") PmVatIEstateLogExample example);

    int updateByPrimaryKeySelective(PmVatIEstateLog record);

    int updateByPrimaryKey(PmVatIEstateLog record);
}