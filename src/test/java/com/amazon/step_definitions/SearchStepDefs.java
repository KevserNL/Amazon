package com.amazon.step_definitions;



import com.amazon.pages.ProductSearchingPage;
import com.amazon.pages.SpecificProductPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class SearchStepDefs {
    SpecificProductPage specificProductPage = new SpecificProductPage();

    @And("the user should see {string} in the subtitle")
    public void theUserShouldSeeInTheSubtitle(String expectedSearchTitle) {
        String actualSearchTitle = new ProductSearchingPage().searchTitle.getText().replace("\"", "");
        assertEquals(expectedSearchTitle, actualSearchTitle);
    }

    @Then("the search input box should be interactable")
    public void theSearchInputBoxShouldBeInteractable() {
        assertTrue(new ProductSearchingPage().searchInputBox.isEnabled());
    }

    @Then("the user should see the {string} in the title")
    public void theUserShouldSeeTheInTheTitle(String itemName) {
        String actualTitle = Driver.get().getTitle();
        assertTrue(actualTitle.contains(itemName));
    }

    @And("the user clicks Proceed to Checkout")
    public void theUserClicksProceedToCheckout() {
        BrowserUtils.waitForClickablility(specificProductPage.proceedToCheckout,2);
        BrowserUtils.clickWithJS(specificProductPage.proceedToCheckout);
    }
}

