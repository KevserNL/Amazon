package com.amazon.pages;



import com.amazon.utilities.BrowserUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificProductPage extends BasePage {

    @FindBy(id = "buybox-see-all-buying-choices")
    public WebElement seeAllBuyingOptions;

    @FindBy(xpath = "(//input[@name='submit.addToCart'])")
    public WebElement addToCart;

    @FindBy(id= "add-to-cart-button")
    public WebElement addToCart2;

    @FindBy(xpath = "//span[@id='size_name_0_price']//p")
    public WebElement selectedProductPrice;

    @FindBy(id = "attach-accessory-proceed-to-checkout-text")
    public WebElement proceedToCheckout;

    public void addingToCart(){
        try {
            seeAllBuyingOptions.click();
            BrowserUtils.clickWithJS(addToCart);
        }catch (NoSuchElementException e){
            BrowserUtils.clickWithJS(addToCart2);
        }
    }
}

