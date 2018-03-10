package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsStuidcard;
import com.thinkjoy.swms.dao.entity.SwmsStuidcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsStuidcardMapper {
    long countByExample(SwmsStuidcardExample example);

    int deleteByExample(SwmsStuidcardExample example);

    int deleteByPrimaryKey(String stuidcardUid);

    int insert(SwmsStuidcard record);

    int insertSelective(SwmsStuidcard record);

    List<SwmsStuidcard> selectByExample(SwmsStuidcardExample example);

    SwmsStuidcard selectByPrimaryKey(String stuidcardUid);

    int updateByExampleSelective(@Param("record") SwmsStuidcard record, @Param("example") SwmsStuidcardExample example);

    int updateByExample(@Param("record") SwmsStuidcard record, @Param("example") SwmsStuidcardExample example);

    int updateByPrimaryKeySelective(SwmsStuidcard record);

    int updateByPrimaryKey(SwmsStuidcard record);
}