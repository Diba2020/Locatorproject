package MavenProject.MavenProject2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LocatorsSelenium {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.yahoo.com/");
	driver.get("https://www.mycontactform.com/samples.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(2000)	;
//WebElement btn= driver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[3]/div/div[3]/div[1]/div/a"));
//btn.click();
//driver.findElement(By.id("login-username")).sendKeys("Diba.rokshana@yahoo.com");
//Thread.sleep(2000);
//driver.findElement(By.name("signin")).click();
//Thread.sleep(2000);
//driver.findElement(By.id("login-passwd")).sendKeys("Diba@1234");
//driver.findElement(By.id("password-toggle-button")).click();
//driver.findElement(By.id("login-signin")).click();
driver.findElement(By.id("subject")).sendKeys("Rokshana Yeasmin");
driver.findElement(By.name("q1")).sendKeys("Diba");
driver.findElement(By.xpath("//input[@value=1]")).click();
driver.findElement(By.linkText("Basic Contact Form")).click();
driver.findElement(By.linkText("Detailed Contact Form")).click();
driver.findElement(By.linkText("Simple Web Feedback")).click();
Thread.sleep(2000);
List< WebElement> links = driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
System.out.println("total number of links: "+links.size());



for (int i = 1; i < links.size(); i++) {
	List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li/a"));
     for (int j = 1; j <= links2.size(); j++) {
		driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
	System.out.println("Section: "+i+" Element:"+j+"."+driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).getText());
	
/*WebElement day =driver.findElement(By.id("day"));
WebElement month = driver.findElement(By.id("month"));
WebElement year = driver.findElement(By.id("year"));

Select select = new Select(day);
select.selectByVisibleText("10");

Select select1 = new Select(month);
select1.selectByVisibleText("May");

Select select2 = new Select(year);
select2.selectByVisibleText("1990")*/
	}
	
}
    }


//driver.close();
	}


