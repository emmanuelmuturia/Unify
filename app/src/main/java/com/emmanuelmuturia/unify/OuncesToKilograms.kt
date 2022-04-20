package com.emmanuelmuturia.unify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OuncesToKilograms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ounces_to_kilograms)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForOuncesToKilograms: Button = findViewById(R.id.convertButtonForOunces)
        val buttonResetForOuncesToKilograms: Button = findViewById(R.id.resetButtonForOunces)
        val editTextForOunces: EditText = findViewById(R.id.editTextForOunces)
        val editTextForKilograms: TextView = findViewById(R.id.editTextForKilograms)

        //Link buttons to their respective functions...
        buttonConvertForOuncesToKilograms.setOnClickListener{ouncesToKilograms()}
        buttonResetForOuncesToKilograms.setOnClickListener{resetOuncesToKilograms()}

    }

    private fun ouncesToKilograms() {
        val ounces = findViewById<EditText>(R.id.editTextForOunces).getText().toString()
        val ouncesValue = Integer.parseInt(ounces)
        val kilograms = ((ouncesValue * 0.02834952).toString() + " Kilograms")
        findViewById<TextView>(R.id.editTextForKilograms).text = kilograms
    }

    private fun resetOuncesToKilograms() {
        val myReset = findViewById<EditText>(R.id.editTextForOunces).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForKilograms).setText("")
    }
}