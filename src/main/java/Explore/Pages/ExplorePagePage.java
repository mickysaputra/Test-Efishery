package Explore.Pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExplorePagePage extends PageObject {

    @FindBy(xpath="//*[@id=\"right-content\"]/a")
    WebElement loginButton;
    public void clickLoginButton(){
        element(loginButton).shouldBeVisible();
        element(loginButton).click();
    }
    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement inputEmail;
    public void setInputEmail(){
        element(inputEmail).shouldBeVisible();
        element(inputEmail).sendKeys("efisherytest10@gmail.com");
    }
    @FindBy(xpath="//*[@id=\"identifierNext\"]/div/button")
    WebElement nextEmailButton;
    public void clickNextEmail(){
        element(nextEmailButton).shouldBeVisible();
        element(nextEmailButton).click();
    }
    @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement inputPassword;
    public void setInputPassword(){
        element(inputPassword).shouldBeVisible();
        element(inputPassword).sendKeys("oke123456");
    }
    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
    WebElement nextLogin;
    public void clickNextLogin(){
        element(nextLogin).shouldBeVisible();
        element(nextLogin).click();
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]")
    WebElement exploreNavbar;
    public void checkExploreNavbarIsDisplayed(){
        element(exploreNavbar).shouldBeVisible();
    }
    public void clickExploreNavbar(){
        element(exploreNavbar).click();
    }
    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-navigation-button-renderer[1]/button")
    WebElement buttonNewRelease;
    public void checkButtonNewReleaseIsDisplayed(){
        element(buttonNewRelease).shouldBeVisible();
    }
    public void clickButtonNewRelease(){
        element(buttonNewRelease).click();
    }
    @FindBy(linkText="RELEASED")
    WebElement viewAlbum;
    public void viewAlbum(){
        element(viewAlbum).shouldBeVisible();
    }
    public void clickAlbum(){
        element(viewAlbum).click();
    }

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-detail-header-renderer/div/div[2]/h2/yt-formatted-string")
    WebElement albumdetail;
    public void albumDetailDisplayed(){
        element(albumdetail).shouldBeVisible();
    }

    @FindBy(xpath = "//*[@id=\"play-button\"]/div/yt-icon")
    WebElement buttonPlay;
    public void clickButtonPlay(){
        element(buttonPlay).shouldBeVisible();
        element(buttonPlay).click();
    }

    @FindBy( xpath ="//*[@id=\"main-panel\"]")
    WebElement songPlayed;
    public void songPlayed(){
        element(songPlayed).shouldBeVisible();
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-player-bar/div[2]")
    WebElement iconPlayerPage;
    public void iconPlayerPagedisplayed(){
        element(iconPlayerPage).shouldBeVisible();
    }
    public void clickOpenPlayerPage(){
        element(iconPlayerPage).click();

    }

}
