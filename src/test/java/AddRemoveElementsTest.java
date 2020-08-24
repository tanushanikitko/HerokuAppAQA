import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddRemoveElementsTest {
    WebDriver browser;

    @Test
    public void validateAddRemoveElements(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.manage().window().maximize();
        browser.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        browser.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        browser.findElement(By.className("added-manually")).click();
        browser.findElement(By.className("added-manually")).click();
        browser.quit();

    }
}
