package com.example.ogonzalez.mynewapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

public class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        var intent = this.intent
        var message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        var textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}
