Feature: login

 Scenario: Login sign up
 	Given valid firstName and lastName and emailId
 	When Confirmed EmailId
 	Then success