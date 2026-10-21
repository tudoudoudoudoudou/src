package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptCtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxRptCtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxRptCtlMapper extends TableMapper {
    int countByExample(PmVatTaxRptCtlExample example);

    int deleteByExample(PmVatTaxRptCtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTaxRptCtl record);

    int insertSelective(PmVatTaxRptCtl record);

    List<PmVatTaxRptCtl> selectByExample(PmVatTaxRptCtlExample example);

    PmVatTaxRptCtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTaxRptCtl record, @Param("example") PmVatTaxRptCtlExample example);

    int updateByExample(@Param("record") PmVatTaxRptCtl record, @Param("example") PmVatTaxRptCtlExample example);

    int updateByPrimaryKeySelective(PmVatTaxRptCtl record);

    int updateByPrimaryKey(PmVatTaxRptCtl record);
}