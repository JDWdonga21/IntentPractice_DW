package com.jdwdonga.intentpractice_dw


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        
        returnToMain.setOnClickListener { 
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            
            finish() //지금화면을 종료
        }
    }
}