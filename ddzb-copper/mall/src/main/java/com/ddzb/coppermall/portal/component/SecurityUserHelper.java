package com.ddzb.coppermall.portal.component;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUserHelper {
    /**
     * 获取当前用户
     * @return
     */
    public Authentication getCurrentUserAuthentication(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    /**
     * 获取当前用户
     * @return
     */
    public Object getCurrentPrincipal(){
        return getCurrentUserAuthentication().getPrincipal();
    }

}
