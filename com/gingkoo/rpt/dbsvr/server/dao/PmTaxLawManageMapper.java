package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmTaxLawManage;
import com.gingkoo.rpt.dbsvr.server.bean.PmTaxLawManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmTaxLawManageMapper extends TableMapper {
    int countByExample(PmTaxLawManageExample example);

    int deleteByExample(PmTaxLawManageExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmTaxLawManage record);

    int insertSelective(PmTaxLawManage record);

    List<PmTaxLawManage> selectByExample(PmTaxLawManageExample example);

    PmTaxLawManage selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmTaxLawManage record, @Param("example") PmTaxLawManageExample example);

    int updateByExample(@Param("record") PmTaxLawManage record, @Param("example") PmTaxLawManageExample example);

    int updateByPrimaryKeySelective(PmTaxLawManage record);

    int updateByPrimaryKey(PmTaxLawManage record);
}