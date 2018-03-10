package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplate;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsApprovalTemplateMapper {
    long countByExample(SwmsApprovalTemplateExample example);

    int deleteByExample(SwmsApprovalTemplateExample example);

    int deleteByPrimaryKey(String templateUid);

    int insert(SwmsApprovalTemplate record);

    int insertSelective(SwmsApprovalTemplate record);

    List<SwmsApprovalTemplate> selectByExample(SwmsApprovalTemplateExample example);

    SwmsApprovalTemplate selectByPrimaryKey(String templateUid);

    int updateByExampleSelective(@Param("record") SwmsApprovalTemplate record, @Param("example") SwmsApprovalTemplateExample example);

    int updateByExample(@Param("record") SwmsApprovalTemplate record, @Param("example") SwmsApprovalTemplateExample example);

    int updateByPrimaryKeySelective(SwmsApprovalTemplate record);

    int updateByPrimaryKey(SwmsApprovalTemplate record);
}