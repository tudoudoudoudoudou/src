package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatRuleTxcodes;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatRuleTxcodesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatRuleTxcodesMapper extends TableMapper {
    int countByExample(HisVatRuleTxcodesExample example);

    int deleteByExample(HisVatRuleTxcodesExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatRuleTxcodes record);

    int insertSelective(HisVatRuleTxcodes record);

    List<HisVatRuleTxcodes> selectByExample(HisVatRuleTxcodesExample example);

    HisVatRuleTxcodes selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatRuleTxcodes record, @Param("example") HisVatRuleTxcodesExample example);

    int updateByExample(@Param("record") HisVatRuleTxcodes record, @Param("example") HisVatRuleTxcodesExample example);

    int updateByPrimaryKeySelective(HisVatRuleTxcodes record);

    int updateByPrimaryKey(HisVatRuleTxcodes record);
}