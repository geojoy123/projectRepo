package pojectBmiautomationsectionone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newaccountorderplaced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//start chromebrowser
		
		   // Initialize ChromeDriver
	      WebDriver driver = new ChromeDriver();
	      
	      
	        
	      //WebDriver driver=new FirefoxDriver();

	        
	      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

	        // Navigate to the BMI calculator website
	        driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
	        
	        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	     
	        driver.manage().window().maximize();

	        Thread.sleep(500);
	        
	        
	        WebElement email=driver.findElement(By.id("email"));
	        
	        email.sendKeys("test44398@gmail.com");
	        
	        
	        WebElement fname =driver.findElement(By.name("user_fname"));
	        
	        fname.sendKeys("test44398");	        
	        
	        
	        WebElement lname =driver.findElement(By.name("user_lname"));
	        
	              
	        lname.sendKeys("part44398");
	        
	        
	        WebElement password =driver.findElement(By.name("user_password"));
	        
	        password.sendKeys("Qwert@44398");
	        
	        
	        WebElement days = driver.findElement(By.name("day"));
	        
	        Select daypick =new Select(days);
	        
	        daypick.selectByValue("05");
	       
	        
	        WebElement Month = driver.findElement(By.name("month"));
	        
	        Select monthpick =new Select(Month);
	        
	        monthpick.selectByValue("09");
	       
	        
	        WebElement Year = driver.findElement(By.name("year"));
	        
	        Select Yearpick =new Select(Year);
	        
	        Yearpick.selectByValue("1976");
	        
	        WebElement Phonenumber = driver.findElement(By.name("user_telephone"));
	        
	        Phonenumber.sendKeys("+447956663784");
	        
	        Thread.sleep(1000);
	        

		      JavascriptExecutor jscript = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript.executeScript("window.scrollBy(0, 800)");
		      
		      Thread.sleep(1300);
		      
	        
	        WebElement manualaddress = driver.findElement(By.xpath("//a[normalize-space()='Enter my address manually']"));
	        
	        manualaddress.click();
	        
	        Thread.sleep(1000);
	        
	        
	        WebElement Addressone = driver.findElement(By.name("address1"));
	        
	        Addressone.sendKeys("49 St James Boulevard");
	        
	        WebElement City = driver.findElement(By.name("city"));
	        
	        City.sendKeys("Marham");
	        
	        WebElement Postcode = driver.findElement(By.name("postcode"));
	        
	        
	        Postcode.sendKeys("PE33 2WU");
	        
	        
	        WebElement Conutry = driver.findElement(By.name("county"));
	        
	        Conutry.sendKeys("UK");
	        
	        
	        WebElement Continuebutton = driver.findElement(By.id("continueprocess"));
	        
	        Continuebutton.click();
	        
	        WebElement uplaodfile = driver.findElement(By.name("documentUploadInput"));
	        
	        uplaodfile.sendKeys("C:\\Users\\ADMIN\\Documents");
	        
	        WebElement comfirmbutton = driver.findElement(By.id("uploadSaveBtn"));
	        
	        comfirmbutton.click();
	        
	        
	        WebElement HEIGHT = driver.findElement(By.id("height"));
	        
	        Select HEIGHTDROPDOWN =new Select(HEIGHT);
	        
	        HEIGHTDROPDOWN.selectByValue("130");
	       
	        
	        WebElement WEIGHT = driver.findElement(By.id("weight"));
	        
	        Select WEIGHTDROPDOWN =new Select(WEIGHT);
	        
	        WEIGHTDROPDOWN.selectByValue("69");
	        
	        WebElement Processedbtn = driver.findElement(By.id("proceedBtn"));
	        
	        Processedbtn.click();
	       
	        
	        
	   
	        
	}

}
