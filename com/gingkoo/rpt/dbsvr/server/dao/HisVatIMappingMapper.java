package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIMapping;
import com.gingkoo.rpt.dbsvr.server.bean.HisVatIMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HisVatIMappingMapper extends TableMapper {
    int countByExample(HisVatIMappingExample example);

    int deleteByExample(HisVatIMappingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(HisVatIMapping record);

    int insertSelective(HisVatIMapping record);

    List<HisVatIMapping> selectByExample(HisVatIMappingExample example);

    HisVatIMapping selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") HisVatIMapping record, @Param("example") HisVatIMappingExample example);

    int updateByExample(@Param("record") HisVatIMapping record, @Param("example") HisVatIMappingExample example);

    int updateByPrimaryKeySelective(HisVatIMapping record);

    int updateByPrimaryKey(HisVatIMapping record);
}