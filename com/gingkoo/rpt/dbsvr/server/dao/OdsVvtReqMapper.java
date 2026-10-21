package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVvtReq;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVvtReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVvtReqMapper extends TableMapper {
    int countByExample(OdsVvtReqExample example);

    int deleteByExample(OdsVvtReqExample example);

    int insert(OdsVvtReq record);

    int insertSelective(OdsVvtReq record);

    List<OdsVvtReq> selectByExample(OdsVvtReqExample example);

    int updateByExampleSelective(@Param("record") OdsVvtReq record, @Param("example") OdsVvtReqExample example);

    int updateByExample(@Param("record") OdsVvtReq record, @Param("example") OdsVvtReqExample example);
}