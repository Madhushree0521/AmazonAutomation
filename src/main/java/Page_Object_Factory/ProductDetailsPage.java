package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.Base;

public class ProductDetailsPage extends Base {
    WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By productPrice = By.xpath("(//*[@class='a-box-inner'])[1]/div/div[3]");
    By addToCartButton = By.xpath("//*[@id='add-to-cart-button']");

    public String getProductPrice() {
        return waitForElement(productPrice).getText();
    }

    public boolean isclickBtnDisplayed() {
        return waitForElement(addToCartButton).isDisplayed();
    }

    public void clickButton() {
        try {
            waitForElement(addToCartButton).click();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
