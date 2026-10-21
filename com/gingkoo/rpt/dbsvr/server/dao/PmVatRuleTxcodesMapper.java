package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatRuleTxcodes;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatRuleTxcodesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatRuleTxcodesMapper extends TableMapper {
    int countByExample(PmVatRuleTxcodesExample example);

    int deleteByExample(PmVatRuleTxcodesExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatRuleTxcodes record);

    int insertSelective(PmVatRuleTxcodes record);

    List<PmVatRuleTxcodes> selectByExample(PmVatRuleTxcodesExample example);

    PmVatRuleTxcodes selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatRuleTxcodes record, @Param("example") PmVatRuleTxcodesExample example);

    int updateByExample(@Param("record") PmVatRuleTxcodes record, @Param("example") PmVatRuleTxcodesExample example);

    int updateByPrimaryKeySelective(PmVatRuleTxcodes record);

    int updateByPrimaryKey(PmVatRuleTxcodes record);
}