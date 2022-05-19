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


public class LocatorsSelenium9 {

	public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.findElement(By.id("windowButton")).click();
	Set<String> windows =driver.getWindowHandles();
	System.out.println("No of windows: "+windows.size());
	
	List<String> windowslist= new ArrayList<String>(windows);
	
	String windows1 =windowslist.get(0);
	String windows2=windowslist.get(1);
	
	driver.switchTo().window(windows2);
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	
	driver.switchTo().window(windows1);
	System.out.println(driver.findElement(By.cssSelector("div.main-header")).getText());

	}
    }

//driver.close();
	


