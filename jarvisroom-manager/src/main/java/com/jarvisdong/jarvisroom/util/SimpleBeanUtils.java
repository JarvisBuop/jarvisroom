package com.jarvisdong.jarvisroom.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class SimpleBeanUtils {

    /**
     *
     * @param clazz vo的class对象;
     * @param entitys po的结果列表;
     * @param <E> po的类型
     * @param <R> vo的类型;
     * @return
     */
    public static <E, R> List<R> copyBean(Class<R> clazz, List<E> entitys) {
        List<R> resultList = new ArrayList();
        for (E entity : entitys) {
            try {
                R instance = clazz.newInstance();
                BeanUtils.copyProperties(entity, instance);
                resultList.add(instance);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return resultList;
    }
}
