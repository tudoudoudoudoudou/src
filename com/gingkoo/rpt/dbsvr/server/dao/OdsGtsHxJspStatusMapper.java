package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsGtsHxJspStatus;
import com.gingkoo.rpt.dbsvr.server.bean.OdsGtsHxJspStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsGtsHxJspStatusMapper extends TableMapper {
    int countByExample(OdsGtsHxJspStatusExample example);

    int deleteByExample(OdsGtsHxJspStatusExample example);

    int insert(OdsGtsHxJspStatus record);

    int insertSelective(OdsGtsHxJspStatus record);

    List<OdsGtsHxJspStatus> selectByExample(OdsGtsHxJspStatusExample example);

    int updateByExampleSelective(@Param("record") OdsGtsHxJspStatus record, @Param("example") OdsGtsHxJspStatusExample example);

    int updateByExample(@Param("record") OdsGtsHxJspStatus record, @Param("example") OdsGtsHxJspStatusExample example);
}