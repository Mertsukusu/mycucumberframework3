@hooks
Feature: US102 KoalaPalace Room Creation
    Background: User is on koala palace main page
      Given User is on Koalapalace main page
      And user clicks login button
      When user enters username
      When user enter password
      When user click submit button
      When user clicks add hotelroom button

    Scenario: TC01 Create Hotel Room
      When user selects idhotel
      When user enters the code
      When user enters the name
      When user enters the location
      When user enters description
      When user enter the price
      When user selects the room type
      When user enters the max adult count
      When user enters the max children count
      When user clicks approved button
      And user clicks save button
      And user verify the alert has successfully
      And user clicks ok button

    Scenario: TC02 verify hotel room is created
      When user search in code box data
      Then verify name field with your hotel code

