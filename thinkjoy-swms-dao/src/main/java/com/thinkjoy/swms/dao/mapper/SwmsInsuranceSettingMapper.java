package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsInsuranceSetting;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsInsuranceSettingMapper {
    long countByExample(SwmsInsuranceSettingExample example);

    int deleteByExample(SwmsInsuranceSettingExample example);

    int deleteByPrimaryKey(String inssettingUid);

    int insert(SwmsInsuranceSetting record);

    int insertSelective(SwmsInsuranceSetting record);

    List<SwmsInsuranceSetting> selectByExample(SwmsInsuranceSettingExample example);

    SwmsInsuranceSetting selectByPrimaryKey(String inssettingUid);

    int updateByExampleSelective(@Param("record") SwmsInsuranceSetting record, @Param("example") SwmsInsuranceSettingExample example);

    int updateByExample(@Param("record") SwmsInsuranceSetting record, @Param("example") SwmsInsuranceSettingExample example);

    int updateByPrimaryKeySelective(SwmsInsuranceSetting record);

    int updateByPrimaryKey(SwmsInsuranceSetting record);
}