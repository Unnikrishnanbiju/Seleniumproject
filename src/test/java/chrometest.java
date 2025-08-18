import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrometest {

    public static void main(String[] args) {
        // Set the path to chromedriver if necessary
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sdetclub.com/feed");
        driver.manage().window().maximize();

        // Optional: add driver.quit() to close the browser at the end
        // driver.quit();
    }
}
