package pojectBmiautomationsectionone;






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
			
	
	//this test project section
	
	public class loginvalidationorderplaced {
		
		//this java test start part test starting
			
				public static void main(String[] args) throws InterruptedException {
					
					
					
					        // Initialize ChromeDriver
					      WebDriver driver = new ChromeDriver();
					      
					      
					        
					      //WebDriver driver=new FirefoxDriver();

					        
					      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

					        // Navigate to the BMI calculator website
					        driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
					        
					        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
					     
					        driver.manage().window().maximize();

					        Thread.sleep(500);
					   
					        WebElement Button = driver.findElement(By.xpath("//button[normalize-space()='I have an account']"));
					        
					        Button.click();
					        
					        Thread.sleep(500);
					        
					        WebElement Username = driver.findElement(By.name("username"));
					        
					    
					        Username.sendKeys("test3397@gmail.com");
					        
					        Thread.sleep(500);
					        
					        WebElement Password  = driver.findElement(By.name("password"));
					        
					        
					        
					        
					        Password.sendKeys("Qwert@3397");
					        
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
							      
							      Thread.sleep(2500);
							      
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
							      
							      Thread.sleep(1300);

							      WebElement consulationquetion24 =driver.findElement(By.id("select-me-30"));
							      
							      consulationquetion24.click();

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
							   
							      Thread.sleep(2500);
							      
							      JavascriptExecutor jscript17 = (JavascriptExecutor) driver;

							        // Scroll down by a specified number of pixels
							      jscript17.executeScript("window.scrollBy(0, 1500)");
							      
							      Thread.sleep(2800);
							      
							      
							      

							      
							      JavascriptExecutor jscript711 = (JavascriptExecutor) driver;

							        // Scroll down by a specified number of pixels
							      jscript17.executeScript("window.scrollBy(0, 1600)");
							      
							
							  /*
							      
							      String partialFrameName = "__PrivateStripeElement";
							        
							        // Construct the CSS selector with partial match on name attribute
							        String nameSelector = "frame[name*='" + partialFrameName + "']";
							        
							        // Locate the frame element using the constructed CSS selector
							        WebElement frameElement = driver.findElement(By.name(nameSelector));
							      
							    //  WebElement frameElementsection = driver.findElement(By.xpath("//div[@id='stripe-payment-element']//div[@class='__PrivateStripeElement']"));
							      
							      driver.switchTo().frame(frameElement);


							      Thread.sleep(2800);

	*/

							      WebElement frameElement = driver.findElement(By.cssSelector("iframe[title='Secure payment input frame']"));
							      
							      driver.switchTo().frame(frameElement);
							      
							      
							      try {
							      
							     WebElement frameName1 = driver.findElement(By.id("Field-numberInput"));
							     
							     System.out.println("Element found!");
							      
							     frameName1.sendKeys("4111111111111111 ");
							     
							      }
							      catch (NoSuchElementException e) {
							    	  System.out.println("Element not found!");
							      }
							     
							     Thread.sleep(1300);
							      
							     JavascriptExecutor js8 = (JavascriptExecutor) driver;

							        // Execute JavaScript to find the element by its ID
							       WebElement hiddenElement8 = (WebElement) js8.executeScript("return document.getElementById('elementId');");
							       
							       
							     
							    
							     
							     
							       Thread.sleep(1300);
							       
								      try {
									      
										     WebElement frameName2 = driver.findElement(By.id("Field-expiryInput"));
										     
										     System.out.println("Element found!");
										      
										     frameName2.sendKeys("02/25");
										     
										      }
										      catch (NoSuchElementException e) {
										    	  System.out.println("Element not found!");
										      }
										     
										     Thread.sleep(1300);
										      
										     JavascriptExecutor js9 = (JavascriptExecutor) driver;

										        // Execute JavaScript to find the element by its ID
										       WebElement hiddenElement9 = (WebElement) js9.executeScript("return document.getElementById('elementId');");
										       
										       
										     
										       Thread.sleep(1300);
										       
											      try {
												      
													     WebElement frameName4 = driver.findElement(By.id("Field-cvcInput"));
													     
													     System.out.println("Element found!");
													      
													     frameName4.sendKeys("100");
													     
													      }
													      catch (NoSuchElementException e) {
													    	  System.out.println("Element not found!");
													      }
													     
													     Thread.sleep(1300);
													     
													     driver.switchTo().defaultContent();
													      
													     JavascriptExecutor js13 = (JavascriptExecutor) driver;

													        // Execute JavaScript to find the element by its ID
													       WebElement hiddenElement12 = (WebElement) js13.executeScript("return document.getElementById('elementId');");
													       
													          
													       WebElement frameName24 = driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
													       
													       frameName24.click();
													       
													       
													       Thread.sleep(1300);
													       
												

													       String mainWindow = driver.getWindowHandle();
														    // Perform actions that open new window
														    for (String handle : driver.getWindowHandles()) {
														        if (!handle.equals(mainWindow)) {
														            driver.switchTo().window(handle);
														            // Do actions on the new window
														        }
														    }
														    
													        

														       Thread.sleep(1300);
														       
													        JavascriptExecutor js1578 = (JavascriptExecutor) driver;
													        WebElement hiddenElement157 = (WebElement) js1578.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
													        		       
										
													       String url50=driver.getCurrentUrl();
													        
													        System.out.println(url50);
													        
													        

														       Thread.sleep(1300);
														       
													        
													        WebElement consulationorder = driver.findElement(By.cssSelector("div[class='d-flex flex-wrap my-2 labelspanview'] span"));
													        		
													        		
													        String value = consulationorder.getText();
													        
													        System.out.println("consulation number : " + value);
													        
													
													        String url52=driver.getCurrentUrl();
													        
													        System.out.println(url52);
				
				
				}
						

}
				
				



		

	
