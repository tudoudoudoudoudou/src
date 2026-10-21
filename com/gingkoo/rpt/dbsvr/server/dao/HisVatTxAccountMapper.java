package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxAccount;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatTxAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatTxAccountMapper extends TableMapper {
    int countByExample(HisVatTxAccountExample example);

    int deleteByExample(HisVatTxAccountExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatTxAccount record);

    int insertSelective(HisVatTxAccount record);

    List<HisVatTxAccount> selectByExample(HisVatTxAccountExample example);

    HisVatTxAccount selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatTxAccount record, @Param("example") HisVatTxAccountExample example);

    int updateByExample(@Param("record") HisVatTxAccount record, @Param("example") HisVatTxAccountExample example);

    int updateByPrimaryKeySelective(HisVatTxAccount record);

    int updateByPrimaryKey(HisVatTxAccount record);
}