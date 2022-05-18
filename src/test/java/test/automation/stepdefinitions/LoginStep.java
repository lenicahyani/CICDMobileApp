package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;

public class LoginStep {
    @Steps
    LoginScreen loginScreen;

    @Given ("android user on Landing Page")
    public void androidUserOnLandingPage() {
        boolean actual = loginScreen.validateProductPage();
        Assert.assertTrue(actual);
    }
    @When ("android user tap icon login")
    public void androidUserTapIconLogin() {
        loginScreen.tapIconLogin();
    }
    @And ("android user input {string} on email field")
    public void androidUserInputEmail(String email) {
        loginScreen.inputEmailField(email);
    }
    @And ("android user input {string} on password field")
    public void androidUserInputPassword(String password) {
        loginScreen.inputPasswordField(password);
    }
    @And ("android user input tab button login")
     public void androidUserTapButtonLogin() {
        loginScreen.tapButtonLogin();
    }
    @Then ("android user on products page")
    public void androidUserOnProductPage() {
        boolean actual = loginScreen.validateProductPageAgain();
        Assert.assertTrue(actual);
    }

    @Given ("android user on page")
    public void androidUserOnPage() {
        boolean actual = loginScreen.validateProductPage();
        Assert.assertTrue(actual);
    }
    @When ("android user Tap icon login")
    public void androidUserTapiconLogin() {
        loginScreen.tapIconLogin();
    }
    @And ("android user Input {string} on email field")
    public void androidUserinputEmail(String email) {
        loginScreen.inputEmailField(email);
    }
    @And ("android user input {string} On password field")
    public void androidUserinputPassword(String password) {
        loginScreen.inputPasswordField(password);
    }
    @And ("android user input Tab button login")
    public void androidUserTapbuttonLogin() {
        loginScreen.tapButtonLogin();
    }
    @Then ("warning massage")
    public void androidUserOnproductPage() {
        boolean actual = loginScreen.validateWarningMassage();
        Assert.assertTrue(actual);
    }

}
