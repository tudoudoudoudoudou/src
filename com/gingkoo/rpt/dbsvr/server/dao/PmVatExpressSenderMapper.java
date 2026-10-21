package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpressSender;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpressSenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatExpressSenderMapper extends TableMapper {
    int countByExample(PmVatExpressSenderExample example);

    int deleteByExample(PmVatExpressSenderExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatExpressSender record);

    int insertSelective(PmVatExpressSender record);

    List<PmVatExpressSender> selectByExample(PmVatExpressSenderExample example);

    PmVatExpressSender selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatExpressSender record, @Param("example") PmVatExpressSenderExample example);

    int updateByExample(@Param("record") PmVatExpressSender record, @Param("example") PmVatExpressSenderExample example);

    int updateByPrimaryKeySelective(PmVatExpressSender record);

    int updateByPrimaryKey(PmVatExpressSender record);
}