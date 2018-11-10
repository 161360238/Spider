package cn.wj.spider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 网络爬虫的原理
 * @author 王杰
 *
 */

public class SpiderTest02 {

	public static void main(String[] args) throws Exception {
		//获取URL
		URL url=new URL("https://www.dianping.com/");
		//下载资源
		HttpURLConnection  conn =(HttpURLConnection) url.openConnection();
		//模拟浏览器请求
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
		BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		String msg=null;
		while(null!=(msg=br.readLine())){
			System.out.println(msg);
		}
		//分析
		//处理
	}

}
