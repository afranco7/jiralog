package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by afrancob on 24/04/2017.
 */
public class RegisterJiraPage {
    public WebDriver driver;

    private static final By USERNAME_INPUT = By.id("login-form-username");
    private static final By PASSWORD_INPUT = By.id("login-form-password");
    private static final By LOGIN_BUTTON = By.id("login");
    private static final By DAILY_LINK = By.linkText("Daily");
    private static final By TESTING_LINK = By.linkText("Testing: design and execution");
    private static final By LOG_WORK_BUTTON = By.id("log-work");
    private static final By TIME_SPENT_INPUT = By.cssSelector("input#log-work-time-logged.text.short-field");
    private static final By WORK_DESCRIPTION_INPUT = By.xpath("//*[@id='log-work']/div[1]/fieldset/div[3]//*[@id='comment']");
    private static final By PROJECT_SELECTOR = By.cssSelector("select#log-project.select");
    private static final By LOG_BUTTON = By.id("log-work-submit");


    public void goToMainPage(String url){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    public void logInPage(String username, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickOnLogin(){
        driver.findElement(LOGIN_BUTTON).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
    public void clickOnDaily(){
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(DAILY_LINK).click();
    }
    public void clickOnLogWork(){
        driver.findElement(LOG_WORK_BUTTON).click();
    }

    public void fillTheTime(String task){

        if (task.equalsIgnoreCase("Daily")){
            driver.findElement(TIME_SPENT_INPUT).sendKeys("0.5h");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(WORK_DESCRIPTION_INPUT).sendKeys("regular daily and daily with xtivans and all qa team");

            Select select = new Select(driver.findElement(PROJECT_SELECTOR));
            select.selectByValue("XtivaBI - Xtiva");
        }else if (task.equalsIgnoreCase("Testing")){
            driver.findElement(TIME_SPENT_INPUT).sendKeys("8.5h");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(WORK_DESCRIPTION_INPUT).sendKeys("Testing the improvements, bugs and also Stories for the application");

            Select select = new Select(driver.findElement(PROJECT_SELECTOR));
            select.selectByValue("XtivaBI - Xtiva");
        }

    }

    public void clickOnLogButton(){
        driver.findElement(LOG_BUTTON).click();
    }

    public void clickOnTesting(){
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(TESTING_LINK).click();
    }

    public void closeDriver() { driver.close();    }

}
