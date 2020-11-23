Feature: login to mypage

Background: user logged in
    Given user in login page
    When user enter john and 12345
    Then click on login
    Then user landed on home page

 @smoke
 Scenario: logout safely
 When user click on logout
 Then user logged out