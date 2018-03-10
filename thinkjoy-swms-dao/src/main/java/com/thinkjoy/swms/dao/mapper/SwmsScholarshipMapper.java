package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsScholarship;
import com.thinkjoy.swms.dao.entity.SwmsScholarshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsScholarshipMapper {
    long countByExample(SwmsScholarshipExample example);

    int deleteByExample(SwmsScholarshipExample example);

    int deleteByPrimaryKey(String scholarshipUid);

    int insert(SwmsScholarship record);

    int insertSelective(SwmsScholarship record);

    List<SwmsScholarship> selectByExample(SwmsScholarshipExample example);

    SwmsScholarship selectByPrimaryKey(String scholarshipUid);

    int updateByExampleSelective(@Param("record") SwmsScholarship record, @Param("example") SwmsScholarshipExample example);

    int updateByExample(@Param("record") SwmsScholarship record, @Param("example") SwmsScholarshipExample example);

    int updateByPrimaryKeySelective(SwmsScholarship record);

    int updateByPrimaryKey(SwmsScholarship record);
}