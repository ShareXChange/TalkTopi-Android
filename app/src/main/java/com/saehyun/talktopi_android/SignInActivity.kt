package com.saehyun.talktopi_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

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