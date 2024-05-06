package example.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.List;

public class Home_Pge extends AbstractComponent {

    WebDriver driver;
    public Logger logger = LogManager.getLogger();

    public Home_Pge(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='virtual-assistant-launcher']")
    WebElement VirtualAssistant;


    protected By switchToIframe = By.xpath("//iframe[@id='insync-iframe']");


    @FindBy(xpath = "//button[contains(@class,'insyncBtn')]")
    WebElement clickOrderStatus;


    @FindBy(xpath = "(//div[@class='insyncBubbles'])[1]/child::div[1]")
    WebElement clickYes;

    @FindBy(xpath = "(//div[@class='insyncBubbles'])[3]/child::div[2]")
    WebElement clickNo;

    @FindBy(xpath = "//input[@class='insyncInputBox insyncInputBoxBorder']")
    WebElement searchBox;

    @FindBy(xpath = "//input[@class='insyncInputBox insyncInputBoxBorder']/following::div[1]")
    WebElement btn_clickOk;

    @FindBy(xpath = "//div[@class='insyncBubbleContainer _1070725861']/child::*/child::div[2]")
    WebElement btn_clickNo1;

    @FindBy(xpath = "//div[contains(text(),'Thanks for choosing DisneyStore.com! Did your order include an eGift Card?')]")
    WebElement textExtracter;


    @FindBy(xpath = "//button[text()='Shipping & Delivery']")
    WebElement ShippingDelivery;

    @FindBy(xpath = "//div/h3[text()='How do I cancel/change my order?']")
    WebElement textExtracterFs;


    @FindBy(xpath = " //div[text()='How do I cancel/change my order?']")
    WebElement CancelOrder;


    @FindBy(xpath = "//button[text()='View More']")
    WebElement viewMore;

    @FindBy(xpath = "//div[@class='insync-iframe-icons']/child::span[1]")
    WebElement closePopup;


    public void clickVirtualAssistant() {
        waitForWebElementToAppear1(VirtualAssistant);
        clickElement(VirtualAssistant);
        VirtualAssistant.isDisplayed();
        logger.info("successfully clicked");

    }


    public void switchToIframeContainer() {

        WebElement iframeElement = driver.findElement(switchToIframe);
        driver.switchTo().frame(iframeElement);
        logger.info("switch to container");

    }

    public void clickOrderStatus() {
        waitForWebElementToAppear(clickOrderStatus);
        clickElement(clickOrderStatus);
        clickOrderStatus.isDisplayed();
        logger.info("successfully clicked");

    }

    public void setClickYes() {
        waitForWebElementToAppear(clickYes);
        clickYes.isDisplayed();
        clickElement(clickYes);
        logger.info("successfully clicked");
    }

    public void setClickNo() {
        waitForWebElementToAppear(clickNo);
        clickNo.isDisplayed();
        clickElement(clickNo);
        logger.info("successfully clicked");
    }

    public void setClickSearch() {
        waitForWebElementToAppear(searchBox);

        clickElement(searchBox);

        logger.info("successfully clicked");
    }

    public void enterSearch(String P) {
        searchBox.sendKeys(P);
        logger.info("successfully Searched.....");
    }

    public void clickOk() {
//        waitForWebElementToAppear(btn_clickOk);
        clickElement(btn_clickOk);
        logger.info("successfully clicked");
    }


    public void verifyTextMsg() {
        String expectedTitle = "Thanks for choosing DisneyStore.com! Did your order include an eGift Card?";
        waitForWebElementToAppear1(textExtracter);
        String actualTitle = textExtracter.getText();
        logger.info("matches");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void clickShippingDelivery() {
        clickElement(ShippingDelivery);
        logger.info("shipping and delivery");
    }

    public void clickCancelOrder() {
        waitForWebElementToAppear2(CancelOrder);
        clickElement(CancelOrder);
        logger.info("Cancel order");
    }

    public void clickViewMore() {
        waitForWebElementToAppear2(viewMore);
        clickElement(viewMore);
        logger.info("viewMore");
    }

    public void verifyPopup() {
        String expectedTitle = "How do I cancel/change my order?";
        waitForWebElementToAppear1(textExtracterFs);
        String actualTitle = textExtracterFs.getText();
        logger.info("matches");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

//    public void setClosePopup()
//    {
//        clickElement(closePopup);
//        logger.info("popup closed");
//    }


//    public Demo DemoApplication() {
//
//        Demo demo = new Demo(driver);
//        return demo;
//
//    }


}