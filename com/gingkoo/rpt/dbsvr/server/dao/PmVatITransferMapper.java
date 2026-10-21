package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatITransfer;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatITransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatITransferMapper extends TableMapper {
    int countByExample(PmVatITransferExample example);

    int deleteByExample(PmVatITransferExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatITransfer record);

    int insertSelective(PmVatITransfer record);

    List<PmVatITransfer> selectByExample(PmVatITransferExample example);

    PmVatITransfer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatITransfer record, @Param("example") PmVatITransferExample example);

    int updateByExample(@Param("record") PmVatITransfer record, @Param("example") PmVatITransferExample example);

    int updateByPrimaryKeySelective(PmVatITransfer record);

    int updateByPrimaryKey(PmVatITransfer record);
}