Feature: Application Login
   Scenario: Login Success
     Given: User navigate to home page
     When: User clicks on login button
     When: User enters useremail as "vharsha.bca24@gmail.com"
     When: User enters password as "Sansha@1414"
     When: User should see signout button after logging in
     Then : Login should be successful
     
     Scenario: Login Failure
     Given: User navigate to home page
     When: User clicks on login button
     When: User enters useremail as "vharshca24@gmail.com"
     When: User enters password as "Sansh414"
     When: User should see signout button after logging in
     Then : failed
