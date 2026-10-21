package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxcode;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTxcodeMapper extends TableMapper {
    int countByExample(PmVatTxcodeExample example);

    int deleteByExample(PmVatTxcodeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTxcode record);

    int insertSelective(PmVatTxcode record);

    List<PmVatTxcode> selectByExample(PmVatTxcodeExample example);

    PmVatTxcode selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTxcode record, @Param("example") PmVatTxcodeExample example);

    int updateByExample(@Param("record") PmVatTxcode record, @Param("example") PmVatTxcodeExample example);

    int updateByPrimaryKeySelective(PmVatTxcode record);

    int updateByPrimaryKey(PmVatTxcode record);
}