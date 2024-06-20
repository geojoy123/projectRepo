package pojectBmiautomationsectionone;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;




		public class optimizedcodeforstripepaymentbmi {

		    public static void main(String[] args) throws IOException {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();

		        String screenshotDir = "C:\\Users\\ADMIN\\Documents\\screenshots";
		        Files.createDirectories(Paths.get(screenshotDir));

		        driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
		        takeScreenshot(driver, screenshotDir, "01_initial_page");

		        clickElement(driver, By.xpath("//button[normalize-space()='I have an account']"));
		        takeScreenshot(driver, screenshotDir, "02_after_button_click");

		        enterText(driver, By.name("username"), "test3397@gmail.com");
		        takeScreenshot(driver, screenshotDir, "03_after_username");

		        enterText(driver, By.name("password"), "Qwert@3397");
		        takeScreenshot(driver, screenshotDir, "04_after_password");

		        clickElement(driver, By.id("send2-login"));
		        takeScreenshot(driver, screenshotDir, "05_after_login");

		        switchToNewWindow(driver);
		        takeScreenshot(driver, screenshotDir, "06_new_window");

		        // Further actions here...

		        takeScreenshotsOfAllWindows(driver, screenshotDir);
		        driver.quit();
		    }

		    private static void takeScreenshot(WebDriver driver, String screenshotDir, String fileName) throws IOException {
		        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        Files.copy(screenshot.toPath(), Paths.get(screenshotDir, fileName + ".png"));
		    }

		    private static void takeScreenshotsOfAllWindows(WebDriver driver, String screenshotDir) throws IOException {
		        String mainWindowHandle = driver.getWindowHandle();
		        Set<String> allWindowHandles = driver.getWindowHandles();
		        int screenshotCounter = 1;

		        for (String handle : allWindowHandles) {
		            driver.switchTo().window(handle);
		            takeScreenshot(driver, screenshotDir, "window" + screenshotCounter);
		            screenshotCounter++;
		        }

		        driver.switchTo().window(mainWindowHandle);
		    }

		    private static void clickElement(WebDriver driver, By locator) {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		    }

		    private static void enterText(WebDriver driver, By locator, String text) {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		        element.clear();
		        element.sendKeys(text);
		    }

		    private static void switchToNewWindow(WebDriver driver) {
		        String mainWindowHandle = driver.getWindowHandle();
		        Set<String> allWindowHandles = driver.getWindowHandles();
		        for (String handle : allWindowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		            }
		        }
		    }
		}
