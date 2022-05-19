package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsSelenium5 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://sites.google.com/view/nexxlearningpremium");
	driver.manage().window().maximize();

	List<WebElement> ls = driver.findElements(By.tagName("a"));
	int sz=ls.size();
	for(int i=0; i<sz; i++) {
		System.out.print((i+1)+" ");
		System.out.println(ls.get(i).getText());
	}

		}
		
	
	
}
    



	


