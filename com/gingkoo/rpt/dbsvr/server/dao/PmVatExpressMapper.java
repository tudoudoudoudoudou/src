package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpress;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatExpressMapper extends TableMapper {
    int countByExample(PmVatExpressExample example);

    int deleteByExample(PmVatExpressExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatExpress record);

    int insertSelective(PmVatExpress record);

    List<PmVatExpress> selectByExample(PmVatExpressExample example);

    PmVatExpress selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatExpress record, @Param("example") PmVatExpressExample example);

    int updateByExample(@Param("record") PmVatExpress record, @Param("example") PmVatExpressExample example);

    int updateByPrimaryKeySelective(PmVatExpress record);

    int updateByPrimaryKey(PmVatExpress record);
}