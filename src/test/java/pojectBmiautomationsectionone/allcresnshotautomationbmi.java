package pojectBmiautomationsectionone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allcresnshotautomationbmi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		

        // Initialize ChromeDriver
      WebDriver driver = new ChromeDriver();
      
      
        
      //WebDriver driver=new FirefoxDriver();

        
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

        // Navigate to the BMI calculator website
        driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
        
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
     
        driver.manage().window().maximize();
        
        String screenshotDir = "C:\\Users\\ADMIN\\Documents\\screenshots";
        Files.createDirectories(Paths.get(screenshotDir));  // Create the directory if it does not exist

        Thread.sleep(500);
        
        takeScreenshot(driver, screenshotDir, "01_initial_page");
   
        WebElement Button = driver.findElement(By.xpath("//button[normalize-space()='I have an account']"));
        
        takeScreenshot(driver, screenshotDir, "02_after_button_click");
        
        Button.click();
        
        Thread.sleep(500);
        
        WebElement Username = driver.findElement(By.name("username"));
        
        takeScreenshot(driver, screenshotDir, "03_after_button_click");
    
        Username.sendKeys("test3397@gmail.com");
        
        Thread.sleep(500);
        
        
        takeScreenshot(driver, screenshotDir, "04_after_button_click");
        
        
        WebElement Password  = driver.findElement(By.name("password"));
        
        
        takeScreenshot(driver, screenshotDir, "05_after_button_click");
        
        Password.sendKeys("Qwert@3397");
        
        takeScreenshot(driver, screenshotDir, "06_after_button_click");
        
        Thread.sleep(500);
        
        
        takeScreenshot(driver, screenshotDir, "07_after_button_click");
        
        WebElement newWindowButton = driver.findElement(By.id("send2-login"));
        
        
        newWindowButton.click();
        
        takeScreenshot(driver, screenshotDir, "08_after_button_click");
        
     
 
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
        
        takeScreenshot(driver, screenshotDir, "09_after_button_click");
        
        System.out.println("Element found!");
        
        addtreatment.click();
        
        takeScreenshot(driver, screenshotDir, "10_after_button_click");
        
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
        
        takeScreenshot(driver, screenshotDir, "11_after_button_click");
        
        WebElement popupelement= driver.findElement(By.name("soon-order"));
        
        popupelement.sendKeys("test order");
        
        takeScreenshot(driver, screenshotDir, "12_after_button_click");
        
        
        
        WebElement popupsubmit= driver.findElement(By.id("order_sooner_submit"));
        
        popupsubmit.click();
        
        takeScreenshot(driver, screenshotDir, "13_after_button_click");
        
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
      
      takeScreenshot(driver, screenshotDir, "14_after_button_click");
      
      Thread.sleep(800);
      
      takeScreenshot(driver, screenshotDir, "15_after_button_click");
      
      WebElement consulationquetion0 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "16_after_button_click");
      
      consulationquetion0.click();
      
      takeScreenshot(driver, screenshotDir, "17_after_button_click");
      
      Thread.sleep(800);
      
      
      WebElement consulationquetiondata1= driver.findElement(By.xpath("//textarea[@id='sq_113i']"));
      
      takeScreenshot(driver, screenshotDir, "18_after_button_click");
      
      consulationquetiondata1.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
      
      takeScreenshot(driver, screenshotDir, "19_after_button_click");
      
      
      Thread.sleep(800);
      
      
      
      WebElement consulationquetion2 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "20_after_button_click");
      
      consulationquetion2.click();
      
      takeScreenshot(driver, screenshotDir, "21_after_button_click");
      
      Thread.sleep(800);
      
      
      WebElement consulationquetion3 =driver.findElement(By.xpath("//p[normalize-space()='Yes- very reduced appetite']"));
      
      takeScreenshot(driver, screenshotDir, "22_after_button_click");
      
      consulationquetion3.click();
      
      takeScreenshot(driver, screenshotDir, "23_after_button_click");
      
      Thread.sleep(800);
      
      takeScreenshot(driver, screenshotDir, "24_after_button_click");
      
      WebElement consulationquetion4 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      
      consulationquetion4.click();
      
      takeScreenshot(driver, screenshotDir, "25_after_button_click");
      
      Thread.sleep(800);
      
      WebElement consulationquetion5 =driver.findElement(By.xpath("//p[normalize-space()='No- None so far']"));
      
      takeScreenshot(driver, screenshotDir, "26_after_button_click");
      
      consulationquetion5.click();
      
      takeScreenshot(driver, screenshotDir, "27_after_button_click");
      
      Thread.sleep(800);
      
      WebElement consulationquetion6 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "28_after_button_click");
      
      consulationquetion6.click();
      
      takeScreenshot(driver, screenshotDir, "29_after_button_click");
      
      Thread.sleep(800);
      
      WebElement consulationquetion7 =driver.findElement(By.xpath("//p[normalize-space()='Yes']"));
      
      takeScreenshot(driver, screenshotDir, "30_after_button_click");
      
      consulationquetion7.click();

      takeScreenshot(driver, screenshotDir, "31_after_button_click");
      
      Thread.sleep(800);
      
      WebElement consulationquetion8 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "32_after_button_click");
      
      consulationquetion8.click();
    
      takeScreenshot(driver, screenshotDir, "33_after_button_click");
      
      
      Thread.sleep(800);
 
      takeScreenshot(driver, screenshotDir, "34_after_button_click");
      
      
      WebElement consulationquetion9 =driver.findElement(By.xpath("//textarea[@id='sq_118i']"));
      
      takeScreenshot(driver, screenshotDir, "35_after_button_click");
      
      consulationquetion9.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley");
      
      takeScreenshot(driver, screenshotDir, "36_after_button_click");
      
      
      Thread.sleep(800);
      
      WebElement consulationquetion10 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "37_after_button_click");
      
      
      consulationquetion10.click();
      
      takeScreenshot(driver, screenshotDir, "38_after_button_click");
      
      Thread.sleep(900);
      
      WebElement consulationquetion11 =driver.findElement(By.xpath("//div[@id='sq_119']"));
      
      takeScreenshot(driver, screenshotDir, "39_after_button_click");
      
      consulationquetion11.click();
      
      takeScreenshot(driver, screenshotDir, "40_after_button_click");
      
      Thread.sleep(900);
      
      WebElement consulationquetion12 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      takeScreenshot(driver, screenshotDir, "41_after_button_click");
      
      consulationquetion12.click();
      
      takeScreenshot(driver, screenshotDir, "42_after_button_click");
      
      
      Thread.sleep(900);
      
      
      WebElement consulationquetion13 =driver.findElement(By.xpath("//textarea[@id='sq_121i']"));
      
      takeScreenshot(driver, screenshotDir, "43_after_button_click");
      
      consulationquetion13.sendKeys("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
      
      takeScreenshot(driver, screenshotDir, "44_after_button_click");
      
      Thread.sleep(1200);
      
      
      WebElement consulationquetion14 =driver.findElement(By.xpath("//button[@id='surveyComplete']"));
      
      takeScreenshot(driver, screenshotDir, "45_after_button_click");
      
      consulationquetion14.click();
      
      takeScreenshot(driver, screenshotDir, "46_after_button_click");
      
      
      Thread.sleep(1300);
      
      
    //  WebElement consulationquetion15 =driver.findElement(By.cssSelector("Log New Readings"));
      
   //   consulationquetion15.click();
      
      JavascriptExecutor js28 = (JavascriptExecutor) driver;
       WebElement hiddenElement26 = (WebElement) js28.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
    
       Thread.sleep(1500);
       
        try
        {
        	
        
        WebElement consulationquetion15= driver.findElement(By.xpath("//a[@class='modal-button its-font-w--600 text-white less-radius button is-success is-fullwidth is-medium d-md-flex']"));
        
        takeScreenshot(driver, screenshotDir, "47_after_button_click");
        
        
        System.out.println("Element found!");
        
        consulationquetion15.click();
        
        takeScreenshot(driver, screenshotDir, "48_after_button_click");
        
        } 
        
        catch (NoSuchElementException e) {
        			        	
        			   		        	
            System.out.println("Element not found!");
        }
        

	      Thread.sleep(1800);
	      
	   //   WebElement consulationquetion16 =driver.findElement(By.xpath("//select[@id='add-weight']"));
	      
	   //   consulationquetion16.click();
	      
	      
	      takeScreenshot(driver, screenshotDir, "49_after_button_click");
	      
	      
	     WebElement dropdownElement = driver.findElement(By.id("add-weight")); 
	      
	     takeScreenshot(driver, screenshotDir, "50_after_button_click");
        
	  Thread.sleep(1200);
	      
	    Select dropdown = new Select(dropdownElement);

	        // Select by visible text
	   //.deselectByVisibleText("78");
	    
	    takeScreenshot(driver, screenshotDir, "51_after_button_click");
	        
	    dropdown.selectByVisibleText("78");
	    
	    takeScreenshot(driver, screenshotDir, "52_after_button_click");
	    
	      
	    Thread.sleep(1000);
	        
	      
	        WebElement dropdownElement1 = driver.findElement(By.id("add-waist_circumference"));
	        
	        takeScreenshot(driver, screenshotDir, "53_after_button_click");
	        
	        
	        Thread.sleep(1000);
	        
	        
	        Select dropdown1 = new Select(dropdownElement1);

	        // Select by visible text
	        dropdown1.selectByVisibleText("70");
	        
	        takeScreenshot(driver, screenshotDir, "54_after_button_click");
	        
	        
	        
	        Thread.sleep(1200);
	        
		      WebElement consulationquetion17 =driver.findElement(By.xpath("//form[@id='add-measurement-form']//button[@id='edit_measurement']"));
		      
		      takeScreenshot(driver, screenshotDir, "55_after_button_click");
		      
		      consulationquetion17.click();
		      
		      takeScreenshot(driver, screenshotDir, "56_after_button_click");
		      
		      
		    
		      
		      //WebElement consulationquetion18 =driver.findElement(By.xpath(" //div[@class='owl-item active center']//button[@id='select-me-30']"));
		      
		      //consulationquetion18.click();

		     // Thread.sleep(800);
		      
		      Thread.sleep(2500);
		      
		      WebElement consulationquetion19 =driver.findElement(By.xpath("//input[@placeholder='Start typing GP Surgery name...']")); 
		      
		      takeScreenshot(driver, screenshotDir, "57_after_button_click");
		      
		      consulationquetion19.sendKeys("test");
		      
		      takeScreenshot(driver, screenshotDir, "58_after_button_click");
		      
		      Thread.sleep(1700);
		      
		      
		     
		      JavascriptExecutor jscript4 = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript4.executeScript("window.scrollBy(0, 500)");
		      
		      
		      takeScreenshot(driver, screenshotDir, "59_after_button_click");
		      
		      Thread.sleep(1400);
		      
		      takeScreenshot(driver, screenshotDir, "60_after_button_click");
		      		
	      
		    
		      WebElement consulationquetion20 =driver.findElement(By.xpath("//strong[normalize-space()='The Densham Surgery_Test_Ireland & UK_1']"));
		      
		      takeScreenshot(driver, screenshotDir, "61_after_button_click");
		      
		      consulationquetion20.click();
		      
		      takeScreenshot(driver, screenshotDir, "62_after_button_click");
		      
		      Thread.sleep(1300);
		      
		      takeScreenshot(driver, screenshotDir, "63_after_button_click");
		      
		      JavascriptExecutor jscript = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript.executeScript("window.scrollBy(0, 500)");
		      
		      Thread.sleep(1300);
		      
		      takeScreenshot(driver, screenshotDir, "64_after_button_click");
		      
		    //  WebElement consulationquestion23 =driver.findElement(By.xpath("//button[normalize-space()='Select Treatment']"));
		      
		   //   consulationquestion23.click();
		      
		      try {
		    	  WebElement consulationquestion23 =driver.findElement(By.xpath("//button[normalize-space()='Select Treatment']"));
		    	    System.out.println("Element found!");
		    	    
		    	    consulationquestion23.click();
		    	    
		    	    takeScreenshot(driver, screenshotDir, "65_after_button_click");
		    	    
		    	} catch (NoSuchElementException e) {
		    	    System.out.println("Element not found!");
		    	}
		    			       

		      takeScreenshot(driver, screenshotDir, "66_after_button_click");
		      
		      
		      Thread.sleep(1300);
		      
		      JavascriptExecutor jscript2 = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript2.executeScript("window.scrollBy(0, 1700)");
		      
		      Thread.sleep(1300);
		      
		      takeScreenshot(driver, screenshotDir, "67_after_button_click");

		      
		      
		      WebElement consulationquetion246 =driver.findElement(By.id("qty"));
		      
		      takeScreenshot(driver, screenshotDir, "68_after_button_click");
		      
		      Select select =new Select(consulationquetion246);
		      
		      takeScreenshot(driver, screenshotDir, "69_after_button_click");
		      
		      select.selectByValue("3");
		      
		      takeScreenshot(driver, screenshotDir, "70_after_button_click");
		      
		      Thread.sleep(1300);
		      
		      takeScreenshot(driver, screenshotDir, "71_after_button_click");
		      
		        JavascriptExecutor js208 = (JavascriptExecutor) driver;
		        WebElement hiddenElementerer = (WebElement) js208.executeScript("return document.evaluate(\"your-xpath\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
		      
		      
		        takeScreenshot(driver, screenshotDir, "72_after_button_click");
		        
		      WebElement consulationquetion24 =driver.findElement(By.id("select-me-30"));
		      
		      takeScreenshot(driver, screenshotDir, "73_after_button_click");
		      
		      consulationquetion24.click();

		      takeScreenshot(driver, screenshotDir, "74_after_button_click");
		      
		      Thread.sleep(1800);
		   
		      JavascriptExecutor jscript6 = (JavascriptExecutor) driver;
		      
		      

		        // Scroll down by a specified number of pixels
		      jscript6.executeScript("window.scrollBy(0, 1000)");
		 
		      takeScreenshot(driver, screenshotDir, "75_after_button_click");
		      
		      try {
		    	  WebElement consulationquestion26 =driver.findElement(By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
		    	    System.out.println("Element found!");
		    	    
		    	    takeScreenshot(driver, screenshotDir, "76_after_button_click");
		    	    
		    	    
		    	    consulationquestion26.click();
		    	    
		    	    takeScreenshot(driver, screenshotDir, "77_after_button_click");
		    	    
		    	} catch (NoSuchElementException e) {
		    	    System.out.println("Element not found!");
		    	}
		    			    
		      
		      Thread.sleep(1800);
		      
		      
		      try {
		    	  WebElement consulationquestion27 =driver.findElement(By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
		    	    System.out.println("Element found!");
		    	    
		    	    consulationquestion27.click();
		    	    
		    	    takeScreenshot(driver, screenshotDir, "78_after_button_click");
		    	    
		    	} catch (NoSuchElementException e) {
		    	    System.out.println("Element not found!");
		    	}
		    			    
		      
		      Thread.sleep(1600);
		      
		      WebElement consulationquetion28 =driver.findElement(By.xpath("//button[@id='surveyComplete']"));
		      
		      consulationquetion28.click();
		      
		      takeScreenshot(driver, screenshotDir, "79_after_button_click");
		   
		      Thread.sleep(2500);
		      
		      JavascriptExecutor jscript17 = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript17.executeScript("window.scrollBy(0, 1500)");
		      
		      Thread.sleep(2800);
		      
		      takeScreenshot(driver, screenshotDir, "80_after_button_click");
		      

		      
		      JavascriptExecutor jscript711 = (JavascriptExecutor) driver;

		        // Scroll down by a specified number of pixels
		      jscript17.executeScript("window.scrollBy(0, 1600)");
		      
		      takeScreenshot(driver, screenshotDir, "81_after_button_click");
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
		      
		      takeScreenshot(driver, screenshotDir, "82_after_button_click");
		      
		      
		      
		      try {
		      
		     WebElement frameName1 = driver.findElement(By.id("Field-numberInput"));
		     
		     System.out.println("Element found!");
		      
		     frameName1.sendKeys("4111111111111111 ");
		     
		     takeScreenshot(driver, screenshotDir, "83_after_button_click");
		      }
		      catch (NoSuchElementException e) {
		    	  System.out.println("Element not found!");
		      }
		     
		     Thread.sleep(1300);
		      
		     JavascriptExecutor js8 = (JavascriptExecutor) driver;

		        // Execute JavaScript to find the element by its ID
		       WebElement hiddenElement8 = (WebElement) js8.executeScript("return document.getElementById('elementId');");
		       
		       
		       takeScreenshot(driver, screenshotDir, "84_after_button_click");
		    
		     
		     
		       Thread.sleep(1300);
		       
			      try {
				      
					     WebElement frameName2 = driver.findElement(By.id("Field-expiryInput"));
					     
					     System.out.println("Element found!");
					      
					     frameName2.sendKeys("02/25");
					     
					     takeScreenshot(driver, screenshotDir, "85_after_button_click");
					     
					      }
					      catch (NoSuchElementException e) {
					    	  System.out.println("Element not found!");
					      }
					     
					     Thread.sleep(1300);
					      
					     JavascriptExecutor js9 = (JavascriptExecutor) driver;

					        // Execute JavaScript to find the element by its ID
					       WebElement hiddenElement9 = (WebElement) js9.executeScript("return document.getElementById('elementId');");
					       
					       takeScreenshot(driver, screenshotDir, "86_after_button_click");
					       
					       
					     
					       Thread.sleep(1300);
					       
						      try {
							      
								     WebElement frameName4 = driver.findElement(By.id("Field-cvcInput"));
								     
								     System.out.println("Element found!");
								      
								     frameName4.sendKeys("100");
								     
								     takeScreenshot(driver, screenshotDir, "87_after_button_click");
								     
								      }
								      catch (NoSuchElementException e) {
								    	  System.out.println("Element not found!");
								      }
								     
								     Thread.sleep(1300);
								     
								     
								     takeScreenshot(driver, screenshotDir, "88_after_button_click");
								     
								     
								     driver.switchTo().defaultContent();
								      
								     JavascriptExecutor js13 = (JavascriptExecutor) driver;

								        // Execute JavaScript to find the element by its ID
								       WebElement hiddenElement12 = (WebElement) js13.executeScript("return document.getElementById('elementId');");
								       
								       takeScreenshot(driver, screenshotDir, "89_after_button_click");
								       
								          
								       WebElement frameName24 = driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
								       
								       frameName24.click();
								       
								       takeScreenshot(driver, screenshotDir, "90_after_button_click");
								       
								       
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
								      
								      takeScreenshot(driver, screenshotDir, "91_after_button_click");
					
								       String url50=driver.getCurrentUrl();
								        
								        System.out.println(url50);
								        
								        
								        takeScreenshot(driver, screenshotDir, "92_after_button_click");
								        
								        WebElement consulationorder = driver.findElement(By.cssSelector("div[class='d-flex flex-wrap my-2 labelspanview'] span"));
								        		
								        		
								        String value = consulationorder.getText();
								        
								        takeScreenshot(driver, screenshotDir, "93_after_button_click");
								        
								        System.out.println("consulation number : " + value);
								        
								
								        takeScreenshot(driver, screenshotDir, "94_after_button_click");


								        takeScreenshotsOfAllWindows(driver, screenshotDir);


								        driver.quit();
								        
								        takeScreenshot(driver, screenshotDir, "95_after_button_click");
				
}									        
								        
	
private static void takeScreenshot(WebDriver driver, String screenshotDir, String fileName) throws IOException {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    Files.copy(screenshot.toPath(), Paths.get(screenshotDir, fileName + ".png"));
}

private static void takeScreenshotsOfAllWindows(WebDriver driver, String screenshotDir) throws IOException {
    // Get the main window handle
    String mainWindowHandle = driver.getWindowHandle();
    
    // Get all window handles
    Set<String> allWindowHandles = driver.getWindowHandles();
    
    // Initialize a counter for screenshot file naming
    int screenshotCounter = 1;

    // Iterate over all window handles
    for (String handle : allWindowHandles) {
        // Switch to each window
        driver.switchTo().window(handle);
        
        // Take a screenshot
        takeScreenshot(driver, screenshotDir, "window" + screenshotCounter);
        
        // Increment the counter
        screenshotCounter++;
    }

    // Switch back to the main window
    driver.switchTo().window(mainWindowHandle);


}

}


