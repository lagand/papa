package com.papa.papa.client;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 2:26
 */
@Service
public interface ClientService {

        default public CloseableHttpClient getClient(){
                return HttpClients.createDefault();
        }
}
