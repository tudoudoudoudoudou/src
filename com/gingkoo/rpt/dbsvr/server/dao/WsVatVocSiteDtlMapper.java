package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVocSiteDtl;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatVocSiteDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatVocSiteDtlMapper extends TableMapper {
    int countByExample(WsVatVocSiteDtlExample example);

    int deleteByExample(WsVatVocSiteDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatVocSiteDtl record);

    int insertSelective(WsVatVocSiteDtl record);

    List<WsVatVocSiteDtl> selectByExample(WsVatVocSiteDtlExample example);

    WsVatVocSiteDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatVocSiteDtl record, @Param("example") WsVatVocSiteDtlExample example);

    int updateByExample(@Param("record") WsVatVocSiteDtl record, @Param("example") WsVatVocSiteDtlExample example);

    int updateByPrimaryKeySelective(WsVatVocSiteDtl record);

    int updateByPrimaryKey(WsVatVocSiteDtl record);
}