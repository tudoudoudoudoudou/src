package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatODisVocList;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatODisVocListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatODisVocListMapper extends TableMapper {
    int countByExample(PmVatODisVocListExample example);

    int deleteByExample(PmVatODisVocListExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatODisVocList record);

    int insertSelective(PmVatODisVocList record);

    List<PmVatODisVocList> selectByExample(PmVatODisVocListExample example);

    PmVatODisVocList selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatODisVocList record, @Param("example") PmVatODisVocListExample example);

    int updateByExample(@Param("record") PmVatODisVocList record, @Param("example") PmVatODisVocListExample example);

    int updateByPrimaryKeySelective(PmVatODisVocList record);

    int updateByPrimaryKey(PmVatODisVocList record);
}