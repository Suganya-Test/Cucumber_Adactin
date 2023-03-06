Feature: Adactin hotel booking site

Scenario: Login page

Given User launch the url
When User click the username and send the username "Suganya1114"
And User click the password and send the password "123456"
And User click the login button
Then See page shown

Scenario: Search hotel

When User click the location and select the location
And User click the hotels and select the hotel
And User click the room type and select the room type
And User click the check in date and send "15/01/2023"
And User click the chect out date and send "18/01/2023"
And User click the adults per room and select the option
And User click the children per room and select the option
And User click the search button
And User select the hotel
And user click the continue button
 
 
Scenario: Book a hotel

When User click the First Name and send "Suganya"
And User click the Last name and send "Amirthaganesh"
And User click the Billing Address and send "Chennai"
And User click the Credit Card No and send card number
And User click the Credit Card Type and select the card type
And User click the Expiry month and select the month
And User click the Expiry year and select the year
And User click thhe CVV Number and send number
And User click the Book Now button
And User click the My Itinerary
And User click the logout button