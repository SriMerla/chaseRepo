Feature: Create an Account functionality
Scenario: Create account for multiple users
  Given user is on loginpage
  And user clicks on link buying a puppy?
  When user enters valid data on Page to create an account
    |   firstname   |    lastname   |       email       |   confirmEmail    |     pass    |  confirmPass  |
    |   seja6      |    L          | sejaL6@gmail.com  | sejaL6@gmail.com  |     seja123 |   seja123    |
    |   Dev4      |    M          | devM4@gmail.com   | devM4@gmail.com   |     dev123  |   dev123     |
    |   Tory4       |    R          | toryR4@gmail.com  | toryR4@gmail.com  |     tory123 |   tory123    |

  Then user verifies confirmation message 

 