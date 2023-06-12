package com.example.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.quiz.databinding.ActivityMathsquizBinding
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList
import java.time.LocalDateTime

class mathsquiz : AppCompatActivity(), View.OnClickListener {
    var binding: ActivityMathsquizBinding?=null


    var getallques:ArrayList<questions> ?= null
    var currentques = 1
    var selectedoption = 0
    var score=0

    var q_adapter:question_adapter ?= null

    var subject_chosen:String? =null

    private val historyviewmodel: history_viewmodel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMathsquizBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        subject_chosen = intent.getStringExtra("subject").toString()

        when(subject_chosen){
            "Maths" -> {
                getallques=  mathsconstants.getques()
                binding?.quizName?.text = "Maths Quiz!"
                currentquestion()
            }

            "Sports" -> {
                getallques=  sports_questions.getques()
                binding?.quizName?.text = "Sports Quiz!"
                currentquestion()
            }

            "GK" -> {
                getallques=GK_questions.getques()
                binding?.quizName?.text = "GK Quiz!"
                currentquestion()
            }

            "Logo" -> {
                getallques=constants.getques()
                binding?.quizName?.text = "Logo Quiz!"
                logocurrentquestion()

            }
        }



        binding?.optoin1Btn?.setOnClickListener(this)
        binding?.optoin2Btn?.setOnClickListener(this)
        binding?.optoin3Btn?.setOnClickListener(this)
        binding?.optoin4Btn?.setOnClickListener(this)
        binding?.SubmitBtn?.setOnClickListener(this)

        q_adapter = question_adapter(getallques!!)
        binding?.mathsRv?.adapter = q_adapter



    }


    fun currentquestion(){

        binding?.SubmitBtn?.text = "Submit"
        defaultoptionssview()
        selectedoption=0

        var question = getallques!![currentques-1]

        binding?.tvQuestion?.text = question.ques
        binding?.tvOption1?.text= question.opiton1
        binding?.tvOption2?.text= question.opiton2
        binding?.tvOption3?.text= question.opiton3
        binding?.tvOption4?.text= question.opiton4

        binding?.ivLogo?.visibility = View.GONE

        question.isselected=true
        q_adapter?.notifyDataSetChanged()


    }

    fun logocurrentquestion() {
        binding?.SubmitBtn?.text = "Submit"
        defaultoptionssview()
        selectedoption=0

        var question = getallques!![currentques - 1]

        binding?.tvQuestion?.text = question.ques
        binding?.tvOption1?.text= question.opiton1
        binding?.tvOption2?.text= question.opiton2
        binding?.tvOption3?.text= question.opiton3
        binding?.tvOption4?.text= question.opiton4

        binding?.ivLogo?.visibility = View.VISIBLE
        binding?.ivLogo?.setImageResource(question.image)

        question.isselected=true
        q_adapter?.notifyDataSetChanged()
    }




    fun defaultoptionssview() {

        binding?.tick1?.visibility = View.INVISIBLE
        binding?.tick2?.visibility = View.INVISIBLE
        binding?.tick3?.visibility = View.INVISIBLE
        binding?.tick4?.visibility = View.INVISIBLE

        binding?.optoin1Btn?.isChecked  = false
        binding?.optoin2Btn?.isChecked  = false
        binding?.optoin3Btn?.isChecked  = false
        binding?.optoin4Btn?.isChecked  = false

        binding?.tick1?.setImageResource(R.drawable.greentick2)
        binding?.tick2?.setImageResource(R.drawable.greentick2)
        binding?.tick3?.setImageResource(R.drawable.greentick2)
        binding?.tick4?.setImageResource(R.drawable.greentick2)
    }



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onClick(view: View?) {
        defaultoptionssview()

        when(view?.id){

            R.id.optoin1_btn ->{
                binding?.optoin1Btn?.isChecked  = true
                selectedoption=1

            }

            R.id.optoin2_btn ->{
                binding?.optoin2Btn?.isChecked  = true
                selectedoption=2
            }

            R.id.optoin3_btn ->{
                binding?.optoin3Btn?.isChecked  = true
                selectedoption=3
            }

            R.id.optoin4_btn ->{
                binding?.optoin4Btn?.isChecked  = true
                selectedoption=4
            }

            R.id.Submit_btn -> {

                var question = getallques!![currentques-1]


                if(selectedoption==0){
                    currentques++

                    if(currentques <= getallques!!.size) {
                        question.isselected=false
                        question.iscompleted=true
                        q_adapter?.notifyDataSetChanged()

                        when(subject_chosen){
                            "Logo" ->{
                                logocurrentquestion()
                            }

                            else -> {
                                currentquestion()
                            }
                        }


                    }
                    else if(currentques > getallques!!.size){

                        historyviewmodel.insert(
                            historyentity(
                                id = null,
                                subject_name = subject_chosen.toString(),
                                score = score,
                                date = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date())

                            )
                        )

                        val intent = Intent(this, finish::class.java)
                        intent.putExtra("score1", score)
                        startActivity(intent)
                    }
                }
                else {

                    var question = getallques!![currentques - 1]

                    if (selectedoption == question.correctans) {
                        score++
                        answerview(selectedoption)
                    }
                    else if(selectedoption != question.correctans){
                        answerview(selectedoption)
                        answerview(question.correctans)
                    }

                    Toast.makeText(this," Now your current score is $score", Toast.LENGTH_SHORT).show()

                    selectedoption = 0
                    if(currentques < getallques!!.size){
                        binding?.SubmitBtn?.text = "Next"
                    }
                    else {
                        binding?.SubmitBtn?.text = "Finish"
                    }
                }

            }


        }
    }


    fun answerview(answer:Int) {

        var question = getallques!![currentques - 1]

        when(answer){

            1-> {
                if (answer == question.correctans) {
                    binding?.tick1?.visibility = View.VISIBLE
                }
                else {
                    binding?.tick1?.visibility = View.VISIBLE
                    binding?.tick1?.setImageResource(R.drawable.redcross2)
                }
            }

            2-> {
                if (answer == question.correctans) {
                    binding?.tick2?.visibility = View.VISIBLE
                }
                else {
                    binding?.tick2?.visibility = View.VISIBLE
                    binding?.tick2?.setImageResource(R.drawable.redcross2)
                }
            }

            3-> {
                if (answer == question.correctans) {
                    binding?.tick3?.visibility = View.VISIBLE
                }
                else {
                    binding?.tick3?.visibility = View.VISIBLE
                    binding?.tick3?.setImageResource(R.drawable.redcross2)
                }
            }

            4-> {
                if (answer == question.correctans) {
                    binding?.tick4?.visibility = View.VISIBLE
                }
                else {
                    binding?.tick4?.visibility = View.VISIBLE
                    binding?.tick4?.setImageResource(R.drawable.redcross2)
                }
            }

        }


    }
}
