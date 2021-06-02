package org.iauth.core.handle;

import org.iauth.core.context.AuthContext;
import org.iauth.core.pojo.ApproveInfo;
import org.iauth.core.pojo.Token;
import org.iauth.core.support.ApproveSupport;

/**
 * @author Y-cs
 * @date 2021/6/1 14:51
 */
public class AuthHandle<A extends ApproveInfo, T> {

    private final AuthContext authContext;
    private final ApproveSupport<A> approveSupport;
    private final TokenIssueHandle tokenIssue;

    public AuthHandle(AuthContext authContext) {
        this.authContext = authContext;
        approveSupport = this.authContext.getApproveSupport();
        tokenIssue = this.authContext.getTokenIssue();
    }

    /**
     * 添加一个认证
     * @param info
     * @return
     */
    public T add(A info) {
        boolean approve = this.approveSupport.approveRegister(info);
        if (approve) {
            Token token = this.tokenIssue.getToken(info.getAuthMappingId());
            return (T) token.getToken();
        }
        return null;
    }

    /**
     * 移除一个认证
     * @param info
     */
    public void remove(A info) {

    }


}
