package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsPoor;
import com.thinkjoy.swms.dao.entity.SwmsPoorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsPoorMapper {
    long countByExample(SwmsPoorExample example);

    int deleteByExample(SwmsPoorExample example);

    int deleteByPrimaryKey(String poorUid);

    int insert(SwmsPoor record);

    int insertSelective(SwmsPoor record);

    List<SwmsPoor> selectByExample(SwmsPoorExample example);

    SwmsPoor selectByPrimaryKey(String poorUid);

    int updateByExampleSelective(@Param("record") SwmsPoor record, @Param("example") SwmsPoorExample example);

    int updateByExample(@Param("record") SwmsPoor record, @Param("example") SwmsPoorExample example);

    int updateByPrimaryKeySelective(SwmsPoor record);

    int updateByPrimaryKey(SwmsPoor record);
}