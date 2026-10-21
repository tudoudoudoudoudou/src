package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTxcode;
import com.gingkoo.rpt.dbsvr.server.bean.OdsVatTxcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsVatTxcodeMapper extends TableMapper {
    int countByExample(OdsVatTxcodeExample example);

    int deleteByExample(OdsVatTxcodeExample example);

    int insert(OdsVatTxcode record);

    int insertSelective(OdsVatTxcode record);

    List<OdsVatTxcode> selectByExample(OdsVatTxcodeExample example);

    int updateByExampleSelective(@Param("record") OdsVatTxcode record, @Param("example") OdsVatTxcodeExample example);

    int updateByExample(@Param("record") OdsVatTxcode record, @Param("example") OdsVatTxcodeExample example);
}