package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsWorkstudy;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsWorkstudyMapper {
    long countByExample(SwmsWorkstudyExample example);

    int deleteByExample(SwmsWorkstudyExample example);

    int deleteByPrimaryKey(String workstudyUid);

    int insert(SwmsWorkstudy record);

    int insertSelective(SwmsWorkstudy record);

    List<SwmsWorkstudy> selectByExample(SwmsWorkstudyExample example);

    SwmsWorkstudy selectByPrimaryKey(String workstudyUid);

    int updateByExampleSelective(@Param("record") SwmsWorkstudy record, @Param("example") SwmsWorkstudyExample example);

    int updateByExample(@Param("record") SwmsWorkstudy record, @Param("example") SwmsWorkstudyExample example);

    int updateByPrimaryKeySelective(SwmsWorkstudy record);

    int updateByPrimaryKey(SwmsWorkstudy record);
}