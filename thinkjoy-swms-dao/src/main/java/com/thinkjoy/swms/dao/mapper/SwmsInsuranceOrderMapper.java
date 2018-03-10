package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrder;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsInsuranceOrderMapper {
    long countByExample(SwmsInsuranceOrderExample example);

    int deleteByExample(SwmsInsuranceOrderExample example);

    int deleteByPrimaryKey(String orderUid);

    int insert(SwmsInsuranceOrder record);

    int insertSelective(SwmsInsuranceOrder record);

    List<SwmsInsuranceOrder> selectByExample(SwmsInsuranceOrderExample example);

    SwmsInsuranceOrder selectByPrimaryKey(String orderUid);

    int updateByExampleSelective(@Param("record") SwmsInsuranceOrder record, @Param("example") SwmsInsuranceOrderExample example);

    int updateByExample(@Param("record") SwmsInsuranceOrder record, @Param("example") SwmsInsuranceOrderExample example);

    int updateByPrimaryKeySelective(SwmsInsuranceOrder record);

    int updateByPrimaryKey(SwmsInsuranceOrder record);
}