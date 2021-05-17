Feature: Ultimate Qa Testing feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: Title of your scenario For Ultimate Qa Url
    Given Launch browser
    Then Enter EmailID
    When Wait time "5" in Seconds
    Then Enter Password
    When Wait time "5" in Seconds
    Then Click SignIn
    Then Verify AccountName

    Examples:
      | UserName | Password   | Time | BUNAME         |
      | Qa Login | Password6^ | 5    | Chatly Prelive |

  Scenario Outline: Title of your scenario
    Given Launch chrome Browser for Salesforce Website
    And Enter "<UserName>" and "<Password>" value
    When Wait time "2" in Seconds
    Then Click the Main arrow of BU
    When Wait time "2" in Seconds
    Then Click Exact "<BUNAME>" BU Name
    When Wait time "14" in Seconds
    Then Move to Journey Builder
    When Wait time "35" in Seconds
    Then Search Journey Name
    Then Quit the Browser

    Examples:
      | UserName | Password   | Time | BUNAME         |
      | Qa Login | Password6^ | 5    | Chatly Prelive |


