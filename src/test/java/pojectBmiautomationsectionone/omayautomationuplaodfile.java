package pojectBmiautomationsectionone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayautomationuplaodfile {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
	      WebDriver driver = new ChromeDriver();
	      
	      
	        
	      //WebDriver driver=new FirefoxDriver();

	        
	      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

	        // Navigate to the BMI calculator website
	        driver.get("https://omayo.blogspot.com/");
	        
	        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	     
	        driver.manage().window().maximize();

	        Thread.sleep(500);
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down the page by 500 pixels vertically
	        js.executeScript("window.scrollBy(0,1500)");
	        
	       // WebElement uploadfile = driver.findElement(By.xpath("//input[@id='uploadfile']"));
	        
	        
	       // uploadfile.sendKeys("C:\\Users\\ADMIN\\Documents\\SampleJPGImage_10mbmb");
	        
	        driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\ADMIN\\Documents\\SampleJPGImage_10mbmb.jpg");
	        
	        
		    
			
		
	}

}
