import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumproject1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Apps\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
