package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.Base;

public class SummaryPage extends Base {

    WebDriver driver;

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    By pageTitle = By.xpath("//*[contains(@class,'sc-cart-header')]");
    By totalPrice = By.xpath("//*[@id='sc-subtotal-amount-activecart']");

    public boolean isPageTitleDisplayed() {
        return waitForElement(pageTitle).isDisplayed();
    }


    public String getTotalPrice() {
        return waitForElement(totalPrice).getText();
    }


}
