package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatVocSite;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatVocSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatVocSiteMapper extends TableMapper {
    int countByExample(OdsXlsVatVocSiteExample example);

    int deleteByExample(OdsXlsVatVocSiteExample example);

    int insert(OdsXlsVatVocSite record);

    int insertSelective(OdsXlsVatVocSite record);

    List<OdsXlsVatVocSite> selectByExample(OdsXlsVatVocSiteExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatVocSite record, @Param("example") OdsXlsVatVocSiteExample example);

    int updateByExample(@Param("record") OdsXlsVatVocSite record, @Param("example") OdsXlsVatVocSiteExample example);
}