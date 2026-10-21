package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatPayR;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatPayRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatPayRMapper extends TableMapper {
    int countByExample(OdsCsvVatPayRExample example);

    int deleteByExample(OdsCsvVatPayRExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatPayR record);

    int insertSelective(OdsCsvVatPayR record);

    List<OdsCsvVatPayR> selectByExample(OdsCsvVatPayRExample example);

    OdsCsvVatPayR selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatPayR record, @Param("example") OdsCsvVatPayRExample example);

    int updateByExample(@Param("record") OdsCsvVatPayR record, @Param("example") OdsCsvVatPayRExample example);

    int updateByPrimaryKeySelective(OdsCsvVatPayR record);

    int updateByPrimaryKey(OdsCsvVatPayR record);
}