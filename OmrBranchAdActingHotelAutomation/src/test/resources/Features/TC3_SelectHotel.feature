Feature: Verifying AdActing Hotel Select Hotel Details

  Scenario Outline: Verifying Select Hotel By Selecting Hotel Name
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify After Booking Confirmation "Book A Hotel"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 28/09/2022    | 29/09/2022     | 2 - Two         | 1 - One           |

  Scenario Outline: Verifying Select Hotel WithOut Selecting Hotel Name
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"
    And User Should Click Continue WithOut Select Hotel
    Then User Should Verify Error Msg "Please Select a Hotel"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 28/09/2022    | 29/09/2022     | 2 - Two         | 1 - One           |
