package org.example.pages;

import org.example.base.BaseTest;
import org.example.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class OrangeHRMLoginPage extends BaseTest {

//    WebDriver driver;
    @FindBy(css = "h5[class*='orangehrm-login-title']") //$ used for end-with.
    private WebElement hrmTitle;
    @FindBy(css = "input[name='username']") //$ used for end-with.
    private WebElement userName;
    @FindBy(css = "input[name='password']")
    private WebElement password;
    @FindBy(css = "button[type='submit']") //$ used for end-with.
    private WebElement loginButton;
    @FindBy(css = "span[class='oxd-userdropdown-tab']")
    private WebElement userDropdown;
    @FindBy(css = "a[href*='/logout']")
    private WebElement logoutButton;


    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginHRM(String user, String pass) {
        WaitUtils.waitForElement(driver, hrmTitle);
        js.sendKeys(driver, userName, user);
        js.sendKeys(driver, password, pass);
        js.clickElement(driver, loginButton);
    }

    public void verifyLogout() throws InterruptedException {
        WaitUtils.waitForElement(driver, userDropdown);
        js.clickElement(driver, userDropdown);
        Thread.sleep(2000);
        WaitUtils.waitForElement(driver, logoutButton);
        Assert.assertTrue(logoutButton.isDisplayed(), "Logout CTA is not visible");
        js.clickElement(driver, logoutButton);
        Thread.sleep(2000);
        WaitUtils.waitForElement(driver, hrmTitle);
        js.assertDisplay(driver,hrmTitle);

    }


}
