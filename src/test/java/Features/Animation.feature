Feature: To test the features of the animation present in the app
In this feature we will test the features available in animation tab

@RegressionTest
Scenario: To test the animation feature activity transition
Given User click on Animation tab
When User click on Hide-show transition
And Click on Custom animation and hide button 
And Click on button
Then User click on show button

@RegressionTest
Scenario: To test animation feature flip transition
Given User click on Animation tab
When User click on view flip button
Then User click on flip button