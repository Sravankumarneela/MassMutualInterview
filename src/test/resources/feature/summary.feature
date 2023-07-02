Feature: Summary page validations

Background:
	Given I am on summary page

Scenario: Summary Page key validations

	When I am on summary detail page

	Then Keys should present
	
Scenario: Summary Page values validations

	When I am on summary detail page

	Then Values should present

Scenario: Summary Page total value validations

	When Values are visible

	Then Total should be same