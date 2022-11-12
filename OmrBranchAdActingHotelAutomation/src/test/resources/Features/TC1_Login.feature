Feature: Verifying AdActing Hotel Login Details

  Scenario Outline: Verifying AdActing Hotel Login Valid
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying AdActing Hotel Login Using Enter Key
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>" With Enter key
    Then User Should Verify After Login Seccess Massage "Hello Greens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying AdActing Hotel Invalid Login
    Given User is on AdActing Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify After Login With Invalid Credential Error msg Contains "Invalid Login"

    Examples: 
      | username   | password  |
      | Greens8767 | HJKJU3561 |
