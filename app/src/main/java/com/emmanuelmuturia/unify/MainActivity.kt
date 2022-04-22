package com.emmanuelmuturia.unify

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //We declare our Image Buttons...
        val imageButton1: ImageButton = findViewById(R.id.dollarstoksh)
        val imageButton2: ImageButton = findViewById(R.id.feettometres)
        val imageButton3: ImageButton = findViewById(R.id.ouncestokilograms)
        val imageButton4: ImageButton = findViewById(R.id.gallonstolitres)
        val imageButton5: ImageButton = findViewById(R.id.fahrenheittocelsius)
        val imageButton6: ImageButton = findViewById(R.id.milestokilometres)

        //We write intents to switch between activities during button clicks...
        imageButton1.setOnClickListener {
            val intent1 = Intent(this, DollarsToShillings::class.java)
            startActivity(intent1)
        }

        imageButton2.setOnClickListener {
            val intent2 = Intent(this, FeetToMetres::class.java)
            startActivity(intent2)
        }

        imageButton3.setOnClickListener {
            val intent3 = Intent(this, OuncesToKilograms::class.java)
            startActivity(intent3)
        }

        imageButton4.setOnClickListener {
            val intent4 = Intent(this, GallonsToLitres::class.java)
            startActivity(intent4)
        }

        imageButton5.setOnClickListener {
            val intent5 = Intent(this, FahrenheitToCelsius::class.java)
            startActivity(intent5)
        }

        imageButton6.setOnClickListener {
            val intent6 = Intent(this, MilesToKilometres::class.java)
            startActivity(intent6)
        }

    }
}