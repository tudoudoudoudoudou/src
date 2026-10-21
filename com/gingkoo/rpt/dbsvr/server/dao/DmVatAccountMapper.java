package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.DmVatAccount;
import com.gingkoo.rpt.dbsvr.server.bean.DmVatAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DmVatAccountMapper extends TableMapper {
    int countByExample(DmVatAccountExample example);

    int deleteByExample(DmVatAccountExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(DmVatAccount record);

    int insertSelective(DmVatAccount record);

    List<DmVatAccount> selectByExample(DmVatAccountExample example);

    DmVatAccount selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") DmVatAccount record, @Param("example") DmVatAccountExample example);

    int updateByExample(@Param("record") DmVatAccount record, @Param("example") DmVatAccountExample example);

    int updateByPrimaryKeySelective(DmVatAccount record);

    int updateByPrimaryKey(DmVatAccount record);
}