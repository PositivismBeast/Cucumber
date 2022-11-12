Feature: Verifying AdActing Hotel Search Hotel Details

  Scenario Outline: Verifying Search Hotel By Selecting All Fields
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 01/10/2022    | 02/10/2022     | 2 - Two         | 1 - One           |

  Scenario Outline: Verifying Search Hotel With Mandotory Fields
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Slect Mandatory Fields "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults Per Room>"
    Then User Should Verify After Searching Hotel Success message "Select Hotel"

    Examples: 
      | username   | password | Location  | Number of Rooms | Check In Date | Check Out Date | Adults Per Room |
      | Greens8767 | L4R739   | Melbourne | 1 - One         | 01/10/2022    | 02/10/2022     | 2 - Two         |

  Scenario Outline: Verifying Search Hotel With Future CheckIn Date
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Selected All Field "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User Should Verify After Searching Hotel With Date Error Msg "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double    | 1 - One         | 01/10/2023    | 02/10/2022     | 2 - Two         | 1 - One           |

  Scenario Outline: Verifying Search Hotel Without Entering Any Fields and Click Search
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"
    And User Should Click Search Without Entering Any Fields
    Then User Should verify the Error Massage "Please Select a Location"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |
