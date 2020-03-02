package com.android.abhishekvats.Poochoon

import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question.*

class Question : AppCompatActivity() {


    var ques=0
    var answer="A"
    var correct=0
    var wrong=0
    var choice=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var intent=intent
        choice=intent.getStringExtra("Choice")
        if(choice=="CurrentAffairs")
            category.text="Current\nAffairs"
        else
        category.text=choice
        quesdisplay(choice)
    }
    fun quesdisplay(choice:String){
        var res:Resources=resources
        var data= res.getStringArray(R.array.History)
        when(choice){

            "History"->        data= res.getStringArray(R.array.History)
            "Sports"->        data= res.getStringArray(R.array.Sports)
            "Chemistry"->        data= res.getStringArray(R.array.Chemistry)
            "Geography"->        data= res.getStringArray(R.array.Geography)
            "Arts"->         data= res.getStringArray(R.array.Arts)
            "CurrentAffairs"->        data= res.getStringArray(R.array.CurrentAffairs)
        }
        question.text=data[ques]
        answer=data[ques+10]
        var options=data[ques+5].split('_')
        a.text=options[0]
        b.text=options[1]
        c.text=options[2]
        d.text=options[3]
    }
    fun ans(v:View){
        var button=findViewById<Button>(v.id)

        if(button.text.toString().substring(0,1)==answer)
        {
            Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
            correct++
            ques++
            score.text="Score="+(score.text.toString().substringAfterLast('=').toInt()+5).toString()
            if(ques==5){
                var over=Intent(this,GameOver::class.java)
                over.putExtra("Correct",correct)
                over.putExtra("Wrong",wrong)
                over.putExtra("Score",score.text.toString())
                startActivity(over)
                finish()
            }
            else
            quesdisplay(choice)
        }
        else
        {
            Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
            wrong++
            ques++
            score.text="Score="+(score.text.toString().substringAfterLast('=').toInt()-1).toString()
            if(ques==5){
                var over=Intent(this,GameOver::class.java)
                over.putExtra("Correct",correct)
                over.putExtra("Wrong",wrong)
                over.putExtra("Score",score.text.toString())
                startActivity(over)
                finish()

            }
            else
            quesdisplay(choice)
        }


    }

}
