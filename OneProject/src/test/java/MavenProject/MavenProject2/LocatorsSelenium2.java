package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsSelenium2 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.yahoo.com/");
	driver.get("https://www.mycontactform.com/samples.php");
	driver.manage().window().maximize();

	
	List< WebElement> links =  driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
	System.out.println("total number of links: "+links.size());
	for (int i = 1; i < links.size(); i++) {
		List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li/a"));
	     for (int j = 1; j <= links2.size(); j++) {
			driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
		System.out.println("Section: "+i+" Element:"+j+"."+driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).getText());
		}
		
	}
	
}
    }



	


