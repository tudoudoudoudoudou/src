package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocSiteDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatVocSiteDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatVocSiteDtlMapper extends TableMapper {
    int countByExample(PmVatVocSiteDtlExample example);

    int deleteByExample(PmVatVocSiteDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatVocSiteDtl record);

    int insertSelective(PmVatVocSiteDtl record);

    List<PmVatVocSiteDtl> selectByExample(PmVatVocSiteDtlExample example);

    PmVatVocSiteDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatVocSiteDtl record, @Param("example") PmVatVocSiteDtlExample example);

    int updateByExample(@Param("record") PmVatVocSiteDtl record, @Param("example") PmVatVocSiteDtlExample example);

    int updateByPrimaryKeySelective(PmVatVocSiteDtl record);

    int updateByPrimaryKey(PmVatVocSiteDtl record);
}