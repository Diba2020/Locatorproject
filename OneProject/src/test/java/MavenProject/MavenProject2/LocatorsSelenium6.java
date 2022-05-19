package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LocatorsSelenium6 {

	public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.yahoo.com/");
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.linkText("Droppable")).click();
WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);

WebElement drag = driver.findElement(By.id("draggable"));
WebElement drop = driver.findElement(By.id("droppable"));
Actions a= new Actions(driver);
a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();

	}
    }


//driver.close();
	


