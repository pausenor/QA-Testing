package com.example.kottest1
import org.junit.runner.RunWith
import org.junit.runners.Suite

// 1. Le indicamos a JUnit que use el corredor de Suites
@RunWith(Suite::class)

// 2. Listamos todas las clases de test que queremos incluir, separadas por comas
@Suite.SuiteClasses(
    MainActivityTest::class,
    NavigationTest::class
    // Aquí puedes seguir añadiendo todas las clases que vayas creando
)
class AllProjectTests {
    // Esta clase se deja vacía.
    // Su único propósito es servir de "ancla" para las anotaciones de arriba.
}
