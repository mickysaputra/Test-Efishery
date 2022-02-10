package Library;

import Library.Steps.LibraryPageSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LibraryPage extends SerenityStory {

    @Steps
    LibraryPageSteps libraryPageSteps;

    @Given("I logged in")
    public void givenLoggedIn(){
        libraryPageSteps.login();

    }
    @When("I click Library")
    public void whenICLickLibrary() throws Exception{
        libraryPageSteps.openLibraryPage();
    }
    @When("I click add new playlist")
    public void whenICLickAddNewPlaylist(){
        libraryPageSteps.openAddNewPlaylist();
    }
    @When("I fill all required field")
    public void whenIFillAllRequired() throws Exception{
        libraryPageSteps.popUpAddNewPlaylistDisplayed();
        libraryPageSteps.inputDataPlaylist();
    }
    @When("I click create")
    public void whenIClickCreate(){
        libraryPageSteps.clickCreate();
    }

    @When("I open library page")
    public void whenIOpenLibraryPage() throws Exception{
        libraryPageSteps.openLibraryPage();

    }
    @When("I open existing playlist")
    public void whenIOpenExistingPlaylist(){
        libraryPageSteps.openExistingPlaylist();

    }
    @When("I click edit playlist")
    public void whenIClickEditPlaylist(){
        libraryPageSteps.clickEditPlaylistButton();
        libraryPageSteps.existingPlaylistDisplayed();

    }
    @When("I edit all required field")
    public void whenIeditAllRequired() throws Exception{
        libraryPageSteps.popUpAddNewPlaylistDisplayed();
        libraryPageSteps.editDataPlaylist();

    }
    @When("I click button edit")
    public void whenIclickButtonEdit(){
        libraryPageSteps.clickEditButton();

    }
    @Then("Playlist success edited")
    public void playlistSuccessEdited(){
        libraryPageSteps.newPlaylistDisplayed();

    }

    @Then("Playlist success created")
    public void thenPlaylistSuccessCreated(){
        libraryPageSteps.newPlaylistDisplayed();
    }

}
