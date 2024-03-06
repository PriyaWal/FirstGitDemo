import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/D:/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement w = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s= new Select(w);
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByVisibleText("AED");
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
