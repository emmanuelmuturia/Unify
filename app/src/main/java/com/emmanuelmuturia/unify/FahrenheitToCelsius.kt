package com.emmanuelmuturia.unify

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FahrenheitToCelsius : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrenheit_to_celsius)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForFahrenheitToCelsius: Button =
            findViewById(R.id.convertButtonForFahrenheit)
        val buttonResetForFahrenheitToCelsius: Button = findViewById(R.id.resetButtonForFahrenheit)
        val editTextForFahrenheit: EditText = findViewById(R.id.editTextForFahrenheit)
        val editTextForCelsius: TextView = findViewById(R.id.editTextForCelsius)

        //Link buttons to their respective functions...
        buttonConvertForFahrenheitToCelsius.setOnClickListener { fahrenheitToCelsius() }
        buttonResetForFahrenheitToCelsius.setOnClickListener { resetContentForFahrenheitToCelsius() }

    }

    // Function to perform the conversion...
    private fun fahrenheitToCelsius() {
        val fahrenheit = findViewById<EditText>(R.id.editTextForFahrenheit).text.toString()
        val fahrenheitValue = Integer.parseInt(fahrenheit)
        val celsius = ((fahrenheitValue * (-17.22)).toString() + " Celsius")
        findViewById<TextView>(R.id.editTextForCelsius).text = celsius
    }

    // Function to clear the content in the respective elements...
    private fun resetContentForFahrenheitToCelsius() {
        val myReset = findViewById<EditText>(R.id.editTextForFahrenheit).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForCelsius).setText("")
    }
}