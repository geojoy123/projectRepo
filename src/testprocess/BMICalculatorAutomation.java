package testprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BMICalculatorAutomation {
	

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
      

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

        // Navigate to the BMI calculator website
        driver.get("https://mybmistg.wpengine.com/auto-draft-2");
        driver.manage().window().maximize();

        // Define height and weight ranges
        int minHeight = 120; // Minimum height in centimeters
        int maxHeight = 150; // Maximum height in centimeters
        int minWeight = 55;  // Minimum weight in kilograms
        int maxWeight = 80; // Maximum weight in kilograms

        // Iterate through height and weight values
        for (int height = minHeight; height <= maxHeight; height++) {
        	
            for (int weight = minWeight; weight <= maxWeight; weight++) {
                // Enter height in centimeters
            	
            	Thread.sleep(300);

            	
                WebElement heightField = driver.findElement(By.id("height"));

                heightField.sendKeys(Integer.toString(height));
                
                Thread.sleep(300);


                // Enter weight in kilograms
                WebElement weightField = driver.findElement(By.id("weight"));
                
                weightField.sendKeys(Integer.toString(weight));
                
                Thread.sleep(300);


                // Click the Calculate button
                WebElement calculateButton = driver.findElement(By.id("proceedBtn"));
                calculateButton.click();
                
                Thread.sleep(300);


                // Get the BMI result
                WebElement bmiResult = driver.findElement(By.id("result"));
                String bmiValue = bmiResult.getText();
                System.out.println("Height: " + height + " cm, Weight: " + weight + " kg, BMI: " + bmiValue);

                // Navigate back to the BMI calculator page to enter new values
                driver.navigate().refresh();
                
                Thread.sleep(300);

     
             
            
        }
            
        }

        // Close the browser
        driver.quit();
        
        
    }

}

