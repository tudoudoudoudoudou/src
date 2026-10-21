package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVocSite;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVocSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatVocSiteMapper extends TableMapper {
    int countByExample(WsVatVocSiteExample example);

    int deleteByExample(WsVatVocSiteExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatVocSite record);

    int insertSelective(WsVatVocSite record);

    List<WsVatVocSite> selectByExample(WsVatVocSiteExample example);

    WsVatVocSite selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatVocSite record, @Param("example") WsVatVocSiteExample example);

    int updateByExample(@Param("record") WsVatVocSite record, @Param("example") WsVatVocSiteExample example);

    int updateByPrimaryKeySelective(WsVatVocSite record);

    int updateByPrimaryKey(WsVatVocSite record);
}