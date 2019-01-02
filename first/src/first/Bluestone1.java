package first;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	
	WebElement alljew=driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(alljew).perform();
	driver.findElement(By.xpath("//a[text()='Kadas']")).click();
	
	WebElement kada=driver.findElement(By.id("pid_8994"));
	kada.click();
	
	driver.findElement(By.xpath("(//input[@name='Submit'])[1]")).click();
	WebElement ms=driver.findElement(By.xpath("//div[text()='* This field is required']"));
	String amsg=ms.getText();
    String emsg="This field is required";
    if(amsg.contains(emsg))
    {
    	System.out.println("Message is 'This field is required'");
    	TakesScreenshot t1=(TakesScreenshot)driver;
    	File src=t1.getScreenshotAs(OutputType.FILE);
    	File des=new File("./screenshot01.png");
    	try
    	{
			FileUtils.copyFile(src, des);
		}
    	catch (IOException e) 
    	{
			
		}
    }
    else
    {
    	System.out.println("Message not displayed");
    }
    driver.close();	
}
}
