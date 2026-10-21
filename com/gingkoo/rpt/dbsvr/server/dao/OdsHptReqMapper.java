package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsHptReq;
import com.gingkoo.rpt.dbsvr.server.bean.OdsHptReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsHptReqMapper extends TableMapper {
    int countByExample(OdsHptReqExample example);

    int deleteByExample(OdsHptReqExample example);

    int insert(OdsHptReq record);

    int insertSelective(OdsHptReq record);

    List<OdsHptReq> selectByExample(OdsHptReqExample example);

    int updateByExampleSelective(@Param("record") OdsHptReq record, @Param("example") OdsHptReqExample example);

    int updateByExample(@Param("record") OdsHptReq record, @Param("example") OdsHptReqExample example);
}