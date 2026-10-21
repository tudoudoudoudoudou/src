package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatPayR;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatPayRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatPayRMapper extends TableMapper {
    int countByExample(OdsVatPayRExample example);

    int deleteByExample(OdsVatPayRExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsVatPayR record);

    int insertSelective(OdsVatPayR record);

    List<OdsVatPayR> selectByExample(OdsVatPayRExample example);

    OdsVatPayR selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsVatPayR record, @Param("example") OdsVatPayRExample example);

    int updateByExample(@Param("record") OdsVatPayR record, @Param("example") OdsVatPayRExample example);

    int updateByPrimaryKeySelective(OdsVatPayR record);

    int updateByPrimaryKey(OdsVatPayR record);
}