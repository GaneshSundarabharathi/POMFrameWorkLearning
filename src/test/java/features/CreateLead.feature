Feature: Create Lead in leaftap application
Scenario: Create a lead (positive)
#Given Invoke Testleaf application
And Enter username as DemoSalesManager
And Enter password as crmsfa
When Click on login button
Then Verify login is successful

Scenario: Create a lead (positive)
#Given Invoke Testleaf application
And Enter username as DemoSalesManager
And Enter password as crmsfa
And Click on login button
And click crmsfa link
And click Leads tab
And create lead button
And Enter company name as CTS
And Enter First Name as Ganesh
And Enter Last Name as Sundarabharathi
When click on Create Lead button
Then Verify lead is created successfully

Scenario Outline:: Create a lead (positive)
#Given Invoke Testleaf application
And Enter username as <username>
And Enter password as <password>
And Click on login button
And click crmsfa link
And click Leads tab
And create lead button
And Enter company name as <company>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
When click on Create Lead button
Then Verify lead is created successfully
Examples:
|username|password|company|firstname|lastname|
|DemoSalesManager|crmsfa|Cisco|Ganesh|Sundarabharathi|
|DemoSalesManager|crmsfa|ThoughtWorks|Tester|Testing|