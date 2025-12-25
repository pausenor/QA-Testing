package com.example.kottest1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val btnGreet = findViewById<Button>(R.id.btnGreet)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)

        btnGreet.setOnClickListener {
            val name = etName.text.toString()
            //if (name.isNotEmpty()) {
              //  tvGreeting.text = "Hola, $name!"
            //}
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("EXTRA_MESSAGE", "Hola, $name!")
            }
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}