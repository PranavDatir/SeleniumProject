package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\OneDrive\\Desktop\\CDAC\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement userID  = driver.findElement(By.id("ap_email"));
		userID.sendKeys("7057625212");
		
		WebElement contButton  = driver.findElement(By.id("continue"));
		contButton.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("9922902162");
		
		WebElement inButton  = driver.findElement(By.id("signInSubmit"));
		inButton.click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		WebElement contButton1  = driver.findElement(By.id("continue"));
//		contButton1.click();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\prana\\OneDrive\\Desktop\\CDAC\\EdgeDriver\\msedgedriver.exe");
//		WebDriver driver_edge = new EdgeDriver();
//		driver_edge.get("https://www.amazon.in//");
	}

}
