package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsPunishSetting;
import com.thinkjoy.swms.dao.entity.SwmsPunishSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsPunishSettingMapper {
    long countByExample(SwmsPunishSettingExample example);

    int deleteByExample(SwmsPunishSettingExample example);

    int deleteByPrimaryKey(String punishsettingUid);

    int insert(SwmsPunishSetting record);

    int insertSelective(SwmsPunishSetting record);

    List<SwmsPunishSetting> selectByExample(SwmsPunishSettingExample example);

    SwmsPunishSetting selectByPrimaryKey(String punishsettingUid);

    int updateByExampleSelective(@Param("record") SwmsPunishSetting record, @Param("example") SwmsPunishSettingExample example);

    int updateByExample(@Param("record") SwmsPunishSetting record, @Param("example") SwmsPunishSettingExample example);

    int updateByPrimaryKeySelective(SwmsPunishSetting record);

    int updateByPrimaryKey(SwmsPunishSetting record);
}