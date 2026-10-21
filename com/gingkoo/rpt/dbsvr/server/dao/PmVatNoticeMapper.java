package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatNotice;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatNoticeMapper extends TableMapper {
    int countByExample(PmVatNoticeExample example);

    int deleteByExample(PmVatNoticeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatNotice record);

    int insertSelective(PmVatNotice record);

    List<PmVatNotice> selectByExample(PmVatNoticeExample example);

    PmVatNotice selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatNotice record, @Param("example") PmVatNoticeExample example);

    int updateByExample(@Param("record") PmVatNotice record, @Param("example") PmVatNoticeExample example);

    int updateByPrimaryKeySelective(PmVatNotice record);

    int updateByPrimaryKey(PmVatNotice record);
}