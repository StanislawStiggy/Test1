package com.stiggy.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        button1.setOnClickListener {
            val intent = Intent(this, Pushkin::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Lermontov::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Rojdestvenky::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, Mayakovsky::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, Esenin::class.java)
            startActivity(intent)
        }

    }
}