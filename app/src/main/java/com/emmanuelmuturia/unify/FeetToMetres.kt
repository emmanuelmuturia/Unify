package com.emmanuelmuturia.unify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FeetToMetres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feet_to_metres)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForFeetToMetres: Button = findViewById(R.id.convertButtonForFeet)
        val buttonResetForFeetToMetres: Button = findViewById(R.id.resetButtonForFeet)
        val editTextForFeet: EditText = findViewById(R.id.editTextForFeet)
        val editTextForMetres: TextView = findViewById(R.id.editTextForMetres)

        //Link buttons to their respective functions...
        buttonConvertForFeetToMetres.setOnClickListener{feetToMetres()}
        buttonResetForFeetToMetres.setOnClickListener{resetContentForFeetToMetres()}

    }

    private fun feetToMetres() {
        val feet = findViewById<EditText>(R.id.editTextForFeet).getText().toString()
        val feetValue = Integer.parseInt(feet)
        val metres = ((feetValue * 0.3048).toString() + " Metres")
        findViewById<TextView>(R.id.editTextForMetres).text = metres
    }

    private fun resetContentForFeetToMetres() {
        val myReset = findViewById<EditText>(R.id.editTextForFeet).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForMetres).setText("")
    }
}