package com.emmanuelmuturia.unify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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
        buttonConvertForDollarsToShillings.setOnClickListener{dollarsToShillings()}
        buttonResetForDollarsToShillings.setOnClickListener{resetContentForDollarsToShillings()}

    }

    private fun dollarsToShillings() {
        val dollars = findViewById<EditText>(R.id.editTextForDollars).getText().toString()
        val dollarsValue = Integer.parseInt(dollars)
        val shillings = ((dollarsValue * 115.55).toString() + " Shillings")
        findViewById<TextView>(R.id.editTextForShillings).text = shillings
    }

    private fun resetContentForDollarsToShillings() {
        val myReset = findViewById<EditText>(R.id.editTextForDollars).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForShillings).setText("")
    }
}