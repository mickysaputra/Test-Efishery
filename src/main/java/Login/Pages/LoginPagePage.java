package Login.Pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"right-content\"]/a")
    WebElement loginButton;

    public void clickLoginButton() {
        element(loginButton).shouldBeVisible();
        element(loginButton).click();
    }

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement inputEmail;

    public void setInputEmail() {
        element(inputEmail).shouldBeVisible();
        element(inputEmail).sendKeys("efisherytest10@gmail.com");
    }

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
    WebElement nextEmailButton;

    public void clickNextEmail() {
        element(nextEmailButton).shouldBeVisible();
        element(nextEmailButton).click();
    }

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement inputPassword;

    public void setInputPassword() {
        element(inputPassword).shouldBeVisible();
        element(inputPassword).sendKeys("oke123456");
    }
    public void setInputInvalidPassword() {
        element(inputPassword).shouldBeVisible();
        element(inputPassword).sendKeys("1111111");
    }

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
    WebElement nextLogin;

    public void clickNextLogin() {
        element(nextLogin).shouldBeVisible();
        element(nextLogin).click();
    }
    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")
    WebElement errorInvalidPassword;
    public void errorInvalidPasswordDisplayed(){
        element(errorInvalidPassword).shouldBeVisible();
    }

    @FindBy(xpath="//*[@id=\"contents\"]/ytmusic-carousel-shelf-renderer[1]")
    WebElement homepage;
    public void homepageDisplayed(){
        element(homepage).shouldBeVisible();
    }

}
