package com.papa.client;

import com.papa.common.util.JsonResponse;
import com.papa.common.util.ResponseJsonUtil;
import com.papa.papa.client.ClientService;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 2:59
 */
public class Client {

    @Autowired
    private ClientService clientService;

    public JsonResponse execute(String url){
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        HttpGet get = new HttpGet("http://zjj.sz.gov.cn/bzflh/rentAction.do");
        HttpRequest request = new HttpGet();
        get.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
        get.setHeader("Cookie", "pgv_pvi=5060314112; session-cookie=46742041; pgv_si=s2584801280; ftzjjszgovcn=0; Hm_lvt_ddaf92bcdd865fd907acdaba0285f9b1=1554885681,1555667729,1555924075,1556002307; Hm_lpvt_ddaf92bcdd865fd907acdaba0285f9b1=1556002307; JSESSIONID=IDhI-C_tEGajpgS8arEBMkRgr7p70WitIrHh8JE2r0_1OxMRiC3s!1393029917");
        try {
            response = client.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseJsonUtil.success(response);
    }
}
