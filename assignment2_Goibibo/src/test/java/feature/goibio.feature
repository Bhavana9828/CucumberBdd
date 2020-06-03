Feature: Login into Wesite

Scenario: Positive test validation
Given Initialize the browser with chrome
And Navigate to "https://www.goibibo.com/" Site
When Select any one option in Page
And Select From & Destination in page
And Select the Departure date and future Date in page
And Select the traveller details and travel class
And Search for the cheapest price and click on Book now button
Then Review the selection in the review page 
And close all browsers