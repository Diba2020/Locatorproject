package MavenProject.MavenProject2;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class LocatorsSelenium10 {

	static WebDriver driver;
	public static void main(String[] args) throws IOException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
    
    WebElement element = driver.findElement(By.className("product-image"));
    WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    Actions act =new Actions(driver);
    act.moveToElement(ele).perform();
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    takeScreenshot("amazon_search");
	}
	public static void takeScreenshot(String fileName) throws IOException {
		File file  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\SeleniumProject\\MavenProject2\\Screenshot"+"/src/main/java/MavenProject2"+fileName+".jpg"));
	}
    }

//driver.close();
	


