package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpressSender;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpressSenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatExpressSenderMapper extends TableMapper {
    int countByExample(HisVatExpressSenderExample example);

    int deleteByExample(HisVatExpressSenderExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatExpressSender record);

    int insertSelective(HisVatExpressSender record);

    List<HisVatExpressSender> selectByExample(HisVatExpressSenderExample example);

    HisVatExpressSender selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatExpressSender record, @Param("example") HisVatExpressSenderExample example);

    int updateByExample(@Param("record") HisVatExpressSender record, @Param("example") HisVatExpressSenderExample example);

    int updateByPrimaryKeySelective(HisVatExpressSender record);

    int updateByPrimaryKey(HisVatExpressSender record);
}