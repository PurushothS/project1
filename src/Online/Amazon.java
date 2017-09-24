package Online;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Amazon {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in/");
        driver.manage().window().maximize();
      //*[@id="l8fnraer4u45qxxq3xhx8byb"]/div/div/span/a/img
      //*[@id="gw-desktop-herotator"]
        WebElement page = driver.findElement(By.id("//*[@id='unrec-pageContent]"));
       
      /*  JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      //  js.executeScript("document.getElementByID('twotabsearchtextbox').value='LED TV'");
		*/
        
        
        Screenshot screenshot = new AShot().takeScreenshot(driver, page);
        try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("D:/eclipse/Project/Amazon.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}	
