package example.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_page extends AbstractComponent {
    WebDriver driver;

    public Logger logger = LogManager.getLogger();
    public Login_page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Home_Pge loginApplication() {

        Home_Pge hp = new Home_Pge(driver);
        return hp;

    }

    public void goTo() {
        driver.get("https://support.disneystore.com/hc/en-us");
        Assert.assertEquals("https://support.disneystore.com/hc/en-us", driver.getCurrentUrl());
        logger.info("successfully opened the website");

    }


}
