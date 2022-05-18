package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;

public class RegisterStep {
    @Steps
    RegisterScreen registerScreen;

    @Given ("android user on Page")
    public void androidUserOnLandingPage() {
        boolean actual = registerScreen.validateProductPage();
        Assert.assertTrue(actual);
    }
    @When ("android user tap Icon login")
    public void androidUserTapIconLogin() {
        registerScreen.tapIconLogin();
    }
    @And ("android user tap link Register")
    public void androidUserTabRegister() {
        registerScreen.tapLinkRegister();
    }
    @And ("android user input {string} on name field")
    public void androidUserInputName(String name) {
        registerScreen.inputFullnameField(name);
    }
    @And ("android user input {string} on Email field")
    public void androidUserInputEmail(String email) {
        registerScreen.inputEmailField(email);
    }
    @And ("android user input {string} on Password field")
    public void androidUserInputPassword(String password) {
        registerScreen.inputPasswordField(password);
    }
    @And ("android user input tab button Register")
     public void androidUserTapButtonRegister() {
        registerScreen.tapButtonRegister();
    }
    @Then ("android user On products page")
    public void androidUserOnProductPage() {
        boolean actual = registerScreen.validateProductPageAgain();
        Assert.assertTrue(actual);
    }
}
