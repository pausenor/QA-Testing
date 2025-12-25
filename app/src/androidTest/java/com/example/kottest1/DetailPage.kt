package com.example.kottest1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

class DetailPage {
    // Usamos el ID de la SEGUNDA pantalla que aparece en tu log
    private val messageText get() = onView(withId(R.id.tvReceivedMessage))

    fun verifyGreeting(expectedName: String) {
        messageText.check(matches(withText("Hola, $expectedName!")))
    }
}