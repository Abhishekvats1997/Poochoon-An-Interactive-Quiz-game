package com.android.abhishekvats.Poochoon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        play.setOnClickListener {
            var intent=Intent(this,Choice::class.java)
            startActivity(intent)
        }
        dev.setOnClickListener{
            Toast.makeText(this,"Created By Abhishek Vats",Toast.LENGTH_LONG).show()
        }

    }

}
