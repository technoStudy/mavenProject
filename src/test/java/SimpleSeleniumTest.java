import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );
        driver = new ChromeDriver();
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get( "https://google.com" );
    }
}
