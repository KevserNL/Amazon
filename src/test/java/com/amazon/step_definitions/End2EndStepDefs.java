package com.amazon.step_definitions;


import com.amazon.pages.ProductSearchingPage;
import com.amazon.pages.SpecificProductPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class End2EndStepDefs {

    ProductSearchingPage productSearchingPage = new ProductSearchingPage();
    SpecificProductPage specificProductPage = new SpecificProductPage();

    @Given("the user is in the main page")
    public void the_user_is_in_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println("*");
        assertTrue(Driver.get().getCurrentUrl().equalsIgnoreCase("https://www.amazon.com/"));
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String itemName) {
        productSearchingPage.searchInputBox.clear();
        productSearchingPage.searchInputBox.sendKeys(itemName);
        BrowserUtils.clickWithJS(productSearchingPage.searchButton);
        assertTrue(Driver.get().getTitle().contains(itemName));
        System.out.println("**");
    }

    @When("the user refines the search by clicking {string}")
    public void the_user_refines_the_search_by_clicking(String optionName) {
        productSearchingPage.selectCheckBox(optionName);
        System.out.println("***");
    }

    @When("the user selects the result containing {string}")
    public void the_user_selects_the_result_containing(String itemSubtitle) {
        productSearchingPage.pickingTheProduct(itemSubtitle);
        System.out.println("****");
    }

    @Then("the price should be {string}")
    public void the_price_should_be(String expectedPrice) {
        String actualPrice = specificProductPage.selectedProductPrice.getText();
        assertEquals(expectedPrice, actualPrice);
        System.out.println("*****");
    }

    @Then("the user adds the selected product to the basket")
    public void the_user_adds_the_selected_product_to_the_basket() {
        specificProductPage.addingToCart();
        System.out.println("******");
    }

}

