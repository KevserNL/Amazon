package com.amazon.pages;


import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductSearchingPage extends BasePage {
    @FindBy(xpath = "//span[normalize-space(@class)='a-color-state a-text-bold']")
    public WebElement searchTitle;

    /**
     * This method checks the product ....
     *
     * @param searchedItemSubtitle
     */
    public void pickingTheProduct(String searchedItemSubtitle) {
        boolean isProductFound = false;

        while (!isProductFound) {
            try {
                BrowserUtils.waitForPageToLoad(2);
                WebElement product = Driver.get().findElement(By.xpath("//span[contains(text(),'" + searchedItemSubtitle + "')]"));
                BrowserUtils.clickWithJS(product);
                isProductFound = true;
            } catch (NoSuchElementException e) {
                BrowserUtils.clickWithJS(nextButton);
            }
        }
        Assert.assertTrue("product can not be found in all pages", isProductFound);

    }

}

