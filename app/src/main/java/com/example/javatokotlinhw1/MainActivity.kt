package com.example.javatokotlinhw1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener { button.text = person2.title + " " + person2.description }
    }

    data class PersonClass(val title: String, val description: String)

    val person1 = PersonClass("Pipi", "Porklon")
    val person2 = person1.copy(title = "Pupi")

}