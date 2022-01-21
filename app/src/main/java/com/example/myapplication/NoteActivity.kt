package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NoteActivity : AppCompatActivity() {

    private lateinit var editTextNote : EditText
    private lateinit var buttonAdd : Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE)
        val text = sharedPreferences.getString("jigari", "jumali")
        init()
        textView.text = text
        buttonAdd.setOnClickListener(){
            var note = editTextNote.text.toString()
            var text = textView.text.toString()
            var result = note + "\n" + text
            textView.text = result
            sharedPreferences.edit().putString("jigari", result).apply()
        }
    }

    private fun init(){
        editTextNote = findViewById(R.id.editTextNote)
        buttonAdd = findViewById(R.id.buttonAdd)
        textView = findViewById(R.id.textView)

    }

}
