package example.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.List;


public class SubmitOrderTest extends BaseTest {

    @Test
    public void SubmitOrder() {

        Home_Pge hp = lp.loginApplication();
        hp.clickVirtualAssistant();
        hp.switchToIframeContainer();
        hp.clickOrderStatus();
        hp.setClickYes();
        hp.setClickNo();
        hp.setClickSearch();
        hp.enterSearch("How do track my order");
        hp.clickOk();
        hp.verifyTextMsg();
        hp.clickShippingDelivery();
        hp.clickCancelOrder();
        hp.clickViewMore();
        hp.switchToIframeContainer();
        hp.verifyPopup();


    }

}


