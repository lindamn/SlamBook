package com.example.slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.example.slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val fields: Fields = Fields()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        setContentView(R.layout.activity_main)

        setListeners()

        binding.fields = fields
    }

    private fun changeView(view: View){
        binding.apply{
            fields?.name = nameEntry.text.toString()
            fields?.nickname = nicknameEntry.text.toString()
            fields?.age = ageEntry.text.toString()
/*
            nameDone.text = nameEntry.text
            nicknameDone.text = nicknameEntry.text
            ageDone.text = ageEntry.text.toString()*/

            nameDone.visibility = View.VISIBLE
            nicknameDone.visibility = View.VISIBLE
            ageDone.visibility = View.VISIBLE
            thankYou.visibility = View.VISIBLE

            hello.visibility = View.GONE
            name.visibility = View.GONE
            nickname.visibility = View.GONE
            age.visibility = View.GONE
            birthday.visibility = View.GONE
            course.visibility = View.GONE
            mobileNumber.visibility = View.GONE
            color.visibility = View.GONE
            ultimateDream.visibility = View.GONE
            secretCrush.visibility = View.GONE
            message.visibility = View.GONE
            done.visibility = View.GONE

            nameEntry.visibility = View.GONE
            nicknameEntry.visibility = View.GONE
            ageEntry.visibility = View.GONE
            birthdayEntry.visibility = View.GONE
            courseEntry.visibility = View.GONE
            mobileNumberEntry.visibility = View.GONE
            colorEntry.visibility = View.GONE
            ultimateDreamEntry.visibility = View.GONE
            secretCrushEntry.visibility = View.GONE
            messageEntry.visibility = View.GONE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(done.windowToken, 0)

            invalidateAll()
        }
    }

    private fun setListeners(){
        binding.done.setOnClickListener{
            changeView(it)
        }
    }
}
