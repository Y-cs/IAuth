package org.iauth.core.support;

import org.iauth.core.mapper.IdentityMapper;
import org.iauth.core.pojo.ApproveInfo;

/**
 * 认证服务
 *
 * @author Y-cs
 * @date 2021/5/31 10:14
 */
public interface ApproveSupport<A extends ApproveInfo> {

    /**
     * approve
     *
     * @param info
     * @return
     */
    public boolean approve(A info);

    /**
     * @param info
     * @return
     */
    default boolean approveRegister(A info) {
        boolean approve = approve(info);
        if (approve) {
            IdentityMapper.getInstance().register(info);
        }
        return approve;
    }

}
