package com.example.uwsc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        var randomInt = 0
        // Generate the random number
        //val random: Random
        //val random = Random.nextInt(1,100)
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = Random.nextInt(0,count + 1)
        }
        val textview_random: TextView
        // Display the random number.
        textview_random = findViewById(R.id.textView_label)
        textview_random.text = "RR"


        // Substitute the max value into the string resource

        // for the heading, and update the heading
        //textView_label.text = count.toString()

//        textView_label.text = getString(R.string.random_heading, count)

    }}