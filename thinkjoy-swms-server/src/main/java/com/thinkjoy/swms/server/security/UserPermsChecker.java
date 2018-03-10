package com.thinkjoy.swms.server.security;

import java.util.Set;

/**
 * 权限校验器,策略接口,可自行定制规则
 *
 * @author wangcheng
 * @date 18/3/2
 */
public interface UserPermsChecker {
    /**
     * 检查是否有所需角色
     *
     * @param needroles 调用某接口所需的角色
     * @param hasroles  已有的角色
     * @param checkAll  是否全部匹配所需角色
     * @return
     */
    boolean hasRoles(String[] needroles, Set<String> hasroles, boolean checkAll);

    /**
     * 检查是否有所需权限
     *
     * @param needperms 调用某接口所需的权限
     * @param hasperms  已有的权限
     * @param checkAll  是否全部匹配所需权限
     * @return
     */
    boolean hasPerms(String[] needperms, Set<String> hasperms, boolean checkAll);
}
