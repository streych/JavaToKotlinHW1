package com.example.javatokotlinhw1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textW = findViewById<TextView>(R.id.textW)
        val textW2 = findViewById<TextView>(R.id.textW2)
        val textW3 = findViewById<TextView>(R.id.textW3)

        textW.text =  person2.title + " " + person2.description
        button.setOnClickListener {
            var sum  = 0
            for (i in 1..10) {
                sum += i
                textW.text = sum.toString()
            }
            sum  = 0
            for (i in 10 downTo 1 step 2){
                sum += i
                textW2.text = sum.toString()
            }
            sum  = 0
            for (i in 0 until 5){
                sum += i
                textW3.text = sum.toString()
            }
        }

    }


    data class PersonClass(val title: String, val description: String)

    val person1 = PersonClass("Pipi", "Porklon")
    val person2 = person1.copy(title = "Pupi")


}