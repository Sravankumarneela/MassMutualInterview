Feature: Summary page validations

Background:
	Given I am on summary page

Scenario: Validate total value when all the individual values are empty
	
	Given Individual values are empty

	When Values are visible

	Then Total should be zero
	
Scenario: Validate total value when all the individual values are zero
	
	Given Individual values are zero

	When Values are visible

	Then Total should be zero
	
Scenario: Validate total value when only one individual values is entered
	
	Given One Individual value is greater than zero

	When Values are visible

	Then Total should be same

Scenario: Summary Page total value validations when all values are present
	
	Given All individual values are present

	When Values are visible

	Then Total should be same

Scenario: Validate total value when dollar is not present
	
	Given All individual values are present without dollar symbol

	When Values are visible

	Then Total should be same 
	
Scenario: Validate total value when decimal values are present
	
	Given All individual values are present in decimal form

	When Values are visible

	Then Total should be same 
	
Scenario: Validate total value when all the individual values are zero decimals
	
	Given Individual values are zero with decimals

	When Values are visible

	Then Total should be zero

Scenario: Summary Page labels validations

	When I am on summary detail page

	Then Keys should present
	
Scenario: Summary Page values validations

	When I am on summary detail page

	Then Values should present


	
