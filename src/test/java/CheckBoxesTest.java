import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxesTest {

    WebDriver browser;

    @Test
    public void validateCheckBoxes(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/checkboxes");
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.manage().window().maximize();
        WebElement checkbox1 = browser.findElement(By.xpath("//body//input[1]"));
        WebElement checkbox2 = browser.findElement(By.xpath("//body//input[2]"));
        boolean checkboxTest1 = checkbox1.isSelected();
        Assert.assertEquals(checkboxTest1, false);
        checkbox1.click();
        boolean checkboxTest2 = checkbox1.isSelected();
        Assert.assertEquals(checkboxTest2, true);
        boolean checkboxTest3 = checkbox2.isSelected();
        Assert.assertEquals(checkboxTest3, true);
        checkbox2.click();
        boolean checkboxTest4 = checkbox2.isSelected();
        Assert.assertEquals(checkboxTest4, false);
        browser.quit();


    }

}
