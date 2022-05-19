package MavenProject.MavenProject2;

import java.awt.List;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class LocatorsSelenium12 {


	public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();

//List <WebElement > links = driver.findElements(By.tagName("a"));
//for(WebElement ele: links) {
	//url=ele.getAttribute("href");
	
}

//driver.close();
	


}
