package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LocatorsSelenium8 {

	public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
driver.findElement(By.id("confirmButton")).click();
	Alert al = driver.switchTo().alert();
	al.accept();
	driver.findElement(By.id("promtButton")).click();
	al.sendKeys("hguy");
	al.accept();
	driver.findElement(By.id("confirmButton")).click();
	al.dismiss();
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(6000);
	al=driver.switchTo().alert();
	al.accept();
	//driver.findElement(By.xpath("//div[@class='header-text']")).click();
	}
    }

//driver.close();
	


