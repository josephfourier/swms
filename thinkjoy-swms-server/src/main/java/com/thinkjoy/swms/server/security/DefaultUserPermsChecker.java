package com.thinkjoy.swms.server.security;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author wangcheng
 * @date 18/3/2
 */
@Component
public class DefaultUserPermsChecker implements UserPermsChecker {

    @Override
    public boolean hasRoles(String[] needroles, Set<String> hasroles, boolean checkAll) {
        //TODO
        return true;
    }

    @Override
    public boolean hasPerms(String[] needperms, Set<String> hasperms, boolean checkAll) {
        if (checkAll) {
            return hasperms.containsAll(Sets.newHashSet(needperms));
        }

        for (String np : needperms) {
            if (hasperms.contains(np)) {
                return true;
            }
        }
        return false;
    }
}
