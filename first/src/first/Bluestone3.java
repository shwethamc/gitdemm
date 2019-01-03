package first;

    import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.interactions.Actions;
	
	public class Bluestone3 
	{
		public static void main(String[] args) 
		{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='CHAT with our experts !')")).click();
		driver.switchTo().frame("livechat-full-view");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='container_4_4'])")).sendKeys("417414917");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		driver.findElement(By.xpath("//span[@id='message-placeholder']")).sendKeys("how to buy a earing");
		WebElement text=driver.findElement(By.xpath("//span[@class='msg-text"));
		String s1=text.getText();
		System.out.println(s1);
		
		
		}
	}

