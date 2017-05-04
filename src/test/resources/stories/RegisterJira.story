JiraLog

Meta:
@suite jiralog

Narrative:
As a logged in user
I want to register the time in jira
So that I can validate that the jira is correctly logged

Scenario: Logging the jira system

Given I am on the intranet and i select the option jira
When I enter the username and password
And I press login button


Scenario: fill the Daily activity

Given The user is logged and I am at the main page of jira
When I click on Daily link
And I click on LogWork button
When I fill all the inputs of the Log work form
And I click on Log button


Scenario: fill the testing activity

Given The user is logged and I am at the main page of jira
When I click on Testing design and execution link
And I click on LogWork button
When I fill all the inputs of the Log work form
And I click on Log button
