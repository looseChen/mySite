package com.looseChen.utils;

import java.util.Map;

/**
* @CreateDate:     2018/10/4 18:36
* @Description:
*/
public class MapUtils {

    public static <K, V> boolean isEmpty(Map<K, V> map) {

        return map == null || map.isEmpty();
    }

}
