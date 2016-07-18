package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by a1 on 18.07.16.
 */
public class LoginPage {
    @FindBy( id="username" )
    WebElement loginUserEmail;

    @FindBy( id="password" )
    WebElement loginUserPassword;

    @FindBy( id="remember_me" )
    WebElement rememberMe;

    @FindBy( linkText="Forgot password?" )
    WebElement forgotPasswordLink;

    @FindBy( id="_submit" )
    WebElement submitButton;

    public void stayLoggedIn() {

    }

    public void openRestorePasswordPage() {

    }

    public void clickOnLoginButton() {

    }

}
