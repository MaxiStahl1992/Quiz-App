package de.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.quizapp.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility =View.SYSTEM_UI_FLAG_FULLSCREEN


        val btnStart = findViewById<Button>(R.id.buttonStart)
        val textName = findViewById<TextView>(R.id.name)
        btnStart.setOnClickListener {

            if(textName.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USERNAME, textName.text.toString())
                startActivity(intent)
                finish()
            }

        }


    }
}