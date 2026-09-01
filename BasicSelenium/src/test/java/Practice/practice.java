package Practice;
	import java.io.File;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class practice {

	    public static void main(String[] args) throws Exception {

	        // Launch browser
	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Open application
	        driver.get("https://demoapps.qspiders.com/ui");

	        // Locate element
	        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));

	        // Take screenshot of the element
	       File temp = element.getScreenshotAs(OutputType.FILE);

	        // Destination file (include file name and extension)
	        File dest = new File("./screenshots/register.png");

	        // Copy screenshot
	      FileHandler.copy(temp, dest);

	        System.out.println("Element screenshot captured successfully.");

	        driver.quit();
	    }
	}
