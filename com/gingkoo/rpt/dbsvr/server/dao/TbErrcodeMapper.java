package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbErrcode;
import com.gingkoo.rpt.dbsvr.server.bean.TbErrcodeExample;
import com.gingkoo.rpt.dbsvr.server.bean.TbErrcodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbErrcodeMapper extends TableMapper {
    int countByExample(TbErrcodeExample example);

    int deleteByExample(TbErrcodeExample example);

    int deleteByPrimaryKey(TbErrcodeKey key);

    int insert(TbErrcode record);

    int insertSelective(TbErrcode record);

    List<TbErrcode> selectByExample(TbErrcodeExample example);

    TbErrcode selectByPrimaryKey(TbErrcodeKey key);

    int updateByExampleSelective(@Param("record") TbErrcode record, @Param("example") TbErrcodeExample example);

    int updateByExample(@Param("record") TbErrcode record, @Param("example") TbErrcodeExample example);

    int updateByPrimaryKeySelective(TbErrcode record);

    int updateByPrimaryKey(TbErrcode record);
}