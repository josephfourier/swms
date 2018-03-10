package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsScholarshipSetting;
import com.thinkjoy.swms.dao.entity.SwmsScholarshipSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsScholarshipSettingMapper {
    long countByExample(SwmsScholarshipSettingExample example);

    int deleteByExample(SwmsScholarshipSettingExample example);

    int deleteByPrimaryKey(String scholarshipsettingUid);

    int insert(SwmsScholarshipSetting record);

    int insertSelective(SwmsScholarshipSetting record);

    List<SwmsScholarshipSetting> selectByExample(SwmsScholarshipSettingExample example);

    SwmsScholarshipSetting selectByPrimaryKey(String scholarshipsettingUid);

    int updateByExampleSelective(@Param("record") SwmsScholarshipSetting record, @Param("example") SwmsScholarshipSettingExample example);

    int updateByExample(@Param("record") SwmsScholarshipSetting record, @Param("example") SwmsScholarshipSettingExample example);

    int updateByPrimaryKeySelective(SwmsScholarshipSetting record);

    int updateByPrimaryKey(SwmsScholarshipSetting record);
}