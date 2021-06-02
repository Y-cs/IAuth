package org.iauth.core.pojo;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * @author Y-cs
 * @date 2021/6/1 15:18
 */
@Data
public class Permissions {

    private String qualifiedName;

    private Class<?> clazz;

    private Method method;

}
