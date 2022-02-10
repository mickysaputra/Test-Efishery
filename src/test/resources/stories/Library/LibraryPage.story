Meta:@librarypage

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Create New PlayList
Given I logged in
When I click Library
When I click add new playlist
When I fill all required field
When I click create
Then Playlist success created



Scenario: edit PlayList
Given I logged in
When I open library page
When I open existing playlist
When I click edit playlist
When I edit all required field
When I click button edit
Then Playlist success edited