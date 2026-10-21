package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocSiteDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatVocSiteDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatVocSiteDtlMapper extends TableMapper {
    int countByExample(HisVatVocSiteDtlExample example);

    int deleteByExample(HisVatVocSiteDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatVocSiteDtl record);

    int insertSelective(HisVatVocSiteDtl record);

    List<HisVatVocSiteDtl> selectByExample(HisVatVocSiteDtlExample example);

    HisVatVocSiteDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatVocSiteDtl record, @Param("example") HisVatVocSiteDtlExample example);

    int updateByExample(@Param("record") HisVatVocSiteDtl record, @Param("example") HisVatVocSiteDtlExample example);

    int updateByPrimaryKeySelective(HisVatVocSiteDtl record);

    int updateByPrimaryKey(HisVatVocSiteDtl record);
}