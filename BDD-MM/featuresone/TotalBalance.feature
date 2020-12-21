@TOTALBALANCE
Feature: Customer can see the total balance which sums up five different values in the screen.


Background:  Logins into the application
 Given User enters username and password for the application
 Then  Navigates to the HomePage
 
 
@CheckList
Scenario: Verify Values and Fields on the TextBox
Given User is on HomePage
When User Enter the values for five different fields
And Clicks on "submit" button
Then All Five Values should be validated with given input


@NonZero
Scenario Outline: Checking NonZero values on the TextBox
Given User is on HomePage
When User Enter the values for five different fields
And Clicks on "submit" button
Then Validate the "<different>" Values on screen are greater than zero

Examples:
|Different|
|PositiveValues|
|OneTextFieldNonZero|
|NegativeNumber|


@VerifyTotalBalance
Scenario Outline: Checking NonZero values on the TextBox
Given User is on HomePage
When User Enter the values for five different fields
And Clicks on "submit" button
Then Verify Total Balance is greater than all the individual values mentioned "<case>"
Examples:
|case|
|Positive|
|Negative|

@Currency
Scenario: Checking NonZero values on the TextBox
Given User is on HomePage
When User Enter the values for five different fields
And Clicks on "submit" button
Then Assert the input values are mentioned in Dollars
And Verify the total balance currency should be similar to above values

@TotalSum
Scenario: Checking NonZero values on the TextBox
Given User is on HomePage
When User Enter the values for five different fields
And Clicks on "submit" button
When User add the all input field values
Then It should be equal to TotalBalance amount





