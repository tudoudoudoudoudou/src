package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpressDetails;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatExpressDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatExpressDetailsMapper extends TableMapper {
    int countByExample(HisVatExpressDetailsExample example);

    int deleteByExample(HisVatExpressDetailsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatExpressDetails record);

    int insertSelective(HisVatExpressDetails record);

    List<HisVatExpressDetails> selectByExample(HisVatExpressDetailsExample example);

    HisVatExpressDetails selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatExpressDetails record, @Param("example") HisVatExpressDetailsExample example);

    int updateByExample(@Param("record") HisVatExpressDetails record, @Param("example") HisVatExpressDetailsExample example);

    int updateByPrimaryKeySelective(HisVatExpressDetails record);

    int updateByPrimaryKey(HisVatExpressDetails record);
}