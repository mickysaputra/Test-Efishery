package Library.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryPagePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[3]")
    WebElement libraryNavBar;
    public void libraryNavbarIsDisplayed(){
        element(libraryNavBar).shouldBeVisible();
    }
    public void clickLibraryNavBar(){
        element(libraryNavBar).click();
    }

    @FindBy(linkText = "Playlist baru")
    WebElement playlistBaru;
    public void addNewPlaylist(){
        element(playlistBaru).shouldBeVisible();
        element(playlistBaru).click();
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ytmusic-playlist-form/div")
    WebElement popUpPlaylist;
    public void popupPlaylistDisplayed(){
        element(popUpPlaylist).shouldBeVisible();
    }

    @FindBy(id="title-input")
    WebElement inputTitle;
    public void inputTitle() throws Exception{
        element(inputTitle).shouldBeVisible();
        Thread.sleep(1000);
        element(inputTitle).sendKeys("test playlist123");
    }
    public void editTitle() throws Exception{
        element(inputTitle).shouldBeVisible();
        Thread.sleep(1000);
        element(inputTitle).sendKeys(" edited");

    }

    @FindBy(id="textarea")
    WebElement inputDescription;
    public void inputDescription(){
        element(inputDescription).shouldBeVisible();
        element(inputDescription).click();
        element(inputDescription).sendKeys("test description123");
    }public void editDescription(){
        element(inputDescription).shouldBeVisible();
        element(inputDescription).click();
        element(inputDescription).sendKeys(" edited");
    }


    @FindBy(css="tp-yt-paper-button.style-primary")
    WebElement buttonCreate;
    public void clickButtonCreate(){
        element(buttonCreate).shouldBeVisible();
        element(buttonCreate).click();
    }

    @FindBy(xpath="//*[@id=\"header\"]/ytmusic-editable-playlist-detail-header-renderer/ytmusic-detail-header-renderer/div/div[2]/h2/yt-formatted-string")
    WebElement newPlayList;
    public void newPlaylistIsDisplayed(){
        element(newPlayList).shouldBeVisible();
    }

    @FindBy(linkText = "test playlist123")
    WebElement existingPlaylist;
    public void clickExistingPlaylist(){
        element(existingPlaylist).shouldBeVisible();
        element(existingPlaylist).click();
    }

    @FindBy(xpath="/html/body/ytmusic-app/ytmusic-app-layout/div[3]/ytmusic-browse-response/div[2]/ytmusic-editable-playlist-detail-header-renderer/ytmusic-detail-header-renderer/div/div[2]/h2")
    WebElement detailExistingPlaylist;
    public void detailExistingPlaylistDisplayed(){
        element(detailExistingPlaylist).shouldBeVisible();
    }

    @FindBy(id="top-level-buttons")
    WebElement editPlaylistButton;
    public void clickEditPlaylistButton(){
        element(editPlaylistButton).shouldBeVisible();
        element(editPlaylistButton).click();
    }

    @FindBy(xpath="//*[@id=\"content\"]/ytmusic-playlist-form/div/h2")
    WebElement popupEditPlaylist;
    public void popupEditPlaylistDisplayed(){
        element(popupEditPlaylist).shouldBeVisible();
    }
    @FindBy(css="tp-yt-paper-button.submit-button:nth-child(5)")
    WebElement editButton;
    public void clickEditButton(){
        element(editButton).shouldBeVisible();
        element(editButton).click();
    }
}
