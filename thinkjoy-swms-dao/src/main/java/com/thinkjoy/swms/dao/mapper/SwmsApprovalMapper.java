package com.thinkjoy.swms.dao.mapper;

import com.thinkjoy.swms.dao.entity.SwmsApproval;
import com.thinkjoy.swms.dao.entity.SwmsApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwmsApprovalMapper {
    long countByExample(SwmsApprovalExample example);

    int deleteByExample(SwmsApprovalExample example);

    int deleteByPrimaryKey(String approvalUid);

    int insert(SwmsApproval record);

    int insertSelective(SwmsApproval record);

    List<SwmsApproval> selectByExample(SwmsApprovalExample example);

    SwmsApproval selectByPrimaryKey(String approvalUid);

    int updateByExampleSelective(@Param("record") SwmsApproval record, @Param("example") SwmsApprovalExample example);

    int updateByExample(@Param("record") SwmsApproval record, @Param("example") SwmsApprovalExample example);

    int updateByPrimaryKeySelective(SwmsApproval record);

    int updateByPrimaryKey(SwmsApproval record);
}