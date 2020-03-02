package com.android.abhishekvats.Poochoon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_game_over.*
import android.view.KeyEvent.KEYCODE_BACK



class GameOver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)
        var intent=intent
        corans.text=corans.text.toString()+intent.getIntExtra("Correct",0)
        wroans.text=wroans.text.toString()+intent.getIntExtra("Wrong",0)
        finalscore.text=intent.getStringExtra("Score")
        replay.setOnClickListener {
            intent= Intent(this,Choice::class.java)
            startActivity(intent)
        }
        menu.setOnClickListener {
            intent=Intent(this,Home::class.java)
            startActivity(intent)
        }

    }

}
