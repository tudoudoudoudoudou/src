package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIdTypeCfg;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIdTypeCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIdTypeCfgMapper extends TableMapper {
    int countByExample(HisVatIdTypeCfgExample example);

    int deleteByExample(HisVatIdTypeCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIdTypeCfg record);

    int insertSelective(HisVatIdTypeCfg record);

    List<HisVatIdTypeCfg> selectByExample(HisVatIdTypeCfgExample example);

    HisVatIdTypeCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIdTypeCfg record, @Param("example") HisVatIdTypeCfgExample example);

    int updateByExample(@Param("record") HisVatIdTypeCfg record, @Param("example") HisVatIdTypeCfgExample example);

    int updateByPrimaryKeySelective(HisVatIdTypeCfg record);

    int updateByPrimaryKey(HisVatIdTypeCfg record);
}