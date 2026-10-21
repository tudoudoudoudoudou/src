package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOLikesaleDtl;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatOLikesaleDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatOLikesaleDtlMapper extends TableMapper {
    int countByExample(HisVatOLikesaleDtlExample example);

    int deleteByExample(HisVatOLikesaleDtlExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatOLikesaleDtl record);

    int insertSelective(HisVatOLikesaleDtl record);

    List<HisVatOLikesaleDtl> selectByExample(HisVatOLikesaleDtlExample example);

    HisVatOLikesaleDtl selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatOLikesaleDtl record, @Param("example") HisVatOLikesaleDtlExample example);

    int updateByExample(@Param("record") HisVatOLikesaleDtl record, @Param("example") HisVatOLikesaleDtlExample example);

    int updateByPrimaryKeySelective(HisVatOLikesaleDtl record);

    int updateByPrimaryKey(HisVatOLikesaleDtl record);
}