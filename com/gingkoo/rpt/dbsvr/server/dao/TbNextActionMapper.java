package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbNextAction;
import com.gingkoo.rpt.dbsvr.server.bean.TbNextActionExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbNextActionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbNextActionMapper extends TableMapper {
    int countByExample(TbNextActionExample example);

    int deleteByExample(TbNextActionExample example);

    int deleteByPrimaryKey(TbNextActionKey key);

    int insert(TbNextAction record);

    int insertSelective(TbNextAction record);

    List<TbNextAction> selectByExample(TbNextActionExample example);

    TbNextAction selectByPrimaryKey(TbNextActionKey key);

    int updateByExampleSelective(@Param("record") TbNextAction record, @Param("example") TbNextActionExample example);

    int updateByExample(@Param("record") TbNextAction record, @Param("example") TbNextActionExample example);

    int updateByPrimaryKeySelective(TbNextAction record);

    int updateByPrimaryKey(TbNextAction record);
}