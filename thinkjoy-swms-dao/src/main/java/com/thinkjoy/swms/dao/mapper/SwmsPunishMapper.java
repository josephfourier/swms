package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsPunish;
import com.thinkjoy.swms.dao.entity.SwmsPunishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsPunishMapper {
    long countByExample(SwmsPunishExample example);

    int deleteByExample(SwmsPunishExample example);

    int deleteByPrimaryKey(String punishUid);

    int insert(SwmsPunish record);

    int insertSelective(SwmsPunish record);

    List<SwmsPunish> selectByExample(SwmsPunishExample example);

    SwmsPunish selectByPrimaryKey(String punishUid);

    int updateByExampleSelective(@Param("record") SwmsPunish record, @Param("example") SwmsPunishExample example);

    int updateByExample(@Param("record") SwmsPunish record, @Param("example") SwmsPunishExample example);

    int updateByPrimaryKeySelective(SwmsPunish record);

    int updateByPrimaryKey(SwmsPunish record);
}