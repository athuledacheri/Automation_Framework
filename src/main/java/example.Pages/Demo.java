//package example.Pages;
//
//import org.example.AbstractComponent;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Demo extends AbstractComponent {
//    WebDriver driver;
//
//    public Demo(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(xpath = "//span[normalize-space()='New & Trending']")
//    WebElement p;
//
//    public void clickMenu(){
//        clickElement(p);
//        logger.info("dghdbcjbjcb");
//    }
//}
