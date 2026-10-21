package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptCtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTaxRptCtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTaxRptCtlMapper extends TableMapper {
    int countByExample(HisVatTaxRptCtlExample example);

    int deleteByExample(HisVatTaxRptCtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTaxRptCtl record);

    int insertSelective(HisVatTaxRptCtl record);

    List<HisVatTaxRptCtl> selectByExample(HisVatTaxRptCtlExample example);

    HisVatTaxRptCtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTaxRptCtl record, @Param("example") HisVatTaxRptCtlExample example);

    int updateByExample(@Param("record") HisVatTaxRptCtl record, @Param("example") HisVatTaxRptCtlExample example);

    int updateByPrimaryKeySelective(HisVatTaxRptCtl record);

    int updateByPrimaryKey(HisVatTaxRptCtl record);
}