package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsWorkstudySetting;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsWorkstudySettingMapper {
    long countByExample(SwmsWorkstudySettingExample example);

    int deleteByExample(SwmsWorkstudySettingExample example);

    int deleteByPrimaryKey(String worksettingUid);

    int insert(SwmsWorkstudySetting record);

    int insertSelective(SwmsWorkstudySetting record);

    List<SwmsWorkstudySetting> selectByExample(SwmsWorkstudySettingExample example);

    SwmsWorkstudySetting selectByPrimaryKey(String worksettingUid);

    int updateByExampleSelective(@Param("record") SwmsWorkstudySetting record, @Param("example") SwmsWorkstudySettingExample example);

    int updateByExample(@Param("record") SwmsWorkstudySetting record, @Param("example") SwmsWorkstudySettingExample example);

    int updateByPrimaryKeySelective(SwmsWorkstudySetting record);

    int updateByPrimaryKey(SwmsWorkstudySetting record);
}