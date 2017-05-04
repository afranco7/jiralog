package steps;

import model.RegisterJiraPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

/**
 * Created by afrancob on 24/04/2017.
 */
public class RegisterJiraSteps extends Steps{
    private RegisterJiraPage pageRegisterJira =new RegisterJiraPage();

    @Given("I am on the intranet and i select the option jira")
    public void goToMainPage(){
        pageRegisterJira.goToMainPage("https://mercurio.psl.com.co/jira/secure/Dashboard.jspa");
    }

    @When("I enter the username and password")
    public void logInPage(){
        pageRegisterJira.logInPage("afrancob","cC0305007(");

    }

    @When("I press login button")
    public void clickOnlogin(){
        pageRegisterJira.clickOnlogin();
    }

}
