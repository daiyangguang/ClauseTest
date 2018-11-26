package DaDa.ClauseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
public class AdminLogin {
	WebDriver driver;
	int verify;
	public void initDriver() {
		//mac版本环境变量配置
//		System.setProperty("webdriver.chrome.driver","/Users/suisuiyi/Downloads/chromedriver");
		//windows环境变量配置
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
	}
	public void plantCookies() {
		
	}
	
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		AdminLogin login = new AdminLogin();
		login.initDriver();
		
	}

}
