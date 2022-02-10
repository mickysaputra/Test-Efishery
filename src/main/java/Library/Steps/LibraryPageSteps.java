package Library.Steps;

import Library.Pages.LibraryPagePage;
import Login.Pages.LoginPagePage;

public class LibraryPageSteps {

    LibraryPagePage libraryPagePage;
    LoginPagePage loginPagePage;


    public void login(){
        loginPagePage.open();
        loginPagePage.clickLoginButton();
        loginPagePage.setInputEmail();
        loginPagePage.clickNextEmail();
        loginPagePage.setInputPassword();
        loginPagePage.clickNextLogin();
        loginPagePage.homepageDisplayed();
    }


    public void openLibraryPage()throws Exception{
        Thread.sleep(1000);
        libraryPagePage.libraryNavbarIsDisplayed();
        libraryPagePage.clickLibraryNavBar();
    }
    public void openAddNewPlaylist(){
        libraryPagePage.addNewPlaylist();
    }
    public void popUpAddNewPlaylistDisplayed(){
        libraryPagePage.popupPlaylistDisplayed();
    }
    public void inputDataPlaylist()throws Exception{
        libraryPagePage.inputTitle();
        libraryPagePage.inputDescription();
    }
    public void clickCreate(){
        libraryPagePage.clickButtonCreate();
    }
    public void newPlaylistDisplayed(){
        libraryPagePage.newPlaylistIsDisplayed();
    }
    public void openExistingPlaylist(){
        libraryPagePage.clickExistingPlaylist();
        libraryPagePage.detailExistingPlaylistDisplayed();
    }
    public void existingPlaylistDisplayed(){
        libraryPagePage.popupEditPlaylistDisplayed();
    }
    public void clickEditPlaylistButton(){
        libraryPagePage.clickEditPlaylistButton();
    }
    public void editDataPlaylist() throws Exception{
        libraryPagePage.editTitle();
        libraryPagePage.editDescription();
    }
    public void clickEditButton(){
        libraryPagePage.clickEditButton();
    }
}
