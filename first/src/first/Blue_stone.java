package first;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Blue_stone {
	static {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("livechat-compact-view");
		WebElement ele=driver.findElement(By.id("open-label"));
		ele.click();
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("name"));
		act.moveToElement(ele1).sendKeys("anuprakas");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("anuprakash1991@gmail.com");
		
		
		
	}

}

