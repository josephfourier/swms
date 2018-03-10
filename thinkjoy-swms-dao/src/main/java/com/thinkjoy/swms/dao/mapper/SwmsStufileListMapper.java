package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStufileList;
import com.thinkjoy.swms.dao.entity.SwmsStufileListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStufileListMapper {
    long countByExample(SwmsStufileListExample example);

    int deleteByExample(SwmsStufileListExample example);

    int deleteByPrimaryKey(String listUid);

    int insert(SwmsStufileList record);

    int insertSelective(SwmsStufileList record);

    List<SwmsStufileList> selectByExample(SwmsStufileListExample example);

    SwmsStufileList selectByPrimaryKey(String listUid);

    int updateByExampleSelective(@Param("record") SwmsStufileList record, @Param("example") SwmsStufileListExample example);

    int updateByExample(@Param("record") SwmsStufileList record, @Param("example") SwmsStufileListExample example);

    int updateByPrimaryKeySelective(SwmsStufileList record);

    int updateByPrimaryKey(SwmsStufileList record);
}