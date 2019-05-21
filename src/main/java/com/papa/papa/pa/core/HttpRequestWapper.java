package com.papa.papa.pa.core;

import com.papa.papa.client.ClientService;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * @Author luyi
 * @create 2019/5/14 0014 上午 11:44
 */
@Component
public class HttpRequestWapper{

//    @Autowired
//    private ClientService clientService;


    public String executeForZHUJIANJU(Map<String, String> requestParams){
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = null;
        try {
            URIBuilder builder = new URIBuilder("http://zjj.sz.gov.cn/bzflh/rentAction.do");
            for(Map.Entry<String, String> entry : requestParams.entrySet()){
                if("Cookie".equals(entry.getKey())){
                    continue;
                }
                builder.setParameter(entry.getKey(), entry.getValue());
            }
            HttpGet httpGet = new HttpGet(builder.build());
            Header header = new BasicHeader("Cookie", requestParams.get("Cookie"));
            httpGet.setHeader(header);
            response = client.execute(httpGet);
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            try {
                response.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
