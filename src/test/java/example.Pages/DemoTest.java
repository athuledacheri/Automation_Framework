package example.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {

    public static void main(String[] args) throws InterruptedException {
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

            driver.findElement(By.id("name")).sendKeys("hello");

            driver.switchTo().frame(driver.findElement(By.id("frm3")));
            driver.switchTo().frame(driver.findElement(By.id("frm1")));

            Select course = new Select(driver.findElement(By.id("course")));
            System.out.println(course);
            course.selectByVisibleText("Java");
      driver.switchTo().parentFrame();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("hello");
            driver.switchTo().defaultContent();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Athul");
        }
    }
}
