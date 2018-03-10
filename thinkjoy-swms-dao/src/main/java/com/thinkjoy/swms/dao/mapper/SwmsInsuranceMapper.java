package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsInsurance;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsInsuranceMapper {
    long countByExample(SwmsInsuranceExample example);

    int deleteByExample(SwmsInsuranceExample example);

    int deleteByPrimaryKey(String insuranceUid);

    int insert(SwmsInsurance record);

    int insertSelective(SwmsInsurance record);

    List<SwmsInsurance> selectByExample(SwmsInsuranceExample example);

    SwmsInsurance selectByPrimaryKey(String insuranceUid);

    int updateByExampleSelective(@Param("record") SwmsInsurance record, @Param("example") SwmsInsuranceExample example);

    int updateByExample(@Param("record") SwmsInsurance record, @Param("example") SwmsInsuranceExample example);

    int updateByPrimaryKeySelective(SwmsInsurance record);

    int updateByPrimaryKey(SwmsInsurance record);
}