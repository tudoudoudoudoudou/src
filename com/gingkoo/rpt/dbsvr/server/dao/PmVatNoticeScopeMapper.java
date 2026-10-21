package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatNoticeScope;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatNoticeScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatNoticeScopeMapper extends TableMapper {
    int countByExample(PmVatNoticeScopeExample example);

    int deleteByExample(PmVatNoticeScopeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatNoticeScope record);

    int insertSelective(PmVatNoticeScope record);

    List<PmVatNoticeScope> selectByExample(PmVatNoticeScopeExample example);

    PmVatNoticeScope selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatNoticeScope record, @Param("example") PmVatNoticeScopeExample example);

    int updateByExample(@Param("record") PmVatNoticeScope record, @Param("example") PmVatNoticeScopeExample example);

    int updateByPrimaryKeySelective(PmVatNoticeScope record);

    int updateByPrimaryKey(PmVatNoticeScope record);
}