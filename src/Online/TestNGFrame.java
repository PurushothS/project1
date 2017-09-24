package Online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNGFrame {
	
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "E://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver() ;
        driver.get("http://www.tnstc.in/TNSTCOnline/");
		driver.findElement(By.name("txtUserLoginID")).sendKeys("PurushothS");
		driver.findElement(By.name("txtPassword")).sendKeys("XZcgN5Ydk");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]")).click();
		
		
		
		
		
		
	//	Assert.assertEquals("http://www.tnstc.in/TNSTCOnline/advanceBooking.do", driver.getCurrentUrl());
		driver.close();
	}
	
}