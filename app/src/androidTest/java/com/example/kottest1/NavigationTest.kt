package com.example.kottest1

import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra
import androidx.test.espresso.intent.rule.IntentsRule
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class NavigationTest {
    // Usamos IntentsRule para poder monitorear los intentos de navegación
    @get:Rule
    val intentsRule = IntentsRule()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun alPresionarBoton_navegaADetalleConMensaje() {
        val textoAEnviar = "Gemini"

        // 1. Interactuar con la primera pantalla
        onView(withId(R.id.etName)).perform(typeText(textoAEnviar), closeSoftKeyboard())
        onView(withId(R.id.btnGreet)).perform(click())

        // 2. VERIFICACIÓN DE INTENT: ¿Se llamó a DetailActivity?
        intended(hasComponent(DetailActivity::class.java.name))
        intended(hasExtra("EXTRA_MESSAGE", "Hola, $textoAEnviar!"))

        // 3. VERIFICACIÓN DE UI: ¿La nueva pantalla muestra el texto?
        onView(withId(R.id.tvReceivedMessage))
            .check(matches(withText("Hola, Gemini!")))
    }
    @Test
    fun alPresionarAtras_regresaAMainActivity() {
        val mainPage = MainPage()
        val detailPage = DetailPage()

        // 1. Ir a la segunda pantalla
        mainPage.typeName("Usuario")
        mainPage.clickGreet()

        // 2. Verificar que llegamos (opcional pero recomendado)
        detailPage.verifyGreeting("Usuario")

        // 3. Simular presionar el botón de atrás del sistema
        pressBack()

        // 4. Verificar que el campo de texto de la primera pantalla vuelve a ser visible
        // Esto confirma que regresamos exitosamente
        mainPage.assertPageIsVisible()
    }
}