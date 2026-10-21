package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatBVocRange;
import com.gingkoo.rpt.dbsvr.server.bean.WsVatBVocRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WsVatBVocRangeMapper extends TableMapper {
    int countByExample(WsVatBVocRangeExample example);

    int deleteByExample(WsVatBVocRangeExample example);

    int insert(WsVatBVocRange record);

    int insertSelective(WsVatBVocRange record);

    List<WsVatBVocRange> selectByExample(WsVatBVocRangeExample example);

    int updateByExampleSelective(@Param("record") WsVatBVocRange record, @Param("example") WsVatBVocRangeExample example);

    int updateByExample(@Param("record") WsVatBVocRange record, @Param("example") WsVatBVocRangeExample example);
}