package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsAllowance;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsAllowanceMapper {
    long countByExample(SwmsAllowanceExample example);

    int deleteByExample(SwmsAllowanceExample example);

    int deleteByPrimaryKey(String allowanceUid);

    int insert(SwmsAllowance record);

    int insertSelective(SwmsAllowance record);

    List<SwmsAllowance> selectByExample(SwmsAllowanceExample example);

    SwmsAllowance selectByPrimaryKey(String allowanceUid);

    int updateByExampleSelective(@Param("record") SwmsAllowance record, @Param("example") SwmsAllowanceExample example);

    int updateByExample(@Param("record") SwmsAllowance record, @Param("example") SwmsAllowanceExample example);

    int updateByPrimaryKeySelective(SwmsAllowance record);

    int updateByPrimaryKey(SwmsAllowance record);
}