package Online;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Ashotverfiy {
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
	public void logoVal() throws IOException{
		BufferedImage expectedImage=ImageIO.read(new File("D:/eclipse/Project/savarilogo.png"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement logo = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a/img"));
		Screenshot screenshot = new AShot().takeScreenshot(driver, logo);
		BufferedImage actualImage =screenshot.getImage();
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff =imgdiff.makeDiff(expectedImage, actualImage);
		System.out.println(diff.hasDiff());
		//System.out.println(diff.hashCode());
		Assert.assertFalse(diff.hasDiff(), "Images are same");
	}
	
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
}
