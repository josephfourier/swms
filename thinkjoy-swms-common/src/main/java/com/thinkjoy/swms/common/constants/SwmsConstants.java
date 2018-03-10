package com.thinkjoy.swms.common.constants;

/**
 * Created by wangcheng on 18/3/2.
 */
public class SwmsConstants {
    // 全局会话key
    public final static String THINKJOY_OAUTH_SERVER_SESSION_ID = "thinkjoy-oauth-server-session-id";
    // 全局会话key列表
    public final static String THINKJOY_OAUTH_SERVER_SESSION_IDS = "thinkjoy-oauth-server-session-ids";
    // code key
    public final static String THINKJOY_OAUTH_SERVER_TOKEN = "thinkjoy-oauth-server-token";

    public static final String AUTHORIZATION = "Zjy-Token";

    /**
     * 审批流程步骤
     */
    public static class ApprovalSetp{
        //第一步
        public static final int FIRST_SETP=1;
    }

    /**
     *
     * 审批类型：1、职务，2、个人
     */
    public static class ApprovalType{
        public static final String POST="1";
        public static final String PERSONAL="2";
    }
    /**
     * 审批状态：0-待审批，1-已通过，2-已拒绝，3-审批中
     */
    public static class DataStatus{
        public static final String WAIT_FOR_APPROVAL="0";
        public static final String ALREADY_PASSED="1";
        public static final String HAVE_REFUSED="2";
        public static final String IN_APPROVAL="3";
    }

}
