package testprocess;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerseproject {

	private static Timeouts implicitlyWait;


	public static void main(String[] args) throws InterruptedException {
		
		

		        // Initialize ChromeDriver
		      WebDriver driver = new ChromeDriver();
		      
		      
		        
		      //WebDriver driver=new FirefoxDriver();

		        
		      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");
		      
		      implicitlyWait = driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);

		        // Navigate to the BMI calculator website
		        driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
		        
		        Thread.sleep(500);
		        
		        driver.manage().window().maximize();

		        Thread.sleep(500);
		   
		        WebElement Button = driver.findElement(By.xpath("//button[normalize-space()='I have an account']"));
		        
		        Button.click();
		        
		        Thread.sleep(500);
		        
		        WebElement Username = driver.findElement(By.name("username"));
		        
		    
		        Username.sendKeys("test3691@gmail.com");
		        
		        Thread.sleep(500);
		        
		        WebElement Password  = driver.findElement(By.name("password"));
		        
		        
		        
		        
		        Password.sendKeys("Qwert@3691");
		        
		        Thread.sleep(500);
		        
		        
		        
		        
		        WebElement newWindowButton = driver.findElement(By.id("send2-login"));
		        
		        newWindowButton.click();
		        
		        
		 
		        Thread.sleep(900);
		        
		    //    driver.navigate().refresh();
		        
		        Thread.sleep(900);
		        
		        String mainWindowHandle = driver.getWindowHandle();
		        
		        Set<String> allWindowHandles = driver.getWindowHandles();

		        // Switch to the new window
		        for (String handle : allWindowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		            }
		        }
		        
		       
		        
		        String url1=driver.getCurrentUrl();
		        
		        System.out.println(url1);
		  
		        Thread.sleep(800);
		        
		        driver.switchTo().activeElement();
		        
		        Thread.sleep(800);
		        
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement hiddenElement = (WebElement) js.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
		        		       
		        
		        try
		        {
		        	
		        WebElement addtreatment= driver.findElement(By.xpath("//a[normalize-space()='I need my treatment sooner']"));
		        
		        System.out.println("Element found!");
		        
		        addtreatment.click();
		        
		        }
		        
		        catch (NoSuchElementException e) {
		        	
   		        	
		            System.out.println("Element not found!");
		        }
		        
		        
		        Thread.sleep(1000);
		        
		        
		        for (String handle : allWindowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		            }
		        }
		        
		        Thread.sleep(1000);
		        
		        WebElement popupelement= driver.findElement(By.name("soon-order"));
		        
		        popupelement.sendKeys("test order");
		        
		        
		        WebElement popupsubmit= driver.findElement(By.id("order_sooner_submit"));
		        
		        popupsubmit.click();
		        
		        Thread.sleep(1200);
		        
		        
		        
		      //a[normalize-space()='I need my treatment sooner']
		        
		        /*
		        try
		        {
		        	
		        
		        WebElement newtreatment= driver.findElement(By.id("orderNextTreatmentBtn"));
		        
		        System.out.println("Element found!");
		        
		        newtreatment.click();
		        } 
		        
		        catch (NoSuchElementException e) {
		        			        	
		        			   		        	
		            System.out.println("Element not found!");
		        }
		        
		        
		        */
		        
		       Thread.sleep(1200);
		        
		      WebElement consulationquetion1 = driver.findElement(By.xpath("//span[@data-bind='css: question.getUncheckedLabelCss(), click: onFalseLabelClick']"));
		      
		      consulationquetion1.click();
		      
		      Thread.sleep(800);
		      
		      
		      WebElement consulationquetion0 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion0.click();
		      

		      Thread.sleep(800);
		      
		      
		      WebElement consulationquetiondata1= driver.findElement(By.xpath("//textarea[@id='sq_113i']"));
		      
		      consulationquetiondata1.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
		      
		      
		      Thread.sleep(800);
		      
		      
		      WebElement consulationquetion2 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion2.click();
		      
		      Thread.sleep(800);
		      
		      
		      WebElement consulationquetion3 =driver.findElement(By.xpath("//p[normalize-space()='Yes- very reduced appetite']"));
		      
		      consulationquetion3.click();
		      
		      Thread.sleep(800);
		      
		      WebElement consulationquetion4 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion4.click();
		      
		      Thread.sleep(800);
		      
		      WebElement consulationquetion5 =driver.findElement(By.xpath("//p[normalize-space()='No- None so far']"));
		      
		      consulationquetion5.click();
		      
		      Thread.sleep(800);
		      
		      WebElement consulationquetion6 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion6.click();
		      
		      Thread.sleep(800);
		      
		      WebElement consulationquetion7 =driver.findElement(By.xpath("//p[normalize-space()='Yes']"));
		      
		      consulationquetion7.click();

		      Thread.sleep(800);
		      
		      WebElement consulationquetion8 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion8.click();
		    
		      Thread.sleep(800);
		 
		      WebElement consulationquetion9 =driver.findElement(By.xpath("//textarea[@id='sq_118i']"));
		      
		      consulationquetion9.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley");
		      
		      Thread.sleep(800);
		      
		      WebElement consulationquetion10 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion10.click();
		      
		      Thread.sleep(900);
		      
		      WebElement consulationquetion11 =driver.findElement(By.xpath("//div[@id='sq_119']"));
		      
		      consulationquetion11.click();
		      
		      Thread.sleep(900);
		      
		      WebElement consulationquetion12 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
		      
		      consulationquetion12.click();
		      Thread.sleep(900);
		      
		      
		      WebElement consulationquetion13 =driver.findElement(By.xpath("//textarea[@id='sq_121i']"));
		      
		      consulationquetion13.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
		      
		      Thread.sleep(1200);
		      
		      
		      WebElement consulationquetion14 =driver.findElement(By.xpath("//button[@id='surveyComplete']"));
		      
		      consulationquetion14.click();
		      
		      Thread.sleep(1300);
		      
		      
		    //  WebElement consulationquetion15 =driver.findElement(By.cssSelector("Log New Readings"));
		      
		   //   consulationquetion15.click();
		      
		      JavascriptExecutor js28 = (JavascriptExecutor) driver;
		       WebElement hiddenElement26 = (WebElement) js28.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
		    
		       Thread.sleep(1500);
		       
		        try
		        {
		        	
		        
		        WebElement consulationquetion15= driver.findElement(By.xpath("//a[@class='modal-button its-font-w--600 text-white less-radius button is-success is-fullwidth is-medium d-md-flex']"));
		        
		        System.out.println("Element found!");
		        
		        consulationquetion15.click();
		        } 
		        
		        catch (NoSuchElementException e) {
		        			        	
		        			   		        	
		            System.out.println("Element not found!");
		        }
		        

			      Thread.sleep(1800);
			      
			   //   WebElement consulationquetion16 =driver.findElement(By.xpath("//select[@id='add-weight']"));
			      
			   //   consulationquetion16.click();
			      
			      
			      
			      
			      
			     WebElement dropdownElement = driver.findElement(By.id("add-weight")); 
			      
			      
		        
			  Thread.sleep(1200);
			      
			    Select dropdown = new Select(dropdownElement);

			        // Select by visible text
			   //.deselectByVisibleText("78");
			        
			    dropdown.selectByVisibleText("78");
			    
			      
			    Thread.sleep(1000);
			        
			      
			        WebElement dropdownElement1 = driver.findElement(By.id("add-waist_circumference"));
			        
			        
			        Thread.sleep(1000);
			        
			        
			        Select dropdown1 = new Select(dropdownElement1);

			        // Select by visible text
			        dropdown1.selectByVisibleText("70");
			        
			        
			        
			        Thread.sleep(1200);
			        
				      WebElement consulationquetion17 =driver.findElement(By.xpath("//form[@id='add-measurement-form']//button[@id='edit_measurement']"));
				      
				      consulationquetion17.click();
				      
				      
				    
				      
				      //WebElement consulationquetion18 =driver.findElement(By.xpath(" //div[@class='owl-item active center']//button[@id='select-me-30']"));
				      
				      //consulationquetion18.click();

				     // Thread.sleep(800);
				      
				      Thread.sleep(2000);
				      
				      WebElement consulationquetion19 =driver.findElement(By.xpath("//input[@placeholder='Start typing GP Surgery name...']")); 
				      
				      consulationquetion19.sendKeys("test");
				      
				      Thread.sleep(1700);
				     
				      JavascriptExecutor jscript4 = (JavascriptExecutor) driver;

				        // Scroll down by a specified number of pixels
				      jscript4.executeScript("window.scrollBy(0, 500)");
		
				      
				      Thread.sleep(1400);
				      		
			      
				    
				      WebElement consulationquetion20 =driver.findElement(By.xpath("//strong[normalize-space()='The Densham Surgery_Test_Ireland & UK_1']"));
				      
				      consulationquetion20.click();
				      
				      Thread.sleep(1300);
				      
				      
				      
				      JavascriptExecutor jscript = (JavascriptExecutor) driver;

				        // Scroll down by a specified number of pixels
				      jscript.executeScript("window.scrollBy(0, 500)");
				      
				      Thread.sleep(1300);
				      
				      
				    //  WebElement consulationquestion23 =driver.findElement(By.xpath("//button[normalize-space()='Select Treatment']"));
				      
				   //   consulationquestion23.click();
				      
				      try {
				    	  WebElement consulationquestion23 =driver.findElement(By.xpath("//button[normalize-space()='Select Treatment']"));
				    	    System.out.println("Element found!");
				    	    
				    	    consulationquestion23.click();
				    	    
				    	} catch (NoSuchElementException e) {
				    	    System.out.println("Element not found!");
				    	}
				    			       

				      Thread.sleep(1300);
				      
				      JavascriptExecutor jscript2 = (JavascriptExecutor) driver;

				        // Scroll down by a specified number of pixels
				      jscript2.executeScript("window.scrollBy(0, 1700)");
				      
				      Thread.sleep(1500);
				      
				    WebElement consulationquetion52 =driver.findElement(By.xpath("//span[@aria-label='Previous']"));
				      
				     consulationquetion52.click();
				    		  
				    		  
				     // Thread.sleep(1500);
				    

				  //    WebElement consulationquetion24 =driver.findElement(By.id("select-me-30"));
				      
				      WebElement consulationquetion54 =driver.findElement(By.id("select-me-33"));
				      
				      consulationquetion54.click();
				      
				      
				      Thread.sleep(1300);
				      
				      
				

				      Thread.sleep(1800);
				   
				      JavascriptExecutor jscript6 = (JavascriptExecutor) driver;

				        // Scroll down by a specified number of pixels
				      jscript6.executeScript("window.scrollBy(0, 1000)");
				 
		       
				      try {
				    	  WebElement consulationquestion26 =driver.findElement(By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
				    	    System.out.println("Element found!");
				    	    
				    	    consulationquestion26.click();
				    	    
				    	} catch (NoSuchElementException e) {
				    	    System.out.println("Element not found!");
				    	}
				    			    
				      
				      Thread.sleep(1800);
				      
				      try {
				    	  WebElement consulationquestion27 =driver.findElement(By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
				    	    System.out.println("Element found!");
				    	    
				    	    consulationquestion27.click();
				    	    
				    	} catch (NoSuchElementException e) {
				    	    System.out.println("Element not found!");
				    	}
				    			    
				      
				      Thread.sleep(1600);
				      
				      WebElement consulationquetion28 =driver.findElement(By.xpath("//button[@id='surveyComplete']"));
				      
				      consulationquetion28.click();
				   
				      Thread.sleep(5000);
				      
				      JavascriptExecutor jscript17 = (JavascriptExecutor) driver;

				        // Scroll down by a specified number of pixels
				      jscript17.executeScript("window.scrollBy(0, 1800)");
				      
				      Thread.sleep(3000);
				      
				   //   WebElement consulationquetion29 =driver.findElement(By.id("checkout-frames-card-number"));
				      
				     // consulationquetion29.click();

				      
				      
				   
				   // Perform actions inside the frame

				 
				    //  driver.switchTo().frame("frameName");
				      
				      // Create instance of JavascriptExecutor
				   //    JavascriptExecutor js15 = (JavascriptExecutor) driver;

				        // Execute JavaScript to find the element by its ID
				  //     WebElement hiddenElement16 = (WebElement) js15.executeScript("return document.getElementById('elementId');");
				       
				    //   Thread.sleep(1300);
				      
				   //   JavascriptExecutor js57 = (JavascriptExecutor) driver;
				      
				    //  WebElement hiddenElement58 = (WebElement) js57.executeScript("return document.getElementById('elementId');");
				      
				      
				      
				      JavascriptExecutor js59 = (JavascriptExecutor) driver;
				        WebElement hiddenElement58 = (WebElement) js59.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
				      
				        Thread.sleep(1500);
				      
				      
				      driver.switchTo().frame("singleIframe");

				      // Create instance of JavascriptExecutor
					    JavascriptExecutor js15 = (JavascriptExecutor) driver;

					        // Execute JavaScript to find the element by its ID
					     WebElement hiddenElement16 = (WebElement) js15.executeScript("return document.getElementById('elementId');");
				      
				      try {
				      
				     WebElement frameName = driver.findElement(By.id("checkout-frames-card-number"));
				     
				     System.out.println("Element found!");
				      
				     frameName.sendKeys("4111111111111111 ");
				     
				      }
				      catch (NoSuchElementException e) {
				    	  System.out.println("Element not found!");
				      }
				     
				     Thread.sleep(1300);
				      
				     JavascriptExecutor js8 = (JavascriptExecutor) driver;

				        // Execute JavaScript to find the element by its ID
				       WebElement hiddenElement8 = (WebElement) js8.executeScript("return document.getElementById('elementId');");
				     
				 //    driver.switchTo().frame("frameName2");
				     
				     
				       Thread.sleep(1300);

				 
				     
				     try {
				     
				     WebElement frameName2 = driver.findElement(By.id("checkout-frames-expiry-date"));
				     
				     System.out.println("Element found!");
				     
				     frameName2.sendKeys("02/25");
				     
				     }
				     
				     catch (NoSuchElementException e) {
				    	  System.out.println("Element not found!");
				      }
				     
				     Thread.sleep(1300);
				      
				     JavascriptExecutor js41 = (JavascriptExecutor) driver;

				        // Execute JavaScript to find the element by its ID
				       WebElement hiddenElement38 = (WebElement) js41.executeScript("return document.getElementById('elementId');");  
				     				   				     		
				     
				  //   driver.switchTo().frame("frameName3");
				     
				     try {
				    	 
				    	 
				     
				     
				     WebElement frameName3 = driver.findElement(By.id("checkout-frames-cvv"));
				     System.out.println("Element found!");
				     				     				   				   
				     
				     frameName3.sendKeys("100");
				     
				     
				     
				     }
				     catch (NoSuchElementException e) {
				    	  System.out.println("Element not found!");
				      }
				     
				     Thread.sleep(1300);
				      
				     
				      driver.switchTo().defaultContent();
				      
				      Thread.sleep(1400);

				     
				     WebElement placeorder = driver.findElement(By.xpath("//button[@class='action primary checkout amasty']"));
				     
				     Thread.sleep(800);
				     
				    placeorder.click();
				     
				     try {
				            Thread.sleep(2000); // Wait for 500 milliseconds (0.5 seconds)
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
				  
				     placeorder.click();
				     
				     
				     
				     
				  //   placeorder.click();
				  
				    // Thread.sleep(800);
				     
				   //  placeorder.click();
				     
				     Thread.sleep(1300);
				     
				        for (String handle : allWindowHandles) {
				            if (!handle.equals(mainWindowHandle)) {
				                driver.switchTo().window(handle);
				                break;
				            }
				        }
				        
				     
				     
				     Thread.sleep(1700);
				     
				     WebDriverWait wait = new WebDriverWait(driver, null);
				     
				    //driver.switchTo().frame("cko-3ds2-challenge-iframe"); 
				    
				    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("cko-3ds2-challenge-iframe"));
				     
				     
				    Thread.sleep(1700);
				     
				 
				    
			       JavascriptExecutor js1 = (JavascriptExecutor) driver;

			       
			       WebElement hiddenElement1 = (WebElement) js1.executeScript("return document.getElementById('elementId');");
			       
				    Thread.sleep(1000);
				    
				    
				    
				     try {
				    	 
				    
				    WebDriverWait wait1 = new WebDriverWait(driver, null);
				    
					wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-mask")));
				    
				    WebElement autentification  = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
				     
				    // WebElement autentification =driver.findElement(By.id("password"));
				     
				     autentification.sendKeys("Checkout1!");
				     
				     System.out.println("Element found! autentification");
				    		 
				  
				     
				     }
				     
				     catch (NoSuchElementException e) {
				    	  System.out.println("Element not found! autentification");
				      }
				     
				     
				    
				    
				     Thread.sleep(1500);
				     
				     WebElement continauth = driver.findElement(By.id("txtButton"));
				     continauth.click();
				    				    				     
								       
			
				     
				
	
	}
			

}
	
	

