package org.iauth.core.config;

import lombok.Data;
import org.iauth.core.handle.AuthHandle;
import org.iauth.core.support.ApproveSupport;
import org.iauth.core.support.JurisdictionSupport;
import org.iauth.core.support.TokenSupport;

/**
 * @author Y-cs
 * @date 2021/5/31 10:34
 */
@Data
public class Configuration {

    /**
     * 权限管理器
     */
    private AuthHandle authManager;

    /**
     * 认证支持
     */
    private ApproveSupport approveSupport;

    /**
     * 权限分发
     */
    private JurisdictionSupport jurisdictionSupport;

    /**
     * 令牌支持
     */
    private TokenSupport tokenSupport;



}
