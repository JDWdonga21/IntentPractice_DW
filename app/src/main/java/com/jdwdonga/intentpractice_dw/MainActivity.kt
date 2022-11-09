package com.jdwdonga.intentpractice_dw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {
            val myIntent = Intent(this, EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }

        moveToOtherBtn.setOnClickListener {
//            다른 화면으로 이동
//            Intent 활용
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        sendToMessageBtn.setOnClickListener {
//            입력한 메시지 받아오기
            val editMessages = messageEdt.text.toString()

//            Intent 만들기
            val myIntent = Intent(this, MessageActivity::class.java)
//            Intent에 입력한 값 넣기
            myIntent.putExtra("messages", editMessages)
//            Intent 실행
            startActivity(myIntent)
        }
    }
}