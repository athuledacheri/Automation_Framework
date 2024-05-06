package example.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class BaseTest {

    public WebDriver driver;
    public  Login_page lp;



    public WebDriver initializeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

  @BeforeMethod
    public Login_page LaunchApplictaion()
    {
        driver = initializeDriver();
        lp = new Login_page(driver);
        lp.goTo();
        return lp;
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
