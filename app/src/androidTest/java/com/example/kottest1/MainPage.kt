package com.example.kottest1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

class MainPage {
    // Definimos los elementos en un solo lugar

    //Test Plan
    private val username get() = onView(withId(R.id.username))
    private val password get() = onView(withId(R.id.password))
    val btnLoginTest get() = onView(withId(R.id.btnLogin))



    fun typeName(name: String) {
        username.perform(typeText(name), closeSoftKeyboard())
    }
    fun typeName(name: String) {
        password.perform(typeText(name), closeSoftKeyboard())
    }
    fun clickGreet() {
        btnLoginTest.perform(click())
    }

}