package com.looseChen.utils;


import com.looseChen.exception.MyException;

import java.util.Collection;
import java.util.Map;
/**
* @CreateDate:     2018/10/4 18:33
* @Description:    判断是否为空
*/
public class Blank {


    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    public static void isNull(byte[] array, String message) {
        if (ArrayUtils.isEmpty(array)) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    public static void isNull(Object[] array, String message) {
        if (ArrayUtils.isEmpty(array)) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    public static void isNull(Collection<?> collection, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    public static void isNull(Map<?, ?> map, String message) {
        if (MapUtils.isEmpty(map)) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    public static void isBlank(String text, String message) {
        if (StringUtils.isBlank(text)) {
            throw new MyException(message, Constants.NULL_CODE);
        }
    }

    /*public static void isContain(String textToSearch, String substring, String message) {
        if (!textToSearch.contains(substring)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notContain(String textToSearch, String substring, String message) {
        if (textToSearch.contains(substring)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isAssignable(Class<?> superType, Class<?> subType, String message) {
        if (subType == null || !superType.isAssignableFrom(subType)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isInstanceOf(Class<?> type, Object obj, String message) {
        if (obj == null || !type.isInstance(obj)) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void noNullElements(Object[] array, String message) {
        for (Object element : array) {
            if (element == null) {
                throw new IllegalArgumentException(message);
            }
        }
    }*/

}
