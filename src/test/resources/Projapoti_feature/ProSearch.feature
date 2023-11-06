Feature: This is a search functionality



@Lily
Scenario: Verify prouser can search item in search field
Given Launch <"url"> pro
Then Enter Toys and click search icon
Then Verify prouser can search item in search field





@Jojoba
Scenario: Verify user can do mouse over
 Given Launch <"url"> pro
 Then Mouse over to Fashion
 Then click on Designer Handbags
 Then Verify user can do mouse over
 
 
 @Tulip
Scenario: Verify prouser can dropdown and search
 Given  Launch <"url"> pro
 Then  Select Books from dropdown
 Then Click Search Button
 Then  Verify prouser can dropdown and search
 


@Lilac
 Scenario: Verify prouser can Scrolldown in the page
 Given  Launch <"url"> pro
 Then Click on Candles
 Then  Verify prouser can Scrolldown in the page
 







