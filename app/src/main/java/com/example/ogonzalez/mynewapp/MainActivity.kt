package com.example.ogonzalez.mynewapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MESSAGE = "com.example.ogonzalez.mynewapp.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        var intent = Intent(this, DisplayMessageActivity::class.java)
        var editText = findViewById<EditText>(R.id.editText)
        var message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
