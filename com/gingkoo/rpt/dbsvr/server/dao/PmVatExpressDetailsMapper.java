package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpressDetails;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatExpressDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatExpressDetailsMapper extends TableMapper {
    int countByExample(PmVatExpressDetailsExample example);

    int deleteByExample(PmVatExpressDetailsExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatExpressDetails record);

    int insertSelective(PmVatExpressDetails record);

    List<PmVatExpressDetails> selectByExample(PmVatExpressDetailsExample example);

    PmVatExpressDetails selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatExpressDetails record, @Param("example") PmVatExpressDetailsExample example);

    int updateByExample(@Param("record") PmVatExpressDetails record, @Param("example") PmVatExpressDetailsExample example);

    int updateByPrimaryKeySelective(PmVatExpressDetails record);

    int updateByPrimaryKey(PmVatExpressDetails record);
}