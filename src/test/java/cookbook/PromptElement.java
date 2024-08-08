package cookbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PromptElement {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.seleniumacademy.com/cookbook/Alerts.html");
    }
    @Test
    public void promptFun()
    {
        WebElement promptBtn = driver.findElement(By.id("prompt"));
        WebElement prompt_demo= driver.findElement(By.id("prompt_demo"));
        promptBtn.click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Eman Hassan");
        prompt.accept();
        System.out.println(prompt_demo.getText());
    }
    @AfterTest
    public void afterTesting()
    {
        driver.quit();
    }

}
