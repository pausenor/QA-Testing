package com.example.kottest1

import android.view.View
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.Matcher
import org.junit.Rule
import org.junit.Test




class MainActivityTest {

    // Esta regla le dice a Android que inicie la Activity antes de cada test
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun alPresionarBoton_muestraSaludoConNombre() {
        val mainPage = MainPage()
        val detailPage = DetailPage()
        // 1. Escribir el nombre "Gemini" en el EditText
        //antes Clase MainPage onView(withId(R.id.etName))
        //antes Clase MainPage .perform(typeText("Gemini"), closeSoftKeyboard())
        mainPage.typeName("Gemini")
        // 2. Hacer clic en el botón de saludar
            //antes Clase MainPage  onView(withId(R.id.btnGreet))
        //antes Clase MainPage  .perform(click())
        mainPage.clickGreet()
        // 3. Verificar que el TextView ahora dice "Hola, Gemini!"
        //mainPage.greetingText.check(matches(isDisplayed())).check(matches(withText("Hola, Gemini!")))
        //onView(withId(R.id.tvGreeting))
        //    .check(matches(withText("Hola, Gemini!")))
        detailPage.verifyGreeting("Gemini")
    }


}