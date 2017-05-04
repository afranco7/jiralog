package steps;
import model.RegisterJiraPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.jbehave.core.annotations.Named;

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
        pageRegisterJira.logInPage("cambiarUser","CambiarPass");

    }

    @When("I press login button")
    public void clickOnLogin(){
        pageRegisterJira.clickOnLogin();
    }

    @When("I click on Daily link")
    public void clickOnDaily(){
        pageRegisterJira.clickOnDaily();
    }

    @When("I click on LogWork button")
    public void clickOnLogWork(){
        pageRegisterJira.clickOnLogWork();
    }

    @When("I fill all the inputs for $DailyTesting task of the Log work form")
    public void fillTheTime(@Named("DailyTesting") String DailyTesting){
        pageRegisterJira.fillTheTime(DailyTesting);
    }

    @When("I click on Log button")
    public void clickOnLogButton(){
        pageRegisterJira.clickOnLogButton();
    }

    @Given("The user is logged and I am at the main page of jira")
    public void goToPage(){
        pageRegisterJira.goToMainPage("https://mercurio.psl.com.co/jira/secure/Dashboard.jspa");
    }

    @When("I click on Testing design and execution link")
    public void clickOnTesting(){
        pageRegisterJira.clickOnTesting();
    }

    @AfterScenario
    public void afterAnyScenario() { pageRegisterJira.closeDriver();    }

}