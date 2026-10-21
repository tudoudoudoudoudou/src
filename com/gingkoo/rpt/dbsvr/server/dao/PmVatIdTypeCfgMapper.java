package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIdTypeCfg;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIdTypeCfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIdTypeCfgMapper extends TableMapper {
    int countByExample(PmVatIdTypeCfgExample example);

    int deleteByExample(PmVatIdTypeCfgExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIdTypeCfg record);

    int insertSelective(PmVatIdTypeCfg record);

    List<PmVatIdTypeCfg> selectByExample(PmVatIdTypeCfgExample example);

    PmVatIdTypeCfg selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIdTypeCfg record, @Param("example") PmVatIdTypeCfgExample example);

    int updateByExample(@Param("record") PmVatIdTypeCfg record, @Param("example") PmVatIdTypeCfgExample example);

    int updateByPrimaryKeySelective(PmVatIdTypeCfg record);

    int updateByPrimaryKey(PmVatIdTypeCfg record);
}