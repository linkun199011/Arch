package com.arch.util;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class JsonUtilTest extends TestCase {
    public void testToJson() {
        Map<String, String> tmpMap = new HashMap<>();
        tmpMap.put("key1", "value1");
        tmpMap.put("key2", "value2");
        String result = JSONUtil.toJson(tmpMap);

        System.out.println(result);

    }

}
