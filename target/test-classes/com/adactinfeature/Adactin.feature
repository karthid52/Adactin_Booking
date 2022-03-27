@AD1
Feature: Hotel Booking in Adactin Application
Scenario Outline: Login Page
Given user Launch the Application
When user Enter the Valid "<username>" in Username Field
And user Enter The Valid "<password>" in Password Field
Then user Click On Login Button And It Navigetes To The Search Hotel Page
Examples:
|username|password|
|karthi|12456|
|karthik|jsksd|
|karthik322|0019Z9|


@AD2
Scenario: Search Hotel Page
When user Select The Hotel Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Adults Per Room
And user Select The children per Room
Then user click On Search Button And It Navigates To The Select Hotel Page


@AD3
Scenario: Select Hotel Page
When user Select The Hotel Name
Then user Click On Continue Button And It Navigates To The Book A Hotel Page


@AD4
Scenario: Book A Hotel Page
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Address Field
And user Enter Credit Card No In Credit Card No Field
And user Select The Credit Card Type
And user Select Expiry Date And Month
And user Enter The Cvv Number
Then User Click On Book Now Button And It Will Navigate To Booking Confirmation Page


@AD5
Scenario: Booking Confirmation Page
When user Take Screenshot of The Order Number
And user Click On The Logout Button And It Will Navigate To LogOut Page
Then user Take Screenshot of The Logout Page
