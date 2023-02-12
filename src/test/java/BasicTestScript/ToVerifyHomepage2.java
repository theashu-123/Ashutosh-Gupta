package BasicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.loginPage;

public class ToVerifyHomepage2 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    driver.get("https://demo.actitime.com/login.do");
    
    loginPage login = new loginPage(driver);
    login.loginaction("admin", "manager");
	}

}
