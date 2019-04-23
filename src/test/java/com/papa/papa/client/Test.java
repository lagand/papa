package com.papa.papa.client;

import com.papa.papa.common.util.JsonResponse;
import org.apache.http.client.methods.CloseableHttpResponse;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 4:04
 */
public class Test {

    public static void main(String[] args){

        Client client = new Client();
        JsonResponse visit = client.visit("");
        CloseableHttpResponse response = (CloseableHttpResponse) visit.getObject();
        System.out.println(response.getEntity());
    }
}
