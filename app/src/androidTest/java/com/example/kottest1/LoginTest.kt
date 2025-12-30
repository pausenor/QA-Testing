package com.example.kottest1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.experimental.theories.suppliers.TestedOn

class LoginTest {
    @Test

    fun loginCorrect() {
        val mainPage = MainPage()

        mainPage.username("tomsmith")
        mainPage.password("SuperSecretPassword!")
        mainPage.clickLoginTest()

        mainPage.assertPageIsVisible()
    }

    fun loginUsernameIncorrect() {
        val mainPage = MainPage()

        mainPage.username("tomsmith2")
        mainPage.password("SuperSecretPassword!")
        mainPage.clickLogin()

        mainPage.assertPageIsVisible()

    }
    fun loginPasswordIncorrect() {
        val mainPage = MainPage()

        mainPage.username("tomsmith")
        mainPage.password("SuperSecretPassword")
        mainPage.clickLogin()

        mainPage.assertPageIsVisible()

    }
    fun loginUserNamePasswordIncorrect() {
        val mainPage = MainPage()

        mainPage.username("tomsmith2")
        mainPage.password("SuperSecretPassword")
        mainPage.clickLogin()

        mainPage.assertPageIsVisible()

    }

}