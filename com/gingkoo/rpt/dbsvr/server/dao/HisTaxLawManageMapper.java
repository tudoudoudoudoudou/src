package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisTaxLawManage;
import com.gingkoo.rpt.dbsvr.server.bean.HisTaxLawManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisTaxLawManageMapper extends TableMapper {
    int countByExample(HisTaxLawManageExample example);

    int deleteByExample(HisTaxLawManageExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisTaxLawManage record);

    int insertSelective(HisTaxLawManage record);

    List<HisTaxLawManage> selectByExample(HisTaxLawManageExample example);

    HisTaxLawManage selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisTaxLawManage record, @Param("example") HisTaxLawManageExample example);

    int updateByExample(@Param("record") HisTaxLawManage record, @Param("example") HisTaxLawManageExample example);

    int updateByPrimaryKeySelective(HisTaxLawManage record);

    int updateByPrimaryKey(HisTaxLawManage record);
}