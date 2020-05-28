package com.phis.intentpractice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.contentEdt

class MainActivity : AppCompatActivity() {


    val REQ_FOR_MESSAGE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {
            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)

        }
        goToSecondBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)

        }

        goToThirdBtn.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("contentEdt", contentEdt.text.toString())
            myIntent.putExtra("num", 10)
            startActivity(myIntent)

        }

        goToForthBtn.setOnClickListener {
            val myIntent = Intent(this, FourthActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_MESSAGE)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_MESSAGE) {
            if (resultCode == Activity.RESULT_OK) {
                val message = data?.getStringExtra("message")
                resultTxt.text = message
            }
        }


    }


}
