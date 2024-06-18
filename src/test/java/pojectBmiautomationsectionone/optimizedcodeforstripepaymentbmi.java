package pojectBmiautomationsectionone;



	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.JavascriptExecutor;

	public class optimizedcodeforstripepaymentbmi {
		


	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        
	        try {
	            // Navigate to the BMI calculator website
	            driver.get("https://staging.my-bmi.co.uk/consultation/details/index/condition/1");
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            driver.manage().window().maximize();

	            clickElement(driver, By.xpath("//button[normalize-space()='I have an account']"));
	            setInput(driver, By.name("username"), "test3397@gmail.com");
	            setInput(driver, By.name("password"), "Qwert@3397");
	            clickElement(driver, By.id("send2-login"));

	            switchToNewWindow(driver);
	            System.out.println(driver.getCurrentUrl());

	            try {
	                clickElement(driver, By.xpath("//a[normalize-space()='I need my treatment sooner']"));
	            } catch (NoSuchElementException e) {
	                System.out.println("Element not found!");
	            }

	            switchToNewWindow(driver);
	            setInput(driver, By.name("soon-order"), "test order");
	            clickElement(driver, By.id("order_sooner_submit"));

	            fillConsultationForm(driver);

	            selectDropdownValue(driver, By.id("add-weight"), "78");
	            selectDropdownValue(driver, By.id("add-waist_circumference"), "70");
	            clickElement(driver, By.id("edit_measurement"));

	            setInput(driver, By.xpath("//input[@placeholder='Start typing GP Surgery name...']"), "test");
	            scrollTo(driver, 500);
	            clickElement(driver, By.xpath("//strong[normalize-space()='The Densham Surgery_Test_Ireland & UK_1']"));
	            scrollTo(driver, 500);

	            try {
	                clickElement(driver, By.xpath("//button[normalize-space()='Select Treatment']"));
	            } catch (NoSuchElementException e) {
	                System.out.println("Element not found!");
	            }

	            scrollTo(driver, 1700);
	            clickElement(driver, By.id("select-me-30"));
	            scrollTo(driver, 1000);

	            clickElementIfExists(driver, By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
	            clickElementIfExists(driver, By.xpath("//span[@data-bind='css: question.getCheckedLabelCss(), click: onTrueLabelClick']"));
	            clickElement(driver, By.id("surveyComplete"));
	            scrollTo(driver, 1500);
	            scrollTo(driver, 1600);

	            handlePayment(driver);
	            printOrderConfirmation(driver);

	        } finally {
	            driver.quit();
	        }
	    }

	    private static void clickElement(WebDriver driver, By by) {
	        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by)).click();
	    }

	    private static void setInput(WebDriver driver, By by, String value) {
	        WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));
	        element.clear();
	        element.sendKeys(value);
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

	    private static void fillConsultationForm(WebDriver driver) {
	        clickElement(driver, By.xpath("//span[@data-bind='css: question.getUncheckedLabelCss(), click: onFalseLabelClick']"));
	        clickElement(driver, By.id("surveyNext"));
	        setInput(driver, By.id("sq_113i"), "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
	        clickElement(driver, By.id("surveyNext"));
	        clickElement(driver, By.xpath("//p[normalize-space()='Yes- very reduced appetite']"));
	        clickElement(driver, By.id("surveyNext"));
	        clickElement(driver, By.xpath("//p[normalize-space()='No- None so far']"));
	        clickElement(driver, By.id("surveyNext"));
	        clickElement(driver, By.xpath("//p[normalize-space()='Yes']"));
	        clickElement(driver, By.id("surveyNext"));
	        setInput(driver, By.id("sq_118i"), "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley");
	        clickElement(driver, By.id("surveyNext"));
	        clickElement(driver, By.xpath("//div[@id='sq_119']"));
	        clickElement(driver, By.id("surveyNext"));
	        setInput(driver, By.id("sq_121i"), "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard");
	        clickElement(driver, By.id("surveyComplete"));
	    }

	    private static void selectDropdownValue(WebDriver driver, By by, String value) {
	        Select dropdown = new Select(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by)));
	        dropdown.selectByVisibleText(value);
	    }

	    private static void scrollTo(WebDriver driver, int pixels) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + pixels + ")");
	    }

	    private static void clickElementIfExists(WebDriver driver, By by) {
	        try {
	            clickElement(driver, by);
	        } catch (NoSuchElementException e) {
	            System.out.println("Element not found!");
	        }
	    }

	    private static void handlePayment(WebDriver driver) {
	        driver.switchTo().frame(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[title='Secure payment input frame']"))));
	        setInput(driver, By.id("Field-numberInput"), "4111111111111111");
	        setInput(driver, By.id("Field-expiryInput"), "02/25");
	        setInput(driver, By.id("Field-cvcInput"), "100");
	        driver.switchTo().defaultContent();
	        clickElement(driver, By.xpath("//span[contains(text(),'Place Order')]"));
	    }

	    private static void printOrderConfirmation(WebDriver driver) {
	        System.out.println(driver.getCurrentUrl());
	        WebElement orderNumber = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='d-flex flex-wrap my-2 labelspanview'] span")));
	        System.out.println("Order number: " + orderNumber.getText());
	        WebElement orderConfirmation = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("is-size-4 mt-2")));
	        System.out.println(orderConfirmation.getText());
	    }
	}



