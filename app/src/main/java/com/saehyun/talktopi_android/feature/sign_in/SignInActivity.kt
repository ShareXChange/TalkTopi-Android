package com.saehyun.talktopi_android.feature.sign_in

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.saehyun.talktopi_android.feature.main.MainActivity
import com.saehyun.talktopi_android.R

class  SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

    }

    fun navigateToMain(view: View) {
        Intent(applicationContext, MainActivity::class.java).apply {
            startActivity(this)
        }
    }
}