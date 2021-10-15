Feature:Api testing for CRUID operators

  Background:
    Given user enters "http:www.amazon.com"

  Scenario: POST-Create a new user
    Given set api enpoint
    And User creates new user with request body "<Name>","<Gender>","<Email>",
    Then validate the status code 201
    And validate the userId is not null
    And validate the user name is  "<Name>"
    And validate the user Gender is "<Gender>"
    And validate the user Email is  "<Email>"
    And validate the user status is "<Status>"



    Examples:
      | Name       | Gender | Email            | Status |
      | John dow 8 | male   | john23@gmail.com | active


    #
