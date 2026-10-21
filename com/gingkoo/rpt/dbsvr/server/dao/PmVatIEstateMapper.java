package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIEstate;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIEstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIEstateMapper extends TableMapper {
    int countByExample(PmVatIEstateExample example);

    int deleteByExample(PmVatIEstateExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIEstate record);

    int insertSelective(PmVatIEstate record);

    List<PmVatIEstate> selectByExample(PmVatIEstateExample example);

    PmVatIEstate selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIEstate record, @Param("example") PmVatIEstateExample example);

    int updateByExample(@Param("record") PmVatIEstate record, @Param("example") PmVatIEstateExample example);

    int updateByPrimaryKeySelective(PmVatIEstate record);

    int updateByPrimaryKey(PmVatIEstate record);
}