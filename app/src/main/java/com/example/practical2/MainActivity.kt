package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener{
            addnickname(it)

        }
        findViewById<TextView>(R.id.nickname_test).setOnClickListener {
            updateNickname(it)
        }
    }

    private fun addnickname(view : View){
        val editText : EditText = findViewById(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_test)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
//      TO-DO : Make edit text line invisible
        editText.background = null

    }
    private fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
//      TO-DO : Make edit text line invisible
        editText.background = null
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
    }
}