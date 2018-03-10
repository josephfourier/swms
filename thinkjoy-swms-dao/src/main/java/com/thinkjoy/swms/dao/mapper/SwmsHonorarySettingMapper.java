package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsHonorarySetting;
import com.thinkjoy.swms.dao.entity.SwmsHonorarySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsHonorarySettingMapper {
    long countByExample(SwmsHonorarySettingExample example);

    int deleteByExample(SwmsHonorarySettingExample example);

    int deleteByPrimaryKey(String honorarysettingUid);

    int insert(SwmsHonorarySetting record);

    int insertSelective(SwmsHonorarySetting record);

    List<SwmsHonorarySetting> selectByExample(SwmsHonorarySettingExample example);

    SwmsHonorarySetting selectByPrimaryKey(String honorarysettingUid);

    int updateByExampleSelective(@Param("record") SwmsHonorarySetting record, @Param("example") SwmsHonorarySettingExample example);

    int updateByExample(@Param("record") SwmsHonorarySetting record, @Param("example") SwmsHonorarySettingExample example);

    int updateByPrimaryKeySelective(SwmsHonorarySetting record);

    int updateByPrimaryKey(SwmsHonorarySetting record);
}