Feature: Verifying AdActing Hotel Book Hotel Details

  Scenario Outline: Verifying Book Hotel By Booking Hotel
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify After Booking Confirmation "Book A Hotel"
    And User Should Enter All Fields For Booking "<First Name>","<Last Name>" and "<Billing Address>"
      | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 8654313574515254 | American Express | July         |        2022 |        652 |
      | 3568351535784541 | VISA             | May          |        2022 |        214 |
      | 8543435321215321 | Master Card      | April        |        2022 |        521 |
      | 6556864311321356 | Other            | February     |        2022 |        542 |
    Then User Should Verify Confirm Msg "Booking Confirmation"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room | First Name | Last Name | Billing Address |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 28/09/2022    | 29/09/2022     | 2 - Two         | 1 - One           | Saravana   | yuvi      | Chennai         |

  Scenario Outline: Verifying Book Hotel By Booking Hotel WithOut Enter Any Fields
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify After Booking Confirmation "Book A Hotel"
    And User Should Click WithOut Select Any Fields
    Then User Should Verify Error Msg "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 28/09/2022    | 29/09/2022     | 2 - Two         | 1 - One           |
