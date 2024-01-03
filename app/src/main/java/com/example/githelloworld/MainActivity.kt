package com.example.githelloworld

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val button = findViewById<Button>(R.id.myButton)
        button.setOnClickListener {
            Toast.makeText(this, "Кнопка натиснута", Toast.LENGTH_LONG).show()

            val buttonTwo = findViewById<Button>(R.id.myButton_two)
            buttonTwo.setOnClickListener {
                Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show()
            }
        }
    }
}