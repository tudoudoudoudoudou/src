package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTxcode;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsVatTxcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsVatTxcodeMapper extends TableMapper {
    int countByExample(OdsXlsVatTxcodeExample example);

    int deleteByExample(OdsXlsVatTxcodeExample example);

    int insert(OdsXlsVatTxcode record);

    int insertSelective(OdsXlsVatTxcode record);

    List<OdsXlsVatTxcode> selectByExample(OdsXlsVatTxcodeExample example);

    int updateByExampleSelective(@Param("record") OdsXlsVatTxcode record, @Param("example") OdsXlsVatTxcodeExample example);

    int updateByExample(@Param("record") OdsXlsVatTxcode record, @Param("example") OdsXlsVatTxcodeExample example);
}