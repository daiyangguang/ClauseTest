package DaDa.ClauseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
	WebDriver driver;
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/suisuiyi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://test4-admin.dadaabc.us/welcome/login");
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		AdminLogin login = new AdminLogin();
		login.initDriver();
	}
}
