package com.android.abhishekvats.Poochoon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Loading : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        var handler=Handler()

        var run= Runnable {
            var intent=Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(run,3330)


    }
}
