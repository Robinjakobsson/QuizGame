package com.example.quizapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.databinding.ActivityQuestionBinding
import kotlin.properties.Delegates
import kotlin.random.Random

class QuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding
    private lateinit var question : QuestionLists
    private lateinit var currentQuestion : Question
    var questionsAnswered = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        question = QuestionLists()
        loadNewQuestion()

        binding.buttonSubmit.setOnClickListener {


            val selectedID = binding.radioGrp.checkedRadioButtonId
            val selectedIndex = when (selectedID) {
                binding.radio1.id -> 0
                binding.radio2.id -> 1
                binding.radio3.id -> 2
                binding.radio4.id -> 3
                else -> -1
            }

            if (selectedIndex == currentQuestion.correctAnswerIndex) {
                Toast.makeText(this,"Correct Answer!",Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this,"Wrong answer",Toast.LENGTH_SHORT).show()
                  }
            questionsAnswered++
            loadNewQuestion()
            if questionsAnswered = 5
            }
        }
    private fun getQuestion() : Question {
        val randomIndex = Random.nextInt(question.generalKnowledgeQuestions.size)
        currentQuestion = question.generalKnowledgeQuestions[randomIndex]
       return currentQuestion
    }

    private fun setQuestion(question: Question) {
        binding.tvQuestion.text = question.questionText
        binding.radio1.text = question.options[0]
        binding.radio2.text = question.options[1]
        binding.radio3.text = question.options[2]
        binding.radio4.text = question.options[3]


        binding.radioGrp.clearCheck()
    }

    private fun loadNewQuestion () {
        val newQuestion = getQuestion()
        setQuestion(newQuestion)
    }






}
