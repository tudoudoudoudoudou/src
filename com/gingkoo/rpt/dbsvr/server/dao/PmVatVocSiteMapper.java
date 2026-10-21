package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocSite;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatVocSiteMapper extends TableMapper {
    int countByExample(PmVatVocSiteExample example);

    int deleteByExample(PmVatVocSiteExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatVocSite record);

    int insertSelective(PmVatVocSite record);

    List<PmVatVocSite> selectByExample(PmVatVocSiteExample example);

    PmVatVocSite selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatVocSite record, @Param("example") PmVatVocSiteExample example);

    int updateByExample(@Param("record") PmVatVocSite record, @Param("example") PmVatVocSiteExample example);

    int updateByPrimaryKeySelective(PmVatVocSite record);

    int updateByPrimaryKey(PmVatVocSite record);
}