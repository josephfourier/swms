package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsAllowanceSetting;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsAllowanceSettingMapper {
    long countByExample(SwmsAllowanceSettingExample example);

    int deleteByExample(SwmsAllowanceSettingExample example);

    int deleteByPrimaryKey(String allsettingUid);

    int insert(SwmsAllowanceSetting record);

    int insertSelective(SwmsAllowanceSetting record);

    List<SwmsAllowanceSetting> selectByExample(SwmsAllowanceSettingExample example);

    SwmsAllowanceSetting selectByPrimaryKey(String allsettingUid);

    int updateByExampleSelective(@Param("record") SwmsAllowanceSetting record, @Param("example") SwmsAllowanceSettingExample example);

    int updateByExample(@Param("record") SwmsAllowanceSetting record, @Param("example") SwmsAllowanceSettingExample example);

    int updateByPrimaryKeySelective(SwmsAllowanceSetting record);

    int updateByPrimaryKey(SwmsAllowanceSetting record);
}