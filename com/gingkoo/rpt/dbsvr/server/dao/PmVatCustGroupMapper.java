package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustGroup;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatCustGroupMapper extends TableMapper {
    int countByExample(PmVatCustGroupExample example);

    int deleteByExample(PmVatCustGroupExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatCustGroup record);

    int insertSelective(PmVatCustGroup record);

    List<PmVatCustGroup> selectByExample(PmVatCustGroupExample example);

    PmVatCustGroup selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatCustGroup record, @Param("example") PmVatCustGroupExample example);

    int updateByExample(@Param("record") PmVatCustGroup record, @Param("example") PmVatCustGroupExample example);

    int updateByPrimaryKeySelective(PmVatCustGroup record);

    int updateByPrimaryKey(PmVatCustGroup record);
}