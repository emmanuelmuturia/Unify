package com.emmanuelmuturia.unify

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GallonsToLitres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallons_to_litres)

        //Declare and initialize my EdiTexts and buttons...
        val buttonConvertForGallonsToLitres: Button = findViewById(R.id.convertButtonForGallons)
        val buttonResetForGallonsToLitres: Button = findViewById(R.id.resetButtonForGallons)
        val editTextForGallons: EditText = findViewById(R.id.editTextForGallons)
        val editTextForLitres: TextView = findViewById(R.id.editTextForLitres)

        //Link buttons to their respective functions...
        buttonConvertForGallonsToLitres.setOnClickListener { gallonsToLitres() }
        buttonResetForGallonsToLitres.setOnClickListener { resetContentForGallonsToLitres() }

    }

    // Function to perform the conversion...
    private fun gallonsToLitres() {
        val gallons = findViewById<EditText>(R.id.editTextForGallons).text.toString()
        val gallonsValue = Integer.parseInt(gallons)
        val litres = ((gallonsValue * 4.54609).toString() + " Litres")
        findViewById<TextView>(R.id.editTextForLitres).text = litres
    }

    // Function to clear the content in the respective elements...
    private fun resetContentForGallonsToLitres() {
        val myReset = findViewById<EditText>(R.id.editTextForGallons).text.clear()
        val myReset2 = findViewById<TextView>(R.id.editTextForLitres).setText("")
    }
}