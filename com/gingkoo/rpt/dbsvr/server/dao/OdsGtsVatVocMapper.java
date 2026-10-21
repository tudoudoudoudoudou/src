package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsGtsVatVoc;
import com.gingkoo.rpt.dbsvr.server.bean.OdsGtsVatVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsGtsVatVocMapper extends TableMapper {
    int countByExample(OdsGtsVatVocExample example);

    int deleteByExample(OdsGtsVatVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsGtsVatVoc record);

    int insertSelective(OdsGtsVatVoc record);

    List<OdsGtsVatVoc> selectByExample(OdsGtsVatVocExample example);

    OdsGtsVatVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsGtsVatVoc record, @Param("example") OdsGtsVatVocExample example);

    int updateByExample(@Param("record") OdsGtsVatVoc record, @Param("example") OdsGtsVatVocExample example);

    int updateByPrimaryKeySelective(OdsGtsVatVoc record);

    int updateByPrimaryKey(OdsGtsVatVoc record);
}