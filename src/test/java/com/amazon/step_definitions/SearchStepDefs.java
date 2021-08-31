package com.amazon.step_definitions;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.sql.Driver;

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
    public void theUserShouldSeeTheInTheTitle(String pageTitle) {
        String actualTitle = Driver.get().getTitle();
        assertTrue(actualTitle.contains(pageTitle));
    }

    @And("the user clicks Proceed to Checkout")
    public void theUserClicksProceedToCheckout() {
        BrowserUtils.clickWithJS(specificProductPage.proceedToCheckout);
        BrowserUtils.clickWithJS(specificProductPage.proceedToCheckout);
        BrowserUtils.waitFor(3);
    }






}

