package com.looseChen.utils;

import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;

/**
* @CreateDate:     2018/10/4 18:36
* @Description:     list工具类
*/
public class CollectionUtils {

    /**
    * @CreateDate:     2018/10/4 18:53
    * @Description:    返回第一个不为null的元素
    */
    public static <T> T takeFirstNotNullElement(List<T> list) {
        if (list == null) {
            return null;
        }
        for (T bean : list) {
            if (bean != null) {
                return bean;
            }
        }
        return null;
    }

    public static <E> boolean isEmpty(Collection<E> col) {
        return col == null || col.isEmpty();
    }

    /**
    * @CreateDate:     2018/10/4 18:54
    * @Description:    反转list
    */
    public static <E> void reverse(List<E> list) {
        Blank.isNull(list, "list为null");
        for (int start = 0, end = list.size() - 1; start < end; start++, end--) {
            E temp = list.get(end);
            list.set(end, list.get(start));
            list.set(start, temp);
        }
    }

    public static <E> void addAll(Collection<E> collection, Enumeration<E> enumeration) {
        while (enumeration.hasMoreElements()) {
            collection.add(enumeration.nextElement());
        }
    }

    /*public static <E> void sort(List<E> list, boolean isAsc, String... properties) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        Object[] array = list.toArray();
        ArrayUtils.sort(array, isAsc, properties);
        ListIterator<E> li = list.listIterator();
        for (Object e : array) {
            li.next();
            li.set((E) e);
        }
    }*/

}
