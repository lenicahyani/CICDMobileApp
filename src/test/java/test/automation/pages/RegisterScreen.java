package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    private By productPage() {
        return MobileBy.AccessibilityId("Products");
    }
    private By iconLogin() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"); }
    private By linkRegister() {
        return MobileBy.AccessibilityId("Register"); }
    private By nameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}
    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");}
    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");}
    private By buttonRegister() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By productPageAgain() {
        return MobileBy.AccessibilityId("Products");
    }

    @Step
    public boolean validateProductPage() {
        return waitUntilPresence(productPage()).isDisplayed();
    }
    @Step
    public void tapIconLogin(){
        onClick(iconLogin());
    }
    @Step
    public void tapLinkRegister(){
        onClick(linkRegister());
    }
    @Step
    public void inputFullnameField(String name){
        onClick(nameField());
        onType(nameField(), name);
    }
    @Step
    public void inputEmailField(String email){
        onClick(emailField());
        onType(emailField(), email);
    }
    @Step
    public void inputPasswordField(String password){
        onClick(passwordField());
        onType(passwordField(), password);
    }
    @Step
    public void tapButtonRegister(){onClick(buttonRegister());
    }
    @Step
    public boolean validateProductPageAgain() {
        return waitUntilPresence(productPageAgain()).isDisplayed();
    }
}
