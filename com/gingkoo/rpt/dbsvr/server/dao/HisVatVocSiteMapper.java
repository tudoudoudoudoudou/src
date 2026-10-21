package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocSite;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatVocSiteMapper extends TableMapper {
    int countByExample(HisVatVocSiteExample example);

    int deleteByExample(HisVatVocSiteExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatVocSite record);

    int insertSelective(HisVatVocSite record);

    List<HisVatVocSite> selectByExample(HisVatVocSiteExample example);

    HisVatVocSite selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatVocSite record, @Param("example") HisVatVocSiteExample example);

    int updateByExample(@Param("record") HisVatVocSite record, @Param("example") HisVatVocSiteExample example);

    int updateByPrimaryKeySelective(HisVatVocSite record);

    int updateByPrimaryKey(HisVatVocSite record);
}