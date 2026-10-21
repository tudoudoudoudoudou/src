package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIMapping;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatIMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmVatIMappingMapper extends TableMapper {
    int countByExample(PmVatIMappingExample example);

    int deleteByExample(PmVatIMappingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(PmVatIMapping record);

    int insertSelective(PmVatIMapping record);

    List<PmVatIMapping> selectByExample(PmVatIMappingExample example);

    PmVatIMapping selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") PmVatIMapping record, @Param("example") PmVatIMappingExample example);

    int updateByExample(@Param("record") PmVatIMapping record, @Param("example") PmVatIMappingExample example);

    int updateByPrimaryKeySelective(PmVatIMapping record);

    int updateByPrimaryKey(PmVatIMapping record);
}