package MavenProject.MavenProject2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LocatorsSelenium11 {

	public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.easemytrip.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("FromSector_show")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("spn12")).click();
	driver.findElement(By.id("Editbox13_show")).click();
	driver.findElement(By.id("spn2")).click();
	driver.findElement(By.className("drpNoTrv")).click();
	driver.findElement(By.className("plus_box1")).click();
	driver.findElement(By.className("chk_flt")).click();
	}
    }

//driver.close();
	


