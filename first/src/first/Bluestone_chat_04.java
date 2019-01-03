package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_chat_04 {
	static   
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("livechat-compact-view");
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='open-icon']")));
		WebElement element=driver.findElement(By.xpath("//*[@id='open-icon']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		driver.findElement(By.id("name")).sendKeys("Ranju");;
		driver.findElement(By.id("email")).sendKeys("Ranju9538@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("8892860441");
		driver.findElement(By.xpath("//div[@id='container_10']")).click();
		Thread.sleep(2000);
		

	}

}
