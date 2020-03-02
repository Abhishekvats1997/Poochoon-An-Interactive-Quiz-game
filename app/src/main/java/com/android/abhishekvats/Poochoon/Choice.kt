package com.android.abhishekvats.Poochoon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Choice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)


    }
    fun clicked(v: View){

        var button=findViewById<Button>(v.id)
        var category=button.text.toString()
        var intent=Intent(this,Question::class.java)
        intent.putExtra("Choice",category)
        startActivity(intent)
    }
}
