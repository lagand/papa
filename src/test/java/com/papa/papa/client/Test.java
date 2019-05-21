package com.papa.papa.client;

import com.papa.papa.common.util.JsonResponse;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.concurrent.locks.Lock;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 4:04
 */
public class Test {

    public static void main(String[] args){


    }



    private void httpTest(){
        Client client = new Client();
        JsonResponse visit = client.execute("");
        CloseableHttpResponse response = (CloseableHttpResponse) visit.getObject();
        System.out.println(response.getEntity());
    }
}
