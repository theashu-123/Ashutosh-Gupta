package BasicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.Homepage;
import POMRepo.loginPage;

public class ToVerifyHomepage {

	public static void main(String[] args) {
		 String expectedTitle = "Enter";
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    driver.get("https://demo.actitime.com/login.do");
		    
		    loginPage login = new loginPage(driver);
		    login.loginaction("admin", "manager");
		    WebDriverWait wait = new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.titleContains("Enter"));
		    
		   Homepage home = new Homepage(driver);
		   String actualTitle = home.verifytitle();
		   
		   if(actualTitle.contains(expectedTitle)) {
			   System.out.println("Pass: The title is verified");
		   }
		   else
			   System.out.println("Fail: The title is not verified");
		   home.logoutaction();
		   driver.quit();
		    
	}

}
