package com.papa.common.util;

import com.papa.common.util.JsonResponse;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 3:56
 */
public class ResponseJsonUtil {

    public static JsonResponse success(Object obj){
        return new JsonResponse(true, obj);
    }

    public static JsonResponse fail(Object obj){
        return new JsonResponse(false, obj);
    }
}
