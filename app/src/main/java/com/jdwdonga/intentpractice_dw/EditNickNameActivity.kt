package com.jdwdonga.intentpractice_dw

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickListener {
//            입력한 새 닉네임 저장
            val inputNewNickname = newNicknameEdt.text.toString()
//            입력한 닉네임을 가지고 메인으로 복귀
//            입력한 닉네임을 담아주는 용도로 사용할 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}