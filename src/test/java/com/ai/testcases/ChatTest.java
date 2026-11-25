package com.ai.testcases;

import com.ai.utils.RequestUtil;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ChatTest {

    @DataProvider(name = "queryData")
    public Object[][] queryData() {
        return new Object[][] {
                {"你好，你是谁", "user_001"},
                {"帮我查一下天气", "user_002"}
        };
    }

    @Test(dataProvider = "queryData", description = "测试AI对话接口")
    public void testChatQuery(String query, String userId) {
        Map<String, String> payload = new HashMap<>();
        payload.put("query", query);
        payload.put("user_id", userId);

        io.restassured.response.Response response = RequestUtil.post("/post", payload);

        Assert.assertEquals(response.getStatusCode(), 200, "HTTP状态码异常");

        String echoQuery = response.jsonPath().getString("json.query");
        Assert.assertEquals(echoQuery, query, "接口回显的query与请求不一致");

        System.out.println("用例通过！提问内容: " + query);
    }
}