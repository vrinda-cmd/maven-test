Feature: To test the features of the app button present in the app
In this feature we will test the features available in app tab

@RegressionTest
Scenario: To test the action bar tab in app button
Given User click on app button
When User click on action bar button
And User click on display options button
Then User click on Display_show_title button

@SmokeTest
Scenario Outline: To test the invoke search tab in app button
Given User click on app button
When User click on search
And User click on invoke search button
And User enter "<profilequery>" "<Appdata>"
Then User click on OnSearchRequest

Examples:
|profilequery|Appdata|
|App|Search|
|Search|Dog|