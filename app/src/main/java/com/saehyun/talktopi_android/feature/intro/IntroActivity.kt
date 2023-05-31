package com.saehyun.talktopi_android.feature.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.saehyun.talktopi_android.R
import com.saehyun.talktopi_android.feature.sign_in.SignInActivity
import com.saehyun.talktopi_android.feature.sign_up.SignUpActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }

    fun onClickSignUp(view: View) {
        Intent(applicationContext, SignUpActivity::class.java).apply {
            startActivity(this)
        }
    }

    fun onClickSignIn(view: View) {
        Intent(applicationContext, SignInActivity::class.java).apply {
            startActivity(this)
        }
    }
}