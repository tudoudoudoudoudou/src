package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbSysparams;
import com.gingkoo.rpt.dbsvr.server.bean.TbSysparamsExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbSysparamsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbSysparamsMapper extends TableMapper {
    int countByExample(TbSysparamsExample example);

    int deleteByExample(TbSysparamsExample example);

    int deleteByPrimaryKey(TbSysparamsKey key);

    int insert(TbSysparams record);

    int insertSelective(TbSysparams record);

    List<TbSysparams> selectByExample(TbSysparamsExample example);

    TbSysparams selectByPrimaryKey(TbSysparamsKey key);

    int updateByExampleSelective(@Param("record") TbSysparams record, @Param("example") TbSysparamsExample example);

    int updateByExample(@Param("record") TbSysparams record, @Param("example") TbSysparamsExample example);

    int updateByPrimaryKeySelective(TbSysparams record);

    int updateByPrimaryKey(TbSysparams record);
}