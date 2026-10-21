package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTaxReliefCode;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTaxReliefCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatTaxReliefCodeMapper extends TableMapper {
    int countByExample(OdsVatTaxReliefCodeExample example);

    int deleteByExample(OdsVatTaxReliefCodeExample example);

    int deleteByPrimaryKey(String seqNum);

    int insert(OdsVatTaxReliefCode record);

    int insertSelective(OdsVatTaxReliefCode record);

    List<OdsVatTaxReliefCode> selectByExample(OdsVatTaxReliefCodeExample example);

    OdsVatTaxReliefCode selectByPrimaryKey(String seqNum);

    int updateByExampleSelective(@Param("record") OdsVatTaxReliefCode record, @Param("example") OdsVatTaxReliefCodeExample example);

    int updateByExample(@Param("record") OdsVatTaxReliefCode record, @Param("example") OdsVatTaxReliefCodeExample example);

    int updateByPrimaryKeySelective(OdsVatTaxReliefCode record);

    int updateByPrimaryKey(OdsVatTaxReliefCode record);
}