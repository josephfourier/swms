package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStulist;
import com.thinkjoy.swms.dao.entity.SwmsStulistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStulistMapper {
    long countByExample(SwmsStulistExample example);

    int deleteByExample(SwmsStulistExample example);

    int deleteByPrimaryKey(String stulistUid);

    int insert(SwmsStulist record);

    int insertSelective(SwmsStulist record);

    List<SwmsStulist> selectByExample(SwmsStulistExample example);

    SwmsStulist selectByPrimaryKey(String stulistUid);

    int updateByExampleSelective(@Param("record") SwmsStulist record, @Param("example") SwmsStulistExample example);

    int updateByExample(@Param("record") SwmsStulist record, @Param("example") SwmsStulistExample example);

    int updateByPrimaryKeySelective(SwmsStulist record);

    int updateByPrimaryKey(SwmsStulist record);
}