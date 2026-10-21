package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatIVoc;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatIVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatIVocMapper extends TableMapper {
    int countByExample(OdsXlsVatIVocExample example);

    int deleteByExample(OdsXlsVatIVocExample example);

    int insert(OdsXlsVatIVoc record);

    int insertSelective(OdsXlsVatIVoc record);

    List<OdsXlsVatIVoc> selectByExample(OdsXlsVatIVocExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatIVoc record, @Param("example") OdsXlsVatIVocExample example);

    int updateByExample(@Param("record") OdsXlsVatIVoc record, @Param("example") OdsXlsVatIVocExample example);
}