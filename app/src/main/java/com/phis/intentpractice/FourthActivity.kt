package com.phis.intentpractice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)


        goBackMessage.setOnClickListener {

            val input = goBackMessage.text.toString()
            val goBackIntent = Intent()
            goBackIntent.putExtra("message", input)
            setResult(Activity.RESULT_OK, goBackIntent)
            finish()
        }
    }
}
