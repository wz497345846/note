/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.commons;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author: JonyChen  Date: 2017/12/12
 */
public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * java对象转换json
     */
    public static String objectToJson(Object obj) {
        try {
            String json = MAPPER.writeValueAsString(obj);
            return json;
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json -- Object
     */
    public static <T> T jsonToObject(String json, Class<T> type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 带list的json转换
     */
    public static <T> List<T> jsonToList(String json, Class<T> type) {
        try {
            JavaType javatype = MAPPER.getTypeFactory().constructParametricType(List.class, type);
            return MAPPER.readValue(json, javatype);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
