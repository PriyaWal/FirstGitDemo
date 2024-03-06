import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDrpdwn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		List<WebElement> country = driver.findElements(By.cssSelector("li[class=''ui-menu-item] a"));
	
        for(WebElement c:country)	
        {
        	if(c.getText().equalsIgnoreCase("austria "))
        	{
        		c.click();

        		break;
        	}
        }
	}

}
