package cookbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertElement {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.seleniumacademy.com/cookbook/Alerts.html");
    }
    @Test
    public void Alertfun()
    {
        WebElement alertBtn = driver.findElement(By.id("simple"));
        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @AfterTest
    public void AfterTesting()
    {
        driver.quit();
    }

}
