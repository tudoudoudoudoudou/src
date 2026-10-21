package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatNotice;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatNoticeMapper extends TableMapper {
    int countByExample(HisVatNoticeExample example);

    int deleteByExample(HisVatNoticeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatNotice record);

    int insertSelective(HisVatNotice record);

    List<HisVatNotice> selectByExample(HisVatNoticeExample example);

    HisVatNotice selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatNotice record, @Param("example") HisVatNoticeExample example);

    int updateByExample(@Param("record") HisVatNotice record, @Param("example") HisVatNoticeExample example);

    int updateByPrimaryKeySelective(HisVatNotice record);

    int updateByPrimaryKey(HisVatNotice record);
}