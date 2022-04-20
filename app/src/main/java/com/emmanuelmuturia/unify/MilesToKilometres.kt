package com.emmanuelmuturia.unify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MilesToKilometres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miles_to_kilometres)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForMilesToKilometres: Button = findViewById(R.id.convertButtonForMiles)
        val buttonResetForMilesToKilometres: Button = findViewById(R.id.resetButtonForMiles)
        val editTextForMiles: EditText = findViewById(R.id.editTextForMiles)
        val editTextForKilometres: TextView = findViewById(R.id.editTextForKilometres)

        //Link buttons to their respective functions...
        buttonConvertForMilesToKilometres.setOnClickListener{milesToKilometres()}
        buttonResetForMilesToKilometres.setOnClickListener{resetContentForMilesToKilometres()}

    }

    private fun milesToKilometres() {
        val miles = findViewById<EditText>(R.id.editTextForMiles).getText().toString()
        val milesValue = Integer.parseInt(miles)
        val kilometres = ((milesValue * 1.609344).toString() + " Kilometres")
        findViewById<TextView>(R.id.editTextForKilometres).text = kilometres
    }

    private fun resetContentForMilesToKilometres() {
        val myReset = findViewById<EditText>(R.id.editTextForMiles).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForKilometres).setText("")
    }
}