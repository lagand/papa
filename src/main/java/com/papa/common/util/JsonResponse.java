package com.papa.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 3:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResponse<T> {

    public Boolean isOk;

    private T object;
}
