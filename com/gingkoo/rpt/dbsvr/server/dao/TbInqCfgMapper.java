package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbInqCfg;
import com.gingkoo.rpt.dbsvr.server.bean.TbInqCfgExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbInqCfgKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbInqCfgMapper extends TableMapper {
    int countByExample(TbInqCfgExample example);

    int deleteByExample(TbInqCfgExample example);

    int deleteByPrimaryKey(TbInqCfgKey key);

    int insert(TbInqCfg record);

    int insertSelective(TbInqCfg record);

    List<TbInqCfg> selectByExample(TbInqCfgExample example);

    TbInqCfg selectByPrimaryKey(TbInqCfgKey key);

    int updateByExampleSelective(@Param("record") TbInqCfg record, @Param("example") TbInqCfgExample example);

    int updateByExample(@Param("record") TbInqCfg record, @Param("example") TbInqCfgExample example);

    int updateByPrimaryKeySelective(TbInqCfg record);

    int updateByPrimaryKey(TbInqCfg record);
}