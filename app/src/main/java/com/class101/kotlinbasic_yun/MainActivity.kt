package com.class101.kotlinbasic_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
            // 중괄호 안에 있는 내용을 실행.
            Log.d("메인화면", "버튼이 클릭됨")
            Log.e("메인화면","에러관련 로그")

//            i는 인포
        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은버튼눌림", Toast.LENGTH_SHORT).show()
        }
   }
}