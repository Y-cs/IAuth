package org.iauth.core.mapper;

import org.iauth.core.pojo.ApproveInfo;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Y-cs
 * @date 2021/6/1 16:36
 */
public class IdentityMapper<A extends ApproveInfo> {

    private final Map<String, A> mapping = new ConcurrentHashMap<>();

    private IdentityMapper() {
    }

    private static class AuthenticationMappingManagerInstance {
        private static IdentityMapper instance = new IdentityMapper();
    }

    public static IdentityMapper getInstance() {
        return AuthenticationMappingManagerInstance.instance;
    }

    public String register(A info) {
        Objects.requireNonNull(info, "register info non null");
        String id = this.getId();
        mapping.put(id, info);
        info.setAuthMappingId(id);
        return id;
    }

    public A getInfo(String id) {
        return mapping.get(id);
    }

    private String getId() {
        return UUID.randomUUID().toString();
    }

}
