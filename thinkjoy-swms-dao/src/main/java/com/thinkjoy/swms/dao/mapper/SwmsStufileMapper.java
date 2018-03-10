package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStufile;
import com.thinkjoy.swms.dao.entity.SwmsStufileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStufileMapper {
    long countByExample(SwmsStufileExample example);

    int deleteByExample(SwmsStufileExample example);

    int deleteByPrimaryKey(String stufileUid);

    int insert(SwmsStufile record);

    int insertSelective(SwmsStufile record);

    List<SwmsStufile> selectByExample(SwmsStufileExample example);

    SwmsStufile selectByPrimaryKey(String stufileUid);

    int updateByExampleSelective(@Param("record") SwmsStufile record, @Param("example") SwmsStufileExample example);

    int updateByExample(@Param("record") SwmsStufile record, @Param("example") SwmsStufileExample example);

    int updateByPrimaryKeySelective(SwmsStufile record);

    int updateByPrimaryKey(SwmsStufile record);
}