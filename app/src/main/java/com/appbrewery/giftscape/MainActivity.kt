package com.appbrewery.giftscape

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnLogin(view: View) {
        val intent = Intent(this, MainActivityHome::class.java)
        startActivity(intent)
    }

    fun btnSignup(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }


}