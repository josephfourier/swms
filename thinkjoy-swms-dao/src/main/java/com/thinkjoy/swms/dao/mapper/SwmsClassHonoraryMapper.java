package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsClassHonorary;
import com.thinkjoy.swms.dao.entity.SwmsClassHonoraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsClassHonoraryMapper {
    long countByExample(SwmsClassHonoraryExample example);

    int deleteByExample(SwmsClassHonoraryExample example);

    int deleteByPrimaryKey(String clahonoraryUid);

    int insert(SwmsClassHonorary record);

    int insertSelective(SwmsClassHonorary record);

    List<SwmsClassHonorary> selectByExample(SwmsClassHonoraryExample example);

    SwmsClassHonorary selectByPrimaryKey(String clahonoraryUid);

    int updateByExampleSelective(@Param("record") SwmsClassHonorary record, @Param("example") SwmsClassHonoraryExample example);

    int updateByExample(@Param("record") SwmsClassHonorary record, @Param("example") SwmsClassHonoraryExample example);

    int updateByPrimaryKeySelective(SwmsClassHonorary record);

    int updateByPrimaryKey(SwmsClassHonorary record);
}