package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxAccount;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatTxAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatTxAccountMapper extends TableMapper {
    int countByExample(PmVatTxAccountExample example);

    int deleteByExample(PmVatTxAccountExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatTxAccount record);

    int insertSelective(PmVatTxAccount record);

    List<PmVatTxAccount> selectByExample(PmVatTxAccountExample example);

    PmVatTxAccount selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatTxAccount record, @Param("example") PmVatTxAccountExample example);

    int updateByExample(@Param("record") PmVatTxAccount record, @Param("example") PmVatTxAccountExample example);

    int updateByPrimaryKeySelective(PmVatTxAccount record);

    int updateByPrimaryKey(PmVatTxAccount record);
}