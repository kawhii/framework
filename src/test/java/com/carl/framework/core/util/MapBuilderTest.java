package com.carl.framework.core.util;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Create by Administrator on 2016/12/27.
 */
public class MapBuilderTest {
    @org.junit.Test
    public void build() throws Exception {
        MapBuilder<String, Object> map = MapBuilder.<String, Object>build();
        Assert.assertNotNull(map);
    }

    @org.junit.Test
    public void p() throws Exception {
        MapBuilder<String, String> map = MapBuilder.<String, String>build();
        map.p("a", "A");
        map.p("b", "B");
        Assert.assertNotNull(map);
        Assert.assertTrue(map.size() == 3);
        Assert.assertEquals(map.get("a"), "A");
        Assert.assertEquals(map.get("b"), "B");
    }
}