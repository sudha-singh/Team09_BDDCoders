@07_ManageAssignment
Feature: Delete Assignment validation
Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
Given: Admin is in manage assignment page
When: Admin clicks delete button in data table row level



@Assignment1
Scenario: Verify Delete Assignment alert
Then: Admin should see dialog box

@Assignment2
Scenario: Verify  accept enabled in alert
Then: Alert should have "yes" button to accept 

@Assignment3
Scenario: Verify reject enabled in alert
Then: Alert should have "No" button to reject
