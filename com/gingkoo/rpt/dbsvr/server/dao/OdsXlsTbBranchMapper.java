package com.gingkoo.rpt.dbsvr.server.dao;

import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;
import com.gingkoo.gal.api.orm.mybatis.dbsvr.TableMapper;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsTbBranch;
import com.gingkoo.rpt.dbsvr.server.bean.OdsXlsTbBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OdsXlsTbBranchMapper extends TableMapper {
    int countByExample(OdsXlsTbBranchExample example);

    int deleteByExample(OdsXlsTbBranchExample example);

    int insert(OdsXlsTbBranch record);

    int insertSelective(OdsXlsTbBranch record);

    List<OdsXlsTbBranch> selectByExample(OdsXlsTbBranchExample example);

    int updateByExampleSelective(@Param("record") OdsXlsTbBranch record, @Param("example") OdsXlsTbBranchExample example);

    int updateByExample(@Param("record") OdsXlsTbBranch record, @Param("example") OdsXlsTbBranchExample example);
}