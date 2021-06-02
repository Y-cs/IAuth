package org.iauth.core.handle;

import org.iauth.core.mapper.IdentityMapper;
import org.iauth.core.pojo.ApproveInfo;
import org.iauth.core.pojo.Jurisdiction;
import org.iauth.core.pojo.Token;
import org.iauth.core.support.JurisdictionSupport;
import org.iauth.core.support.TokenSupport;

/**
 * @author Y-cs
 * @date 2021/6/1 16:15
 */
public class TokenIssueHandle<T, J extends Jurisdiction, A extends ApproveInfo> {

    /**
     * token权限分发
     */
    private final JurisdictionSupport<J> jurisdictionSupport;
    /**
     * token生成
     */
    private final TokenSupport<T, A> tokenSupport;

    public TokenIssueHandle(JurisdictionSupport<J> jurisdictionSupport, TokenSupport<T, A> tokenSupport) {
        this.jurisdictionSupport = jurisdictionSupport;
        this.tokenSupport = tokenSupport;
    }

    public Token<T> getToken(String mappingKey) {
        ApproveInfo info = IdentityMapper.getInstance().getInfo(mappingKey);
        Token token = tokenSupport.getToken(info);
        token.setAuthMappingId(mappingKey);
        jurisdictionSupport.issue(token);
        return token;
    }


}
