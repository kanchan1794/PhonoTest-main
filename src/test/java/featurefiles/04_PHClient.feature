Feature: Test Phonologix Client Menu Functionality
  @ClientMenu
  Scenario: Phonologix Client Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Client menu
    Then Admin can see Clients List and add submenu List
  @ClientListSubMenu
  Scenario: Phonologix Therapist Submenu List Functionality
    When Admin clicks on Clients List submenu
    Then Admin can see The details of list of Clients
    When Admin Enters Search Keywords for Clients
    Then Relevant Clients Search Results Generated