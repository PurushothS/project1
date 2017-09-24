package Online;

import com.sun.jna.platform.unix.X11.Screen;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Skuliusage {
	WebDriver driver;
	@BeforeClass
	public void launchApp(){
	System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("http://www.savaari.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void logoVal(){
		WebElement logo = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a/img"));
		Screenshot screenshot = new AShot().takeScreenshot(driver, logo);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("D:/eclipse/Project/savarilogo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
