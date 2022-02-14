package project;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class website 
{
  public static WebDriver driver;
  public static Logger Log=Logger.getLogger(website.class);
  
  
  @Test(priority=0)
  public void a() throws IOException 
  {
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 	  
	  FileUtils.copyFile(f, new File("C:\\Users\\Stalin\\eclipse-workspace\\Amazon1\\src\\project\\Screenshots\\list.png"));
	  browser b=PageFactory.initElements(driver, browser.class);
	  b.search_box();
	  b.search1();
	  
  } 
  @Test(priority=1)
  public void b()
  {
	  Log.info("Object getting initiated");
	  browser1 c=PageFactory.initElements(driver, browser1.class);
	  c.browser_2();
	  
	  String win1=driver.getWindowHandle();
	  System.out.println(win1);
	  Set<String> wins=driver.getWindowHandles();
	  wins.remove(win1);
	  
	  String winhandle=wins.iterator().next();
	  if(winhandle != win1)
	  {
		  driver.switchTo().window(winhandle);
	  }
	 
	  c.add1();
  }
  
  @Test(priority=2)
  public void c()
  {
	  Log.info("Object getting initiated");
	  Browser2 bw=PageFactory.initElements(driver, Browser2.class);
	  bw.addto_cart();
	  bw.mail1();
	  
  }
  @Test(priority=3)
  public void d()
  
  {
	Log.info("Object getting initiated");  
	Browser3 ba=PageFactory.initElements(driver, Browser3.class);
	ba.click1();
	ba.password1();
	ba.submit1();
	
  }
  @BeforeClass
  public void beforeClass() throws IOException, InterruptedException 
  {
	  Thread.sleep(5000);
	  PropertyConfigurator.configure("C:\\Users\\Stalin\\eclipse-workspace\\Amazon1\\log4j.properties");
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  Log.info("Object getting initiated");
	  File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 	  
	  FileUtils.copyFile(fi, new File("C:\\Users\\Stalin\\eclipse-workspace\\Amazon1\\src\\project\\Screenshots\\list1.png"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2000)","");
	  
	  
  }
  @AfterClass
  public void afterClass()
  {
	  
  }

}
