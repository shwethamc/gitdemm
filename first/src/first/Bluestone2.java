package first;

import java.awt.List;
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
import org.openqa.selenium.support.ui.Select;

public class Bluestone2 
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
		
		WebElement list=driver.findElement(By.xpath("//select[@id='ringselect']"));
		Select sel=new Select(list);
		sel.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		
		WebElement si=driver.findElement(By.xpath("//div[text()='Size']/../div[2]"));	
		String asi=si.getText();
	    String esi=": 2-2(2 2/16";
	    if(asi.contains(esi))
	    {
	    	System.out.println("selected kada size is proper");
	    	TakesScreenshot t1=(TakesScreenshot)driver;
	    	File src=t1.getScreenshotAs(OutputType.FILE);
	    	File des=new File("./screenshot1.png");
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
	    	System.out.println("selected kada size is not proper");
	    }
	    driver.close();

	}
}
