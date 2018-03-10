package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStudentHonorary;
import com.thinkjoy.swms.dao.entity.SwmsStudentHonoraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStudentHonoraryMapper {
    long countByExample(SwmsStudentHonoraryExample example);

    int deleteByExample(SwmsStudentHonoraryExample example);

    int deleteByPrimaryKey(String stuhonoraryUid);

    int insert(SwmsStudentHonorary record);

    int insertSelective(SwmsStudentHonorary record);

    List<SwmsStudentHonorary> selectByExample(SwmsStudentHonoraryExample example);

    SwmsStudentHonorary selectByPrimaryKey(String stuhonoraryUid);

    int updateByExampleSelective(@Param("record") SwmsStudentHonorary record, @Param("example") SwmsStudentHonoraryExample example);

    int updateByExample(@Param("record") SwmsStudentHonorary record, @Param("example") SwmsStudentHonoraryExample example);

    int updateByPrimaryKeySelective(SwmsStudentHonorary record);

    int updateByPrimaryKey(SwmsStudentHonorary record);
}