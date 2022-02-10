package Explore;

import Explore.Steps.ExplorePageSteps;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;

public class ExplorePage extends SerenityStory {

    @Steps
    ExplorePageSteps explorePageSteps;

    @Given("I logged in")
    public void givenILoggedIn(){
        explorePageSteps.login();

    }
    @When("I click explore page on navigation")
    public void whenICLickExplorePageOnNavigation(){
        explorePageSteps.openExplorePage();
    }
    @When("I open explore page")
    public void whenIOpenExplorePage(){
        explorePageSteps.openExplorePage();
        explorePageSteps.checkExplorePageDisplayed();
    }
    @When("I open new release")
    public void whenIOpenNewRelease(){
        explorePageSteps.openNewReleasePage();
    }
    @When("I choose 1 album")
    public void whenIChoose1Album(){
        explorePageSteps.clickAlbum();
    }
    @When("I Play song")
    public void whenIPlaySong(){
        explorePageSteps.openExplorePage();
        explorePageSteps.checkExplorePageDisplayed();
        explorePageSteps.openNewReleasePage();
        explorePageSteps.clickAlbum();
        explorePageSteps.clickPlay();
        explorePageSteps.songPlayed();
    }
    @When("I open other Page")
    public void whenIOpenOtherPage(){
        explorePageSteps.openExplorePage();

    }

    @When("I click player page")
    public void whenIClickPlayerPage(){
        explorePageSteps.openPlayerPage();
    }

    @Then("I click play and song played")
    public void thenIClickPlayAndSongPlayed(){
        explorePageSteps.clickPlay();
        explorePageSteps.songPlayed();
    }
    @Then("Explore Page Displayed")
    public void thenExplorePageDisplayed(){
        explorePageSteps.checkExplorePageDisplayed();
    }
    @Then("Player Page open")
    public void thenPlayerPageOpen(){
        explorePageSteps.songPlayed();
    }
}
