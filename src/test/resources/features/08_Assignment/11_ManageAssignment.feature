@11_ManageAssignment
Feature: Delete multiple class validation
Background: Admin clicks delete button under header after selecting the multiple check box in the data table
Given: Admin is in delete alert


@Assignment1
Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
When: Admin clicks yes button
Then: Redirected to assignment page and selected assignment details11 are deleted from the data table


@Assignment2
Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
When: Admin clicks no button
Then: Redirected to assignment page and selected assignment details11 are not deleted from the data table
