import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSample {

	public static void main(String[] args) {
		
		//set the chromedriver you're running - in case of Chrome
		//you can also perform the tests with Firefox and IE
		System.setProperty("webdriver.chrome.driver", "C:/selenium-master/chromedriver/chromedriver.exe");
		
		//instance the driver
		WebDriver driver = new ChromeDriver();
		
		//get your URL
		driver.get("http://www.google.com");
		
		//find an element "by" "something" - check with Inspector
		//send some Google Search and confirm
		WebElement textArea = driver.findElement(By.name("q"));
		textArea.sendKeys("gitHub valdrich");
		textArea.submit();
		
		//close your browser
		driver.close();
		
	}
	
}
