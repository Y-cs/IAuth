package org.iauth.core.context;

import lombok.Data;
import org.iauth.core.config.Configuration;
import org.iauth.core.handle.TokenIssueHandle;
import org.iauth.core.support.ApproveSupport;

/**
 * @author Y-cs
 * @date 2021/6/1 14:52
 */
@Data
public final class AuthContext {

    private boolean isOK;
    private Configuration CONFIGURATION;

    private ApproveSupport approveSupport;

    private TokenIssueHandle tokenIssue;


}
