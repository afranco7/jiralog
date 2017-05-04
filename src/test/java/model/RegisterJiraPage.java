package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by afrancob on 24/04/2017.
 */
public class RegisterJiraPage {
    public WebDriver driver;

    private static final By USERNAME_INPUT = By.id("login-form-username");
    private static final By PASSWORD_INPUT = By.id("login-form-password");
    private static final By LOGIN_BUTTON = By.id("login");


    public void goToMainPage(String url){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    public void logInPage(String username, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickOnlogin(){
        driver.findElement(LOGIN_BUTTON).click();
    }


}
