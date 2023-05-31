package com.saehyun.talktopi_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

enum class SignUpStep {
    ACCOUNT, PASSWORD
}

class SignUpActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FrameLayout
    private lateinit var nextButton: Button
    private var step = SignUpStep.ACCOUNT


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initView()
    }

    private fun initView() {
        fragmentContainer = findViewById(R.id.frame_sign_up)
        nextButton = findViewById(R.id.btn_sign_up_next)

        replaceFragment(SignUpAccountFragment())

        nextButton.setOnClickListener {
            updateStep()
        }
    }

    private fun updateStep() {
        when (step) {
            SignUpStep.ACCOUNT -> {
                step = SignUpStep.PASSWORD
                replaceFragment(SignUpPasswordFragment())
            }

            SignUpStep.PASSWORD -> {
                navigateToMain()
            }
        }
    }

    private fun navigateToMain() {
        Intent(this, MainActivity::class.java).apply {
            startActivity(this)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_sign_up, fragment)
            .commit()
    }
}