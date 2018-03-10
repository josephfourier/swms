package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsPoorSetting;
import com.thinkjoy.swms.dao.entity.SwmsPoorSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsPoorSettingMapper {
    long countByExample(SwmsPoorSettingExample example);

    int deleteByExample(SwmsPoorSettingExample example);

    int deleteByPrimaryKey(String poorsettingUid);

    int insert(SwmsPoorSetting record);

    int insertSelective(SwmsPoorSetting record);

    List<SwmsPoorSetting> selectByExample(SwmsPoorSettingExample example);

    SwmsPoorSetting selectByPrimaryKey(String poorsettingUid);

    int updateByExampleSelective(@Param("record") SwmsPoorSetting record, @Param("example") SwmsPoorSettingExample example);

    int updateByExample(@Param("record") SwmsPoorSetting record, @Param("example") SwmsPoorSettingExample example);

    int updateByPrimaryKeySelective(SwmsPoorSetting record);

    int updateByPrimaryKey(SwmsPoorSetting record);
}