package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsNotice;
import com.thinkjoy.swms.dao.entity.SwmsNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsNoticeMapper {
    long countByExample(SwmsNoticeExample example);

    int deleteByExample(SwmsNoticeExample example);

    int deleteByPrimaryKey(String noticeUid);

    int insert(SwmsNotice record);

    int insertSelective(SwmsNotice record);

    List<SwmsNotice> selectByExample(SwmsNoticeExample example);

    SwmsNotice selectByPrimaryKey(String noticeUid);

    int updateByExampleSelective(@Param("record") SwmsNotice record, @Param("example") SwmsNoticeExample example);

    int updateByExample(@Param("record") SwmsNotice record, @Param("example") SwmsNoticeExample example);

    int updateByPrimaryKeySelective(SwmsNotice record);

    int updateByPrimaryKey(SwmsNotice record);
}