package cookbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DoubleClickElement {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://cps-check.com/double-click-test");
    }
    @Test
    public void dbclick()
    {
        WebElement clicker = driver.findElement(By.id("clicker"));
        Actions builder = new Actions(driver) ;
        for (int i=0; i< 2 ; i++)
        {
            builder.doubleClick(clicker).perform();

        }
        System.out.println("double click done");
        WebElement reset = driver.findElement(By.id("reset"));
        builder.click(reset).perform();
        System.out.println("reset done");


    }
    @AfterTest
    public void AfterTesting()
    {
        driver.quit();
    }



}
