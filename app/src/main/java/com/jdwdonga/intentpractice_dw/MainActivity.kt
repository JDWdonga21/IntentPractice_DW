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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        돌아온 이유가 닉네임 변경인가?
        if(requestCode == REQUEST_FOR_NICKNAME){
//            닉네임 변경 버튼을 눌러서 돌아온 것인가?
            if (resultCode == RESULT_OK){
//                실제 첨부된 새 닉네임을 텍스트 뷰에 반영
                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }
    }
}