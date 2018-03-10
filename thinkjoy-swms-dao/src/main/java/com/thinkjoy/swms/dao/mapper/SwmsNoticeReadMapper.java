package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsNoticeRead;
import com.thinkjoy.swms.dao.entity.SwmsNoticeReadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsNoticeReadMapper {
    long countByExample(SwmsNoticeReadExample example);

    int deleteByExample(SwmsNoticeReadExample example);

    int deleteByPrimaryKey(String readUid);

    int insert(SwmsNoticeRead record);

    int insertSelective(SwmsNoticeRead record);

    List<SwmsNoticeRead> selectByExample(SwmsNoticeReadExample example);

    SwmsNoticeRead selectByPrimaryKey(String readUid);

    int updateByExampleSelective(@Param("record") SwmsNoticeRead record, @Param("example") SwmsNoticeReadExample example);

    int updateByExample(@Param("record") SwmsNoticeRead record, @Param("example") SwmsNoticeReadExample example);

    int updateByPrimaryKeySelective(SwmsNoticeRead record);

    int updateByPrimaryKey(SwmsNoticeRead record);
}