package testprocess;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ecommerselivesectionthree {



		public static void main(String[] args) throws InterruptedException {
			
			

			        // Initialize ChromeDriver
			        WebDriver driver = new ChromeDriver();
			        

			        
			        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

			        // Navigate to the BMI calculator website
			        driver.get("https://magento.softwaretestingboard.com/");
			        
			        Thread.sleep(300);
			        
			        driver.manage().window().maximize();

			        Thread.sleep(300);
			   
			        WebElement Button = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
			        
			        Button.click();
			        
			        Thread.sleep(300);
			        
			        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
			        
			    
			        Username.sendKeys("test2431@gmail.com");
			        
			        Thread.sleep(300);
			        
			        WebElement Password  = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));
			        
			        
			        Password.sendKeys("Qwert@2431");
			        
			        Thread.sleep(300);
			        
			        
			        
			        

			        
			        WebElement newWindowButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
			        newWindowButton.click();
			        
			        Thread.sleep(400);
			        
			        
			        
			        
			        
			        driver.get("https://magento.softwaretestingboard.com/women.html");
			        
			        Thread.sleep(1000);
			        
			        
			        WebElement productorder = driver.findElement(By.xpath("//a[normalize-space()='Radiant Tee']"));
			        
			        
			        productorder.click();
			        
			        Thread.sleep(1000);
			        
			        WebElement productcart = driver.findElement(By.id("product-addtocart-button"));
			        
			        
			        productcart.click();
			        
			        Thread.sleep(1000);
			        
			        WebElement productsize = driver.findElement(By.id("option-label-size-143-item-167"));
			        
			        
			        productsize.click();
			        
			        Thread.sleep(1000);
			        
			        
			        WebElement productcolour = driver.findElement(By.id("option-label-color-93-item-50"));
			        
			        
			        productcolour.click();
			        
			        Thread.sleep(400);
			        
			        WebElement movetocheckout = driver.findElement(By.id("product-addtocart-button"));
			        
			        
			        movetocheckout.click();
			        
			        Thread.sleep(500);
			        
			        WebElement checkout = driver.findElement(By.xpath("//a[@class='action showcart']"));
			        
			        
			        checkout.click();
			        
			        
			        Thread.sleep(500);
			       
			        
			      
			        
			        WebElement proceedcheckout = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
			        
			        
			        proceedcheckout.click();
			        
			        System.out.println(driver.getCurrentUrl());

			        
			        
			        Thread.sleep(500);
			        
			        

					 WebElement shipmentbtn = driver.findElement(By.xpath("//input[@name='ko_unique_1']"));
				        
					  Thread.sleep(300);
					  
				        if (!shipmentbtn.isSelected()) {
				            // Click on the radio button to select it
				        	shipmentbtn.click();
				        }
				        
				        Thread.sleep(300);
				        
				       
				        
				        Thread.sleep(300);
				        
				        
				        WebElement nextbuton = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
				        
				        nextbuton.click();
				        
				        
				        Thread.sleep(400);
			        
			        
				        System.out.println(driver.getCurrentUrl());
				        
				        /*
				        
				        
			        String parentwindowid=driver.getWindowHandle();
			        
			        
					
					Set<String> set = driver.getWindowHandles();
					
					
					Iterator<String> itr=set.iterator();
					
					while (itr.hasNext())
						
					{
						
						String childwindow=itr.next();
					
						if (!parentwindowid.equals(childwindow))
							
						{
							
							driver.switchTo().window(childwindow);
							
							System.out.println(driver.getCurrentUrl());
								
							
						}
		// TODO Auto-generated method stub
						
						
						*/

	

}
		
}
