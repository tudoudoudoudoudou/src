package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOLikesaleDtl;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOLikesaleDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatOLikesaleDtlMapper extends TableMapper {
    int countByExample(PmVatOLikesaleDtlExample example);

    int deleteByExample(PmVatOLikesaleDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatOLikesaleDtl record);

    int insertSelective(PmVatOLikesaleDtl record);

    List<PmVatOLikesaleDtl> selectByExample(PmVatOLikesaleDtlExample example);

    PmVatOLikesaleDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatOLikesaleDtl record, @Param("example") PmVatOLikesaleDtlExample example);

    int updateByExample(@Param("record") PmVatOLikesaleDtl record, @Param("example") PmVatOLikesaleDtlExample example);

    int updateByPrimaryKeySelective(PmVatOLikesaleDtl record);

    int updateByPrimaryKey(PmVatOLikesaleDtl record);
}