package com.example.kameko.intentsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "sampleアプリ"

        Samplebutton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("SAMPLE_TEXT", editText.text.toString())
            startActivity(intent)
        }

        WebButton.setOnClickListener {
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }

    }
}
