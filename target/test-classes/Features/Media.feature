Feature: To test the features of the media button present in the app
In this feature we will test the features available in media tab

@SmokeTest
Scenario: To test the media player tab in app button
Given User click on media button
When User click on media player button
Then User clik on play video from local file

@SmokeTest
Scenario: To test the media player tab in app button
Given User click on media button
When User click on Media projection button
And User change the dimensions and then click on start now
Then User click on ok