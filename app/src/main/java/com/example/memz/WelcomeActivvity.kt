package com.example.memz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.View

class WelcomeActivvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_activvity)
    }

    fun clickToEnter(view: View)
    {
        val intent = Intent(this,MainActivity::class.java)

        startActivity(intent)
    }

}