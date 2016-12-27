package com.carl.framework.core.util;

import org.junit.Assert.*;

import static org.junit.Assert.*;

/**
 * Create by Administrator on 2016/12/27.
 */
public class MapBuilderTest {
    @org.junit.Test
    public void build() throws Exception {
        MapBuilder<String, Object> map = MapBuilder.build();
        assertNotNull(map);
    }

    @org.junit.Test
    public void p() throws Exception {
        MapBuilder<String, String> map = MapBuilder.build();
        map.p("a", "A");
        map.p("b", "B");
        assertNotNull(map);
        assertTrue(map.size() == 3);
        assertEquals(map.get("a"), "A");
        assertEquals(map.get("b"), "B");
    }
}