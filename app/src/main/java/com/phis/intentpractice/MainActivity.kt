package com.phis.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.contentEdt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {
            val myIntent = Intent(this,FirstActivity::class.java)
            startActivity(myIntent)

        }
        goToSecondBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java )
            startActivity(myIntent)

        }

        goToThirdBtn.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java )
            myIntent.putExtra("contentEdt", contentEdt.text.toString())
            myIntent.putExtra("num", 10)
            startActivity(myIntent)

        }

        goToForthBtn.setOnClickListener {
            val myIntent = Intent(this, FourthActivity::class.java)
            myIntent.putExtras(intent)
            startActivity(myIntent)


        }



    }
}
