package com.example.kottest1
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.restassured.RestAssured.given
import io.restassured.response.Response
import org.hamcrest.Matchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import io.restassured.response.ValidatableResponse

@RunWith(AndroidJUnit4::class) // Esto permite que corra en el entorno de Android
class ApiTest {

    @Test
    fun verifyApiAndThenUI() {
        val response: Response = given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .`when`()
            .get("/users/1")

        // 2. Convertirla a algo validable (esto es lo que hace .then() internamente)
        val validatableResponse = response.then()

        // 3. Realizar las aserciones
        validatableResponse.statusCode(200)
        validatableResponse.body("username", equalTo("Bret"))
    }
}