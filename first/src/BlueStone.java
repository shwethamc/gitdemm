

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./exeFiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(8000);
		driver.switchTo().frame("livechat-compact-view");
		Thread.sleep(3000);
		driver.findElement(By.id("open-label")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		
		driver.findElement(By.id("name")).sendKeys("Ashish");
		driver.findElement(By.id("email")).sendKeys("ashish.93kumark@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("9910403710");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		
		WebElement Text = driver.findElement(By.xpath("//span[@class='msg-text']"));
		String Strtext = Text.getText();
		System.out.println(Strtext);
	}

}
