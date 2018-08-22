package com.example.kameko.intentsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val Text = intent.getStringExtra("SAMPLE_TEXT")?: "何もなかったみたいだ"
        SampletextView.text = Text



    }
}
