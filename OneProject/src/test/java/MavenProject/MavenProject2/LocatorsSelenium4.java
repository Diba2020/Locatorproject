package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsSelenium4 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://classic.freecrm.com/index.html");
	driver.manage().window().maximize();

driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
//driver.findElement(By.linkText("Sign Up")).click();
List<WebElement> ls = driver.findElements(By.tagName("a"));
int sz =ls.size();
for(int i=0; i<sz;i++) {
	System.out.print((i+1)+" ");
	System.out.println(ls.get(i).getText());
	
}
		}
		
	
	
}
    



	


