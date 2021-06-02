package org.iauth.core.pojo;

import lombok.Data;

import java.util.concurrent.TimeUnit;

/**
 * @author Y-cs
 * @date 2021/5/31 11:09
 */
@Data
public class Token<T> {

    private String authMappingId;

    private T token;

    private long timeOut;

    private TimeUnit timeUnit;



}
