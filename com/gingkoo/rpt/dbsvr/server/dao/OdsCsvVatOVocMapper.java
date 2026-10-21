package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatOVoc;
import com.gingkoo.rpt.dbsvr.server.bean.OdsCsvVatOVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsCsvVatOVocMapper extends TableMapper {
    int countByExample(OdsCsvVatOVocExample example);

    int deleteByExample(OdsCsvVatOVocExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(OdsCsvVatOVoc record);

    int insertSelective(OdsCsvVatOVoc record);

    List<OdsCsvVatOVoc> selectByExample(OdsCsvVatOVocExample example);

    OdsCsvVatOVoc selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") OdsCsvVatOVoc record, @Param("example") OdsCsvVatOVocExample example);

    int updateByExample(@Param("record") OdsCsvVatOVoc record, @Param("example") OdsCsvVatOVocExample example);

    int updateByPrimaryKeySelective(OdsCsvVatOVoc record);

    int updateByPrimaryKey(OdsCsvVatOVoc record);
}