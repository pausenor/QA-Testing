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
    private val nameField get() = onView(withId(R.id.etName))
    private val greetButton get() = onView(withId(R.id.btnGreet))

    val greetingText get() = onView(withId(R.id.tvGreeting))

    fun typeName(name: String) {
        nameField.perform(typeText(name), closeSoftKeyboard())
    }

    fun clickGreet() {
        greetButton.perform(click())
    }

    fun assertPageIsVisible(){
        nameField.check(matches(isDisplayed()))
    }
}