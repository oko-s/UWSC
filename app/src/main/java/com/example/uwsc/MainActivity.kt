package com.example.uwsc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var editTextTextPersonName: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName)
    }
    fun helloKids(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        //val HelloKids = Toast.makeText(this, "Hello Kids!", Toast.LENGTH_SHORT)
        // Get the value of the text view.
        val countString = editTextTextPersonName.text
        // Convert value to a number and increment it
        //var count: Int = Integer.parseInt(countString)
        //count++
        // Display the new value in the text view.
        val helloKids = Toast.makeText(this, "Привет, "+countString +"!", Toast.LENGTH_SHORT)
        helloKids.show()
    }
    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = editTextTextPersonName.text.toString()
// Convert the count to an int
        val count = Integer.parseInt(countString)
// Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}