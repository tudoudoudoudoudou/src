package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxcode;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTxcodeMapper extends TableMapper {
    int countByExample(HisVatTxcodeExample example);

    int deleteByExample(HisVatTxcodeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTxcode record);

    int insertSelective(HisVatTxcode record);

    List<HisVatTxcode> selectByExample(HisVatTxcodeExample example);

    HisVatTxcode selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTxcode record, @Param("example") HisVatTxcodeExample example);

    int updateByExample(@Param("record") HisVatTxcode record, @Param("example") HisVatTxcodeExample example);

    int updateByPrimaryKeySelective(HisVatTxcode record);

    int updateByPrimaryKey(HisVatTxcode record);
}