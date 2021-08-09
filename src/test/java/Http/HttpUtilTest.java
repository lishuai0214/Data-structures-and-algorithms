package Http;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import org.junit.Test;

import java.util.HashMap;

public class HttpUtilTest {
    @Test
    public void httpRequest(){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("list", "sz002307");
        String result1= HttpUtil.get("http://hq.sinajs.cn", paramMap);
        System.out.println(result1);
    }

    @Test
    public void httpJsonRequest(){
        String result= HttpUtil.get("http://img1.money.126.net/data/hs/time/today/1399001.json");
        System.out.println(result);
        String jsonResult = JSONUtil.toJsonPrettyStr(result);
        System.out.println(jsonResult);
    }
}
