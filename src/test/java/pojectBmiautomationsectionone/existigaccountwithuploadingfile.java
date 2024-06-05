package pojectBmiautomationsectionone;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class existigaccountwithuploadingfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

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
      
      Thread.sleep(800);
      
      WebElement consulation12487 = driver.findElement(By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
      
      consulation12487.click();
      
      Thread.sleep(800);
      
      WebElement consulationquetion10635 =driver.findElement(By.xpath("//button[@id='surveyNext']"));
      
      consulationquetion10635.click();
      
      

      
      Thread.sleep(3000);


   
      
     WebElement imageloacteor =driver.findElement(By.cssSelector("label[aria-label='Choose file']"));
    		 
    		 

     imageloacteor.sendKeys("C:\\Users\\ADMIN\\Documents\\SampleJPGImage_10mbmb.jpg");
     
      
								        
								        
}
	

}