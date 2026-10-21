package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatGoodCode;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatGoodCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatGoodCodeMapper extends TableMapper {
    int countByExample(OdsVatGoodCodeExample example);

    int deleteByExample(OdsVatGoodCodeExample example);

    int deleteByPrimaryKey(String goodCode);

    int insert(OdsVatGoodCode record);

    int insertSelective(OdsVatGoodCode record);

    List<OdsVatGoodCode> selectByExample(OdsVatGoodCodeExample example);

    OdsVatGoodCode selectByPrimaryKey(String goodCode);

    int updateByExampleSelective(@Param("record") OdsVatGoodCode record, @Param("example") OdsVatGoodCodeExample example);

    int updateByExample(@Param("record") OdsVatGoodCode record, @Param("example") OdsVatGoodCodeExample example);

    int updateByPrimaryKeySelective(OdsVatGoodCode record);

    int updateByPrimaryKey(OdsVatGoodCode record);
}