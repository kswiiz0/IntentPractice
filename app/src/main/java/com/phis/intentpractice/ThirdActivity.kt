package com.phis.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val content = intent.getStringExtra("contentEdt")
        contentTxt.text =content

        goBackBtn.setOnClickListener {
            finish()

        }
    }
}
