package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatIVoc;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatIVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatIVocMapper extends TableMapper {
    int countByExample(OdsVatIVocExample example);

    int deleteByExample(OdsVatIVocExample example);

    int insert(OdsVatIVoc record);

    int insertSelective(OdsVatIVoc record);

    List<OdsVatIVoc> selectByExample(OdsVatIVocExample example);

    int updateByExampleSelective(@Param("record") OdsVatIVoc record, @Param("example") OdsVatIVocExample example);

    int updateByExample(@Param("record") OdsVatIVoc record, @Param("example") OdsVatIVocExample example);
}