Feature: Healthcare Reporting

  @End_To_End
  Scenario: Validation of Health Care Reporting Details
    Given User launch url of the Application
    When User enters the Credentials of Application and click on login
    And User adds Admin User for Application
    Then User add the new Firm of the Application
    And User click on edit and update user details
    And User add and Update Contact details
    Then User add Firm Branding Details
    And User Add Order Details
    And USer Enters pre Submission details
