package com.example.quizapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.databinding.ActivityResultBinding

class resultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val correctanswers = intent.getIntExtra("CORRECT_ANSWERS", 0)
        val questionsAnswered = intent.getIntExtra("QUESTIONS_ANSWERED", 0)

        binding.tvResult.text =
            "Correct answers ${correctanswers} " + "Questions answered $questionsAnswered"


        binding.progressBar.isIndeterminate = false
       binding.progressBar.progress = correctanswers * 20
    }
}