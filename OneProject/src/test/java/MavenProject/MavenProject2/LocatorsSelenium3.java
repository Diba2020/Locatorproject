package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsSelenium3 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://jqueryui.com/accordion/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement> ls =driver.findElements(By.tagName("a"));
	int sz =ls.size();
	System.out.println("total number of links" +sz);
	
	for(int i =0;i<sz;i++) {
		System.out.println((i+1)+" ");
		System.out.println(ls.get(i).getText());
	}
	ls.get(2).click();

	  }
  

		}
		
	
	

    



	


