package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class BeliScreen extends BasePageObject {
    private By productPage() {
        return MobileBy.AccessibilityId("Products");
    }
    private By buyOne() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]"); }
    private By buyTwo() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }
    private By addCart() {
        return MobileBy.AccessibilityId("Products");
    }
    @Step
    public boolean validateProductPage() {
        return waitUntilPresence(productPage()).isDisplayed();
    }
    @Step
    public void tabBuyOne(){
        onClick(buyOne());
    }
    @Step
    public void tabBuyTwo(){
        onClick(buyTwo());
    }
    @Step
    public boolean validateAddCart() {
        return waitUntilPresence(addCart()).isDisplayed();
    }
}
