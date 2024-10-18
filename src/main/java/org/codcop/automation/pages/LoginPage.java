// LoginPage.java
package org.codcop.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement loginPageIcon;

    @FindBy(xpath = "//input[@id='inputPhoneEmail']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        loginPageIcon.click(); // Ensure it navigates to the login popup/form
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
