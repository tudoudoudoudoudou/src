package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatIdTypeCfg;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatIdTypeCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatIdTypeCfgMapper extends TableMapper {
    int countByExample(WsVatIdTypeCfgExample example);

    int deleteByExample(WsVatIdTypeCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(WsVatIdTypeCfg record);

    int insertSelective(WsVatIdTypeCfg record);

    List<WsVatIdTypeCfg> selectByExample(WsVatIdTypeCfgExample example);

    WsVatIdTypeCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") WsVatIdTypeCfg record, @Param("example") WsVatIdTypeCfgExample example);

    int updateByExample(@Param("record") WsVatIdTypeCfg record, @Param("example") WsVatIdTypeCfgExample example);

    int updateByPrimaryKeySelective(WsVatIdTypeCfg record);

    int updateByPrimaryKey(WsVatIdTypeCfg record);
}