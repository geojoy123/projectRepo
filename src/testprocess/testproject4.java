package testprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testproject4 {

	
		// TODO Auto-generated method stub
		
	
	
		        // Set the path to your chromedriver
		 

			public static void main(String[] args) {
				
		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        
		        
		        	
		        
		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
		        
			
		        

		        // Navigate to the webpage
		        driver.get("https://mybmistg.wpengine.com/auto-draft-2");

		        try {
		            // Loop through height and weight ranges
		            for (int height = 120; height <= 275; height += 5) {
		                for (int weight = 55; weight <= 251; weight += 5) {
		                    // Find the input fields for height and weight
		                    WebElement heightInput = driver.findElement(By.id("height"));
		                    WebElement weightInput = driver.findElement(By.id("weight"));

		                    // Enter height and weight values
		                    heightInput.clear();
		                    heightInput.sendKeys(String.valueOf(height));
		                    weightInput.clear();
		                    weightInput.sendKeys(String.valueOf(weight));

		                    // Find the button to trigger the calculation
		                    WebElement calculateButton = driver.findElement(By.id("proceedBtn"));

		                    // Click on the calculate button
		                    calculateButton.click();

		                    // Wait for a while to let the calculation complete
		                    Thread.sleep(1000);

		                    // Find the element that displays the result
		                    WebElement resultElement = driver.findElement(By.id("result"));

		                    // Get the text of the result
		                    String resultText = resultElement.getText();

		                    // Print the result
		                    System.out.println("Height: " + height + " | Weight: " + weight + " | Result: " + resultText);
		                }
		                
		             
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		}

	


