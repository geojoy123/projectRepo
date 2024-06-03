package testprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class BMICalculatorAllPossibleResults {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
       

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents");

        // Navigate to the BMI calculator website
        driver.get("https://mybmistg.wpengine.com/auto-draft-2");
        driver.manage().window().maximize();

        // Generate and test random height and weight combinations
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int height = random.nextInt(120) + 100; // Random height between 100 and 199 cm
            int weight = random.nextInt(55) + 100;  // Random weight between 40 and 139 kg

            // Execute the test for the current height and weight
            testBMI(driver, height, weight);
        }

        // Close the browser window
        driver.quit();
    }

    private static boolean testBMI(WebDriver driver, int height, int weight) throws InterruptedException {
        // Find and fill the height and weight fields
    	
    	 Thread.sleep(300);

        WebElement heightField = driver.findElement(By.id("height"));
     
        heightField.sendKeys(String.valueOf(height));
        
        Thread.sleep(300);

        WebElement weightField = driver.findElement(By.id("weight"));

        weightField.sendKeys(String.valueOf(weight));
        
        Thread.sleep(300);

        // Click the Calculate button
        WebElement calculateButton = driver.findElement(By.id("proceedBtn"));
        calculateButton.click();
        
        Thread.sleep(300);
        
        // Print the result for the current height and weight
        //System.out.println("For height " + height + " cm and weight " + weight + " kg, BMI is: " + resultText);

        WebElement bmiResult = driver.findElement(By.id("result"));
        String bmiValue = bmiResult.getText();
        System.out.println("Height: " + height + " cm, Weight: " + weight + " kg, BMI: " + bmiValue);

        
        Thread.sleep(300);

   

        // Navigate back to the BMI calculator page
        driver.navigate().refresh();
    
    
    return true;
    
    }
}
