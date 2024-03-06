import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class SellIntroduction {

	public static void main(String[] args) {
		//Step1: Invoke the browser
		//Chrome: ChromeDriver is class : Use mthd of ths class
		//WebDriver is interface
		//Step2: invoke chrome driver 
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
		driver.findElement(By.id("email")).sendKeys("walasepriyanka1992@gmail.com");
		driver.findElement(By.className("_9nyh")).sendKeys("Pr!y@1992");
	}

}
