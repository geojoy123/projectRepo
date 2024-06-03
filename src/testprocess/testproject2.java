package testprocess;



		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class testproject2 {




				    public static void main(String[] args) throws InterruptedException {
				        // Set the path to the ChromeDriver executable
				       
				        


				        // Create a new instance of the ChromeDriver
				        WebDriver driver = new ChromeDriver();

				        // Navigate to the BMI calculator website
				        driver.get("https://mybmistg.wpengine.com/auto-draft-2");
				        
				        driver.manage().window().maximize();
				        
				        Thread.sleep(300);


				        // Locate the input fields for height and weight
				        WebElement heightInput = driver.findElement(By.id("height"));
				        WebElement weightInput = driver.findElement(By.id("weight"));
				        
				        Thread.sleep(2000);

				        // Enter values for height and weight
				        heightInput.sendKeys("120"); // Replace with your height in centimeters
				        
				        Thread.sleep(2000);

				        weightInput.sendKeys("77"); // Replace with your weight in kilograms

				        // Submit the form to calculate BMI
				        WebElement calculateButton = driver.findElement(By.id("proceedBtn"));
				        calculateButton.click();
				        Thread.sleep(300);


				        // Wait for the result to be displayed (replace with appropriate wait mechanism)
				        // Extract and print the BMI result
				        WebElement bmiResult = driver.findElement(By.id("result"));
				        System.out.println("BMI Result: " + bmiResult.getText());

				        // Close the browser
				        
				    }
				

		

	}


