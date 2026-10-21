package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCustGroup;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatCustGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatCustGroupMapper extends TableMapper {
    int countByExample(HisVatCustGroupExample example);

    int deleteByExample(HisVatCustGroupExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatCustGroup record);

    int insertSelective(HisVatCustGroup record);

    List<HisVatCustGroup> selectByExample(HisVatCustGroupExample example);

    HisVatCustGroup selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatCustGroup record, @Param("example") HisVatCustGroupExample example);

    int updateByExample(@Param("record") HisVatCustGroup record, @Param("example") HisVatCustGroupExample example);

    int updateByPrimaryKeySelective(HisVatCustGroup record);

    int updateByPrimaryKey(HisVatCustGroup record);
}