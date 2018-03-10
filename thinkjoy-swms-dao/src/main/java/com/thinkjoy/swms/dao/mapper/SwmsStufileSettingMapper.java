package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStufileSetting;
import com.thinkjoy.swms.dao.entity.SwmsStufileSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStufileSettingMapper {
    long countByExample(SwmsStufileSettingExample example);

    int deleteByExample(SwmsStufileSettingExample example);

    int deleteByPrimaryKey(String stufilesettingUid);

    int insert(SwmsStufileSetting record);

    int insertSelective(SwmsStufileSetting record);

    List<SwmsStufileSetting> selectByExample(SwmsStufileSettingExample example);

    SwmsStufileSetting selectByPrimaryKey(String stufilesettingUid);

    int updateByExampleSelective(@Param("record") SwmsStufileSetting record, @Param("example") SwmsStufileSettingExample example);

    int updateByExample(@Param("record") SwmsStufileSetting record, @Param("example") SwmsStufileSettingExample example);

    int updateByPrimaryKeySelective(SwmsStufileSetting record);

    int updateByPrimaryKey(SwmsStufileSetting record);
}