package demo.process;

import org.json.JSONObject;

import com.paic.qhcs.test.HttpRequestUtil;

/*
public class Access_token {
	public String getnum(String id, String secret){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+id+"&secret="+ secret;
		
		

        String res = HttpRequestUtil.(url);
		
	}
}
*/


public class Access_token
{
    public static final String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token";// 获取access
                                                                                            // url
    public static final String APP_ID = "wxa549b28c24cf341e";
    public static final String SECRET = "78d8a8cd7a4fa700142d06b96bf44a37";

    // 获取token
    public static String getToken(String id, String secret) throws Exception
    {
		String turl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+id+"&secret="+ secret;
		String res = HttpRequestUtil.sendJsonWithHttps(turl, "");
		res = (new JSONObject(res)).getString("access_token");
		return res;
		
    }

    public static void main(String[] args) throws Exception
    {
    	String APP_ID = "wxccbe28052cc00d34";
    	String SECRET = "d8ffc6bdb67ec81f0ef6381985d28ab9";
        System.out.println("=========1获取token=========");
        String accessToken = getToken(APP_ID, SECRET);// 获取token
        if (accessToken != null)
            System.out.println(accessToken);
    }

}
