package com.papa.papa.client;

import com.papa.papa.PapaApplication;
import com.papa.papa.pa.core.HttpRequestWapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author luyi
 * @create 2019/5/14 0014 下午 2:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PapaApplication.class)
public class HttpClientTest {

    @Autowired
    private HttpRequestWapper httpRequestWapper;

    @Test
    public void test(){
        Map<String, String> params = new HashMap<>();
        params.put("method", "toRzInfo");
        params.put("csrftoken", "d239be93ddc8cf4017005aca2e943586");
        params.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
        params.put("Cookie", "pgv_pvi=5060314112; pgv_si=s2584801280; session-cookie=48249391; ftzjjszgovcn=0; Hm_lvt_ddaf92bcdd865fd907acdaba0285f9b1=1556093098,1556094901,1557802837,1557804765; Hm_lpvt_ddaf92bcdd865fd907acdaba0285f9b1=1557804765; JSESSIONID=XLi1BGQisliDApYWWa7Nl8hV3_Z2r9HfkM5erC5rXncp-zq4ogo5!-802797675");
        String response = httpRequestWapper.executeForZHUJIANJU(params);
        Document document = Jsoup.parse(response);
        Elements label_1 = document.getElementsByClass("label_1");
        String s_lable_1 = label_1.toString();
        if(s_lable_1.contains("当前时段没有有效认租批次")){
            System.out.println("==================== 当前时段没有有效认租批次 ==========================");
        }
    }
}
