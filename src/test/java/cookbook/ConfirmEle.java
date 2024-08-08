package cookbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfirmEle {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.seleniumacademy.com/cookbook/Alerts.html");
    }
    @Test
    public void confirmfunc()
    {
        WebElement confirmBtn = driver.findElement(By.id("confirm"));
        confirmBtn.click();
        Alert confirm = driver.switchTo().alert();
        String textConfirm = confirm.getText();
        System.out.println(textConfirm);
        confirm.accept();
        System.out.println(driver.findElement(By.id("demo")).getText());
    }
    @AfterTest
    public void afterTesting()
    {
        driver.quit();
    }
}
