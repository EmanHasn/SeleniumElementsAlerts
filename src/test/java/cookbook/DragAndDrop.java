package cookbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.seleniumacademy.com/cookbook/DragDropDemo.html");
    }
    @Test
    public void dragAndDrop()
    {
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions Builder = new Actions(driver);
        Builder.dragAndDrop(draggable,droppable).perform();
        System.out.println(droppable.getText());
    }
    @AfterTest
    public void AfterTesting()
    {
        driver.quit();
    }


}
