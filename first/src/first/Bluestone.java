package first;
//code to check error message is displayed or not
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[contains(text(),'All Jewellery ')]"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Kadas')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@id='grid-view-result'])[1]/ul/li[1]//div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		verifyelement(driver,By.xpath("//div[contains(text(),'* This field is required')]"));
		
		
		driver.findElement(By.xpath("//div[contains(text(),'* This field is required')]"));
		
		
		

	}

	private static void verifyelement(WebDriver driver, By xpath) {
		// TODO Auto-generated method stub
		WebElement element=driver.findElement(xpath);
		if(element.isDisplayed())
		{
			System.out.println("Pass");
			System.out.println("hello");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	

}
