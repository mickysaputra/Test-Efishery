package Login;

import Login.Steps.LoginPageSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LoginPage extends SerenityStory {


    @Steps
    LoginPageSteps loginPageSteps;

    @Given("I open LoginPage")
    public void givenIOpenLoginPage(){
        loginPageSteps.openPage();
        loginPageSteps.clickButtonLogin();
    }
    @When("I Input All Field")
    public void whenIInputAllField(){
        loginPageSteps.setInputEmail();
        loginPageSteps.setInputPassword();
    }
    @When("I Input right username and wrong password")
    public void whenIInputRightUsernameAndWrongPassword(){
        loginPageSteps.setInputEmail();
        loginPageSteps.setInputInvalidPassword();
    }

    @Then("Error Password Displayed")
    public void whenErrorPasswordDisplayed(){
        loginPageSteps.errorPassword();
    }
    @Then("Login Success")
    public void thenLoginSuccess(){
        loginPageSteps.homepage();
    }
}
