package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatITransfer;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatITransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatITransferMapper extends TableMapper {
    int countByExample(HisVatITransferExample example);

    int deleteByExample(HisVatITransferExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatITransfer record);

    int insertSelective(HisVatITransfer record);

    List<HisVatITransfer> selectByExample(HisVatITransferExample example);

    HisVatITransfer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatITransfer record, @Param("example") HisVatITransferExample example);

    int updateByExample(@Param("record") HisVatITransfer record, @Param("example") HisVatITransferExample example);

    int updateByPrimaryKeySelective(HisVatITransfer record);

    int updateByPrimaryKey(HisVatITransfer record);
}