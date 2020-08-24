import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTest {

 WebDriver browser;
    @Test

    public void first(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().window().setSize(new Dimension(1024, 768));
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.quit();

    }
}
