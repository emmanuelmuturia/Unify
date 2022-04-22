package com.emmanuelmuturia.unify

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DollarsToShillings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dollars_to_shillings)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForDollarsToShillings: Button = findViewById(R.id.convertButtonForDollars)
        val buttonResetForDollarsToShillings: Button = findViewById(R.id.resetButtonForDollars)
        val editTextForDollars: EditText = findViewById(R.id.editTextForDollars)
        val editTextForShillings: TextView = findViewById(R.id.editTextForShillings)

        //Link buttons to their respective functions...
        buttonConvertForDollarsToShillings.setOnClickListener { dollarsToShillings() }
        buttonResetForDollarsToShillings.setOnClickListener { resetContentForDollarsToShillings() }

    }

    // Function to perform the conversion...
    private fun dollarsToShillings() {
        val dollars = findViewById<EditText>(R.id.editTextForDollars).text.toString()
        val dollarsValue = Integer.parseInt(dollars)
        val shillings = ((dollarsValue * 115.55).toString() + " Shillings")
        findViewById<TextView>(R.id.editTextForShillings).text = shillings
    }

    // Function to clear the content in the respective elements...
    private fun resetContentForDollarsToShillings() {
        val myReset = findViewById<EditText>(R.id.editTextForDollars).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForShillings).setText("")
    }
}