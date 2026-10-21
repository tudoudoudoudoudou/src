package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.TbBranch;
import com.gingkoo.rpt.dbsvr.server.bean.TbBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbBranchMapper extends TableMapper {
    int countByExample(TbBranchExample example);

    int deleteByExample(TbBranchExample example);

    int insert(TbBranch record);

    int insertSelective(TbBranch record);

    List<TbBranch> selectByExample(TbBranchExample example);

    int updateByExampleSelective(@Param("record") TbBranch record, @Param("example") TbBranchExample example);

    int updateByExample(@Param("record") TbBranch record, @Param("example") TbBranchExample example);
}