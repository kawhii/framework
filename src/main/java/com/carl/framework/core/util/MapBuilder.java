package com.carl.framework.core.util;

import java.util.HashMap;

/**
 * @author Carl
 * @date 2016/12/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
public class MapBuilder<K, V> extends HashMap<K, V> {
    private MapBuilder() {
    }

    public static <K, V> MapBuilder<K, V> build() {
        return new MapBuilder<K, V>();
    }

    public MapBuilder<K, V> p(K k, V v) {
        super.put(k, v);
        return this;
    }
}
