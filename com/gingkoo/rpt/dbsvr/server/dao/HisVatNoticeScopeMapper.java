package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatNoticeScope;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatNoticeScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatNoticeScopeMapper extends TableMapper {
    int countByExample(HisVatNoticeScopeExample example);

    int deleteByExample(HisVatNoticeScopeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatNoticeScope record);

    int insertSelective(HisVatNoticeScope record);

    List<HisVatNoticeScope> selectByExample(HisVatNoticeScopeExample example);

    HisVatNoticeScope selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatNoticeScope record, @Param("example") HisVatNoticeScopeExample example);

    int updateByExample(@Param("record") HisVatNoticeScope record, @Param("example") HisVatNoticeScopeExample example);

    int updateByPrimaryKeySelective(HisVatNoticeScope record);

    int updateByPrimaryKey(HisVatNoticeScope record);
}