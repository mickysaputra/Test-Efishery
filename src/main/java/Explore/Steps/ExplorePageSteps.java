package Explore.Steps;

import Explore.Pages.ExplorePagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ExplorePageSteps extends ScenarioSteps {

    ExplorePagePage explorePagePage;

    public void login(){
        explorePagePage.open();
        explorePagePage.clickLoginButton();
        explorePagePage.setInputEmail();
        explorePagePage.clickNextEmail();
        explorePagePage.setInputPassword();
        explorePagePage.clickNextLogin();
    }


    public void openExplorePage(){
        explorePagePage.checkExploreNavbarIsDisplayed();
        explorePagePage.clickExploreNavbar();
    }
    public void checkExplorePageDisplayed(){
        explorePagePage.checkButtonNewReleaseIsDisplayed();
    }
    public void openNewReleasePage(){
        explorePagePage.checkButtonNewReleaseIsDisplayed();
        explorePagePage.clickButtonNewRelease();
    }

    public void clickAlbum(){
        explorePagePage.viewAlbum();
        explorePagePage.clickAlbum();
    }
    public void clickPlay(){
        explorePagePage.albumDetailDisplayed();
        explorePagePage.clickButtonPlay();
    }
    public void songPlayed(){
        explorePagePage.songPlayed();
    }

    public void openPlayerPage(){
        explorePagePage.iconPlayerPagedisplayed();
        explorePagePage.clickOpenPlayerPage();

    }

}
