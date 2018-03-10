package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStayholiday;
import com.thinkjoy.swms.dao.entity.SwmsStayholidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStayholidayMapper {
    long countByExample(SwmsStayholidayExample example);

    int deleteByExample(SwmsStayholidayExample example);

    int deleteByPrimaryKey(String stayholidayUid);

    int insert(SwmsStayholiday record);

    int insertSelective(SwmsStayholiday record);

    List<SwmsStayholiday> selectByExample(SwmsStayholidayExample example);

    SwmsStayholiday selectByPrimaryKey(String stayholidayUid);

    int updateByExampleSelective(@Param("record") SwmsStayholiday record, @Param("example") SwmsStayholidayExample example);

    int updateByExample(@Param("record") SwmsStayholiday record, @Param("example") SwmsStayholidayExample example);

    int updateByPrimaryKeySelective(SwmsStayholiday record);

    int updateByPrimaryKey(SwmsStayholiday record);
}