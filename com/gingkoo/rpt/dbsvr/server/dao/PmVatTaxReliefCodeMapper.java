package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxReliefCode;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTaxReliefCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTaxReliefCodeMapper extends TableMapper {
    int countByExample(PmVatTaxReliefCodeExample example);

    int deleteByExample(PmVatTaxReliefCodeExample example);

    int deleteByPrimaryKey(String seqNum);

    int insert(PmVatTaxReliefCode record);

    int insertSelective(PmVatTaxReliefCode record);

    List<PmVatTaxReliefCode> selectByExample(PmVatTaxReliefCodeExample example);

    PmVatTaxReliefCode selectByPrimaryKey(String seqNum);

    int updateByExampleSelective(@Param("record") PmVatTaxReliefCode record, @Param("example") PmVatTaxReliefCodeExample example);

    int updateByExample(@Param("record") PmVatTaxReliefCode record, @Param("example") PmVatTaxReliefCodeExample example);

    int updateByPrimaryKeySelective(PmVatTaxReliefCode record);

    int updateByPrimaryKey(PmVatTaxReliefCode record);
}