package Online;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewTest {
	
	@Test (dataProvider ="testdata")
	public void login (String username,String password){
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.tnstc.in/TNSTCOnline/");
        driver.manage().window().maximize();
        
        ((JavascriptExecutor) driver).executeScript("document.getElementByName('txtUserLoginID').value='username'"); 
        driver.findElement(By.name("txtUserLoginID")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]")).click();
		String page = "http://www.tnstc.in/TNSTCOnline/advanceBooking.do";
		String page2=driver.getCurrentUrl();
		
	
		
	Assert.assertTrue(page2.contains(page),"Errro");
	//Actions
		
	//S	Assert.a
	//ssert.assertEquals("http://www.tnstc.in/TNSTCOnline/advanceBooking.do", driver.getCurrentUrl());
		driver.close();
	}
	
	
	
	@DataProvider (name = "testdata")
	public Object[][] readExcel() throws BiffException, IOException{
	//public static void main(String[] args) throws BiffException, IOException{
	  File f = new File("D:/Input.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Sheet1");
	  
	  
	  int rows = s.getRows();
	  int columns = s.getColumns();
	  String InputData[][] = new String[rows][columns];
	  for (int i=0; i<rows;i++){
		  for(int j=0;j<columns;j++){
			  Cell c =s.getCell(j,i);
			  InputData[i][j] = c.getContents();
			  System.out.println(InputData[i][j]);
		  }
	  }
	 return InputData;
	  
  }
}

