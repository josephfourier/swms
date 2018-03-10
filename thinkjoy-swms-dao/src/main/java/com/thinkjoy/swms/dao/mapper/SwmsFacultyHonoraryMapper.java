package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsFacultyHonorary;
import com.thinkjoy.swms.dao.entity.SwmsFacultyHonoraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsFacultyHonoraryMapper {
    long countByExample(SwmsFacultyHonoraryExample example);

    int deleteByExample(SwmsFacultyHonoraryExample example);

    int deleteByPrimaryKey(String fachonoraryUid);

    int insert(SwmsFacultyHonorary record);

    int insertSelective(SwmsFacultyHonorary record);

    List<SwmsFacultyHonorary> selectByExample(SwmsFacultyHonoraryExample example);

    SwmsFacultyHonorary selectByPrimaryKey(String fachonoraryUid);

    int updateByExampleSelective(@Param("record") SwmsFacultyHonorary record, @Param("example") SwmsFacultyHonoraryExample example);

    int updateByExample(@Param("record") SwmsFacultyHonorary record, @Param("example") SwmsFacultyHonoraryExample example);

    int updateByPrimaryKeySelective(SwmsFacultyHonorary record);

    int updateByPrimaryKey(SwmsFacultyHonorary record);
}