Feature: Ultimate Qa Testing feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: Title of your scenario For Ultimate Qa Url
    Given Launch browser
    Then Enter EmailID
    When Wait time "5" in Seconds
    Then Enter Password
    When Wait time "5" in Seconds
    #Then Click SignIn
    #Then Verify AccountName

    Examples:
      | UserName |
      | Qa Login |

  


