package testprocess;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerselivesectiontwo {

		
	
		

			private static Timeouts implicitlyWait;

			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException 
				
			{
				
					
				        // Initialize ChromeDriver
				        WebDriver driver = new ChromeDriver();
				        
				        

				        
				        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

				        
				        
				        // Navigate to the BMI calculator website
				        driver.get("https://magento.softwaretestingboard.com/");
				        
				        implicitlyWait = driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				        
				        Thread.sleep(800);
				        
				        driver.manage().window().maximize();

				        Thread.sleep(800);
				   
				        WebElement Button = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
				        
				        Button.click();
				        
				        Thread.sleep(800);
				        
				        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
				        
				    
				        Username.sendKeys("test2431@gmail.com");
				        
				        Thread.sleep(800);
				        
				        WebElement Password  = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));
				        
				        
				        Password.sendKeys("Qwert@2431");
				        
				        Thread.sleep(800);
				        
				        
				        
				        

				        
				        WebElement newWindowButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
				        newWindowButton.click();
				        
				        Thread.sleep(800);
				        
				        
				        
				        
				        /* Switch to the new window
				        
				        Set<String> allWindowHandles = driver.getWindowHandles();
				        

				       
				        for (String windowHandle : allWindowHandles) {
				            if (!windowHandle.equals(driver.getWindowHandle())) {
				                driver.switchTo().window(windowHandle);
				                break;
				            }
				        }
				        
				        Thread.sleep(400);
				        
				        */
				        
				        
				       
				        
				        
				        driver.get("https://magento.softwaretestingboard.com/women.html");
				        
				        WebElement productorder = driver.findElement(By.xpath("//a[normalize-space()='Radiant Tee']"));
				        
				        
				        productorder.click();
				        
				        Thread.sleep(800);
				        
				        WebElement productcart = driver.findElement(By.id("product-addtocart-button"));
				        
				        
				        productcart.click();
				        
				        Thread.sleep(800);
				        
				        WebElement productsize = driver.findElement(By.id("option-label-size-143-item-167"));
				        
				        
				        productsize.click();
				        
				        Thread.sleep(800);
				        
				        WebElement productcolour = driver.findElement(By.id("option-label-color-93-item-50"));
				        
				        
				        productcolour.click();
				        
				        Thread.sleep(800);
				        
				        WebElement movetocheckout = driver.findElement(By.id("product-addtocart-button"));
				        
				        
				        movetocheckout.click();
				        
				        Thread.sleep(800);
				        
				        WebElement checkout = driver.findElement(By.xpath("//a[@class='action showcart']"));
				        
				        
				        checkout.click();
				        
				        Thread.sleep(800);
				        
				    
				        
				  
				    	/*
				        String mainWindowHandle = driver.getWindowHandle();
				        
				       
						Set<String> windowHandles = driver.getWindowHandles();
				        
						
					
						Switch to the pop-up window
						
						
						
						*/
				        
				
				        Thread.sleep(800);
				        
				        WebElement proceedcheckout = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
				       
				       
				        proceedcheckout.click();
				        
				        
				       				        
				        
				        Thread.sleep(800);
				        
				        String mainWindowHandle = driver.getWindowHandle();
				        
				        Set<String> allWindowHandles = driver.getWindowHandles();

				        // Switch to the new window
				        for (String handle : allWindowHandles) {
				            if (!handle.equals(mainWindowHandle)) {
				                driver.switchTo().window(handle);
				                break;
				            }
				        }
				        
				       
				        
				        Thread.sleep(800);
				        

				        String url1=driver.getCurrentUrl();
				        
				        System.out.println(url1);
				  
				        Thread.sleep(800);
				        
				        driver.switchTo().activeElement();
				        
				        Thread.sleep(800);
				        
				        
				        WebElement shipmentbtn = driver.findElement(By.xpath("//input[@name='ko_unique_1']"));


						// WebElement shipmentbtn = driver.findElement(By.xpath("//input[@name='ko_unique_1']"));
					        
						 Thread.sleep(800);
						  
					        if (!shipmentbtn.isSelected()) {
					            // Click on the radio button to select it
					       	shipmentbtn.click();
					   
					        }
					        
					        
					        Thread.sleep(800);
					        
					        
					        
					        WebElement nextbutton = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
					   
					     
					        nextbutton.click();
						       
					        					      
					      					        
					        Thread.sleep(800);
						       
					        

					        // Switch to the new window
					        for (String handle : allWindowHandles) {
					            if (!handle.equals(mainWindowHandle)) {
					                driver.switchTo().window(handle);
					                break;
					            }
					        }
					        

					        
					        Thread.sleep(800);
					       
						       String url2=driver.getCurrentUrl();
						       
						       Thread.sleep(800);
						        
						        System.out.println(url2);
						        
						        Thread.sleep(800);
												        
									       
						     driver.switchTo().activeElement();
						     
						     Thread.sleep(800);
						     
						     
					        
					       WebElement placedorder = driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
					        
					       placedorder.click();
					       
					       Thread.sleep(800);
					       
					       for (String handle : allWindowHandles) {
					            if (!handle.equals(mainWindowHandle)) {
					                driver.switchTo().window(handle);
					                break;
					            }
					        }
					        
					       
					       Thread.sleep(800);
					       
					       String currenturl=driver.getCurrentUrl();
					       
					       Thread.sleep(800);
					        
					        System.out.println(currenturl);
					        
					        Thread.sleep(800);
					 
				     
			
					        
					     WebElement continuebuttn =driver.findElement(By.xpath("//span[normalize-space()='Continue Shopping']")) ;
					     
					     continuebuttn.click();


					     
					       Thread.sleep(800);
					       
					       for (String handle : allWindowHandles) {
					            if (!handle.equals(mainWindowHandle)) {
					                driver.switchTo().window(handle);
					                break;
					            }
					        }
					        
					       
					       Thread.sleep(800);
					       
					       String currenturl4=driver.getCurrentUrl();
					       
					       Thread.sleep(800);
					        
					        System.out.println(currenturl4);
					        
					        Thread.sleep(800);
					     
			}		      

	}





