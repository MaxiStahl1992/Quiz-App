package de.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.R

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility =View.SYSTEM_UI_FLAG_FULLSCREEN

        val name = findViewById<TextView>(R.id.tv_username)
        val score = findViewById<TextView>(R.id.tv_score)
        val finish = findViewById<Button>(R.id.btn_finish)

        val username = intent.getStringExtra(Constants.USERNAME)
        name.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTALQUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECTANSWERS,0)

        score.text="Du hast $correctAnswers von $totalQuestions Fragen richtig beantwortet!"

        finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}