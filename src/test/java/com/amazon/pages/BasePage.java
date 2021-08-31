package com.amazon.pages;


import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath = "//li[7]/a")
    public WebElement nextButton;


    /**
     * this method selects the checkbox with one parameter to filter the search
     *
     * @param optionName
     */
    public void selectCheckBox(String optionName) {
        WebElement element = Driver.get().findElement(By.xpath("//span[normalize-space(text())='" + optionName + "']"));

        if (!element.isSelected()) {
            element.click();
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
}









