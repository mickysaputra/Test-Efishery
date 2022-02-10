package Login.Steps;

import Login.Pages.LoginPagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

    LoginPagePage loginPagePage;

    public void openPage(){
        loginPagePage.open();
    }
    public void clickButtonLogin(){
        loginPagePage.clickLoginButton();

    }
    public void setInputEmail() {
        loginPagePage.setInputEmail();
        loginPagePage.clickNextEmail();
    }
    public void setInputPassword(){
        loginPagePage.setInputPassword();
        loginPagePage.clickNextLogin();


    }
    public void homepage(){
        loginPagePage.homepageDisplayed();

    }
    public void setInputInvalidPassword(){
        loginPagePage.setInputInvalidPassword();
        loginPagePage.clickNextLogin();
    }
    public void errorPassword(){
        loginPagePage.errorInvalidPasswordDisplayed();
    }

}
