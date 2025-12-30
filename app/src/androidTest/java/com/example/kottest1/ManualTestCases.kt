package com.example.kottest1

rite 2 fully detailed test cases:
1 positive login scenario
1 negative login scenario
Each test case must include:
Title
Steps
Expected Result


Case 1:
Title: Login Successfull
Expected Result:  Navigate to another screen with success
Steps:
 1. Put the url: https://the-internet.herokuapp.com/login
 2. Put the username tomsmith
 3. Put the password SuperSecretPassword!
 4. Press login button


Result obtained: The app navigates to the next screen correctly.
Evidence: I could send screen shot of the result

Case 2:
Title: Login with wrong username
Expected Result:  Message indicating the username is wrong
Steps:
    1. Put the url: https://the-internet.herokuapp.com/login
    2. Put the username tomsmith2
    3. Put the password SuperSecretPassword!
    4. Press login button


Result obtained: Screen that shows a message "Your username is invalid"
Evidence: I could send screen shot of the result


2) Addotional Test Coverage
        Case 3: Login without username
        Case 4: Login without password
        Case 3: Login with username SuperSecretPassword! and password tomsmith

3) Bug Report
Bug: Login with wrong password but message don`t show the error.
Severity: High
Steps to reproduce:
    1. Put the url: https://the-internet.herokuapp.com/login
    2. Put the username tomsmith
    3. Put the password SuperSecretPassword
    4. Press login button

Expeted vs Actual result:
        Expected result: a page indicating the error, that the password was wrong.

        Actual result: a page with green message saying that the password is ok, but it is wrong
