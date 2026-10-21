package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxEntity;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTaxEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTaxEntityMapper extends TableMapper {
    int countByExample(OdsXlsVatTaxEntityExample example);

    int deleteByExample(OdsXlsVatTaxEntityExample example);

    int insert(OdsXlsVatTaxEntity record);

    int insertSelective(OdsXlsVatTaxEntity record);

    List<OdsXlsVatTaxEntity> selectByExample(OdsXlsVatTaxEntityExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTaxEntity record, @Param("example") OdsXlsVatTaxEntityExample example);

    int updateByExample(@Param("record") OdsXlsVatTaxEntity record, @Param("example") OdsXlsVatTaxEntityExample example);
}