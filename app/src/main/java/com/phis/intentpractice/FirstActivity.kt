package com.phis.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goBackBtn.setOnClickListener {
//            잘못된 코드
//            Intent 는 새로 객체를 만드는 효과를 가지기 때문이다.
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            finish()
        }


    }
}
