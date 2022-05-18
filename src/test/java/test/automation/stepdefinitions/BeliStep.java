package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.BeliScreen;

public class BeliStep {
    @Steps
    BeliScreen beliScreen;

    @Given ("android user on Landing page")
    public void androidUserOnLandingPage() {
        boolean actual = beliScreen.validateProductPage();
        Assert.assertTrue(actual);
    }
    @When ("android user tab button buy in one product")
    public void androidUserTapBuyOne() {
        beliScreen.tabBuyOne();
    }
    @And ("android user tab button beli in two product")
    public void androidUserBuyTwo() {
        beliScreen.tabBuyTwo();
    }
    @Then ("added to cart")
     public void addedToCart() {
        boolean actual = beliScreen.validateProductPage();
        Assert.assertTrue(actual);
    }
}
