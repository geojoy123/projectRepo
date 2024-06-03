package testprocess;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class magentotest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://magento.softwaretestingboard.com/");
	        
		 	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	        
	        driver.manage().window().maximize();

	        Thread.sleep(500);
	   
	        WebElement Button = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
	        
	        Button.click();
	        
	        Thread.sleep(500);
	        
	        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	        
	    
	        Username.sendKeys("test2431@gmail.com");
	        
	        Thread.sleep(500);
	        
	        WebElement Password  = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));
	        
	        
	        Password.sendKeys("Qwert@2431");
	        
	        Thread.sleep(500);
	        
	        
	        
	  

	        
	        WebElement newWindowButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
	        newWindowButton.click();
	        
	        Thread.sleep(1000);
	        
	        
	        driver.get("https://magento.softwaretestingboard.com/women.html");
	        
	        Thread.sleep(1000);
	        
	        WebElement productorder = driver.findElement(By.xpath("//a[normalize-space()='Radiant Tee']"));
	        
	        Thread.sleep(600);
	        
	        
	        productorder.click();
	        
	        WebElement productcart = driver.findElement(By.id("product-addtocart-button"));
	                
	        
	        
	        productcart.click();
	        
	        Thread.sleep(700);
	        
	        WebElement productsize = driver.findElement(By.id("option-label-size-143-item-167"));
	        
	        
	        productsize.click();
	        
	        Thread.sleep(700);
	        
	        
	        WebElement productcolour = driver.findElement(By.id("option-label-color-93-item-50"));
	        
	        
	        productcolour.click();
	        
	        Thread.sleep(700);
	        
	        WebElement movetocheckout = driver.findElement(By.id("product-addtocart-button"));
	        
	        
	        movetocheckout.click();
	        
	        Thread.sleep(1000);
	        
	        WebElement checkout = driver.findElement(By.xpath("//a[@class='action showcart']"));
	        
	        
	        checkout.click();
	        
	        Thread.sleep(1000);
	        
	  
	        

	    
	        
	        WebElement proceedcheckout = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
		       
		       
	        proceedcheckout.click();
	        
	        Thread.sleep(1000);
	        
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        

		       
	        for (String windowHandle : allWindowHandles) {
	            if (!windowHandle.equals(driver.getWindowHandle())) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	        
	        String url= driver.getCurrentUrl();
	        
	        System.out.println(url);
	        
	        Thread.sleep(400);
	        
	     
	   	 
			 WebElement shipmentbtn = driver.findElement(By.xpath("//input[@name='ko_unique_1']"));//input[@name='ko_unique_1']
		        
			
			  
		        if (!shipmentbtn.isSelected()) {
		            // Click on the radio button to select it
		        	shipmentbtn.click();
		        }
		        
		        Thread.sleep(300);
		        
		        WebElement nextbuton = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		        
		        nextbuton.click();
		        
		        String url1= driver.getCurrentUrl();
		        
		        System.out.println(url1);
		        
		        
		        
	}

}
