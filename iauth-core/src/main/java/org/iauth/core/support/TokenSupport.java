package org.iauth.core.support;

import org.iauth.core.pojo.ApproveInfo;
import org.iauth.core.pojo.Token;

/**
 * 令牌服务
 *
 * @author Y-cs
 * @date 2021/5/31 11:08
 */
public interface TokenSupport<T, A extends ApproveInfo> {

    public <A extends ApproveInfo> Token<T> getToken(A info);

}
